--Sub Query--
--주가 되는 메인쿼리 안에서
--조건이나 하나의 검색을 위한 또하나의 쿼리를
--추가하는 기법


--단일행 서브쿼리
--결과값이 1개 나오는 서브쿼리

--ex) 최소 급여를 받는 사원의 정보 조회
SELECT MIN(SALARY)
FROM EMPLOYEE;
--1380000
SELECT *
FROM EMPLOYEE
WHERE SALARY = 1380000;


SELECT *
FROM EMPLOYEE
WHERE SALARY = (SELECT MIN(SALARY)
                                               FROM EMPLOYEE);
                                               
                                            
--다중 행 서브쿼리
--결과 값이 여러줄 나오는 서브쿼리

--각 직급별 최소 급여
SELECT JOB_CODE, MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

SELECT *
FROM EMPLOYEE
WHERE SALARY IN ( 3700000, 1380000,3400000);

SELECT *
FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY)
                                       FROM EMPLOYEE
                                       GROUP BY JOB_CODE); --샐러리 하나만 있으니 인 안에도 하나만 있어야 함.


--다중 열 다중 행 서브쿼리
SELECT *
FROM EMPLOYEE
WHERE(JOB_CODE, SALARY) IN(SELECT JOB_CODE, MIN(SALARY)
                                                          FROM EMPLOYEE
                                                           GROUP BY JOB_CODE);

--퇴사한 여직원과 같은 직급, 같은 부서에 근무하는
--직원들의 정보를 조회하시오
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE = (SELECT DEPT_CODE
                                           FROM EMPLOYEE
                                            WHERE ENT_YN='Y')
                AND JOB_CODE = (SELECT JOB_CODE
                                                  FROM EMPLOYEE
                                                  WHERE ENT_YN='Y')
                AND EMP_NAME != (SELECT EMP_NAME
                                                     FROM EMPLOYEE
                                                     WHERE ENT_YN='Y');


--방금 풀어본 문제를 다중행다중열로 변경
SELECT * FROM EMPLOYEE
WHERE (DEPT_CODE, JOB_CODE ) = (SELECT DEPT_CODE, JOB_CODE
                                                                     FROM EMPLOYEE
                                                                     WHERE ENT_YN='Y')
                 AND EMP_NAME <> (SELECT EMP_NAME
                                                        FROM EMPLOYEE
                                                        WHERE ENT_YN='Y');
                                                        
                                                        
                                                        
--서브쿼리의 사용 위치
--SELECT, FROM, WHERE, GROUP BY, HAVING, ORDER BY, JOIN
--DML: INSERT, UPDATE, DELETE
--DDL: CREATE TABLE, CREATE VIEW
--어느 위치든 사용이 가능하다.


--FROM 위치에 사용되는 서브쿼리
--테이블명으로 직접 조회하는 대신 서브쿼리의 ResultSet을 활용하여
--데이터를 조회할 때 사용할 수 있다.
--FROM 구문의 서브쿼리를 Inline View(인라인뷰)라고 부른다.

SELECT *
FROM(
             SELECT EMP_ID, EMP_NAME, DEPT_TITLE, JOB_NAME
             FROM EMPLOYEE
             JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
             JOIN JOB USING(JOB_CODE)
             );
             
             

--TON-N 분석 조회--
--가장 조건에 부합하는 내용을 순위화 하여 특정 순번까지 조회하는 방식


--ROWNUM: 데이터를 조회할 때 각 행의 번호를 매겨주는 함수
SELECT ROWNUM, EMP_NAME, SALARY
FROM EMPLOYEE;

SELECT ROWNUM, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ROWNUM <6;

--연습
--급여 기준으로 가장 높은 급여를 받는 사원
--상위 5명 조회하여
--사번, 사원명, 급여를 출력
SELECT ROWNUM, EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
ORDER BY SALARY DESC; --FROM에서 번호가 매겨지기 때문에 순서가 섞인다.

--연습2
--ROWNUM 기준 6~10번째 직원의
--사번, 사원명 조회하기
SELECT ROWNUM, EMP_ID, EMP_NAME
FROM EMPLOYEE
WHERE ROWNUM > 0;

--ROWNUM은 반드시 1부터 값을 증가시키기 때문에
--1을 초과한 순서를 먼저 계산할 수 없다.


--실습1
--급여 평균이 3위 안에 드는 부서의
--부서코드, 부서명, 급여평균을 조회

--1. 내부에서 정렬할 인라인 뷰 쿼리 만들기
SELECT DEPT_CODE, DEPT_TITLE, TRUNC(AVG(SALARY), -3) "평균"
FROM EMPLOYEE E, DEPARTMENT D
WHERE DEPT_CODE = DEPT_ID
GROUP BY DEPT_CODE, DEPT_TITLE
ORDER BY 3 DESC;

--2. ROWNUM과 인라인 뷰를 반영하여 상위 3개 조회
SELECT ROWNUM, DEPT_CODE, DEPT_TITLE, 평균
FROM (SELECT DEPT_CODE, DEPT_TITLE, TRUNC(AVG(SALARY), -3) "평균"
              FROM EMPLOYEE E, DEPARTMENT D
              WHERE DEPT_CODE = DEPT_ID
              GROUP BY DEPT_CODE, DEPT_TITLE
              ORDER BY 3 DESC
              )
WHERE ROWNUM <4;


--RANK(), DENSE_RANK()
--RANK() : 동일한 순번이 있을 경우 이후의 순번은 이전과 동일한 순번의 개수만큼 
--                   건너뛰고 순번을 매기는 함수
--1
--2
--2
--4

SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) 순위
FROM EMPLOYEE;
              
SELECT *
FROM (
               SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) 순위
               FROM EMPLOYEE
             )
WHERE 순위 <4;             



--ENSE_RANK() : 동일한 순번이 있을 경우 이후 순번에 영향을 미치지 않는 함수
--1
--2
--2
--3
SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC) 순위
               FROM EMPLOYEE;


--실습 2
--EMPLOYEE 테이블에서
--보너스를 포함한 연봉이 가장 높은 사원 상위 5명을
--RANK()함수를 활용하여 조회하시오
--사번, 사원명, 부서명, 직급명, 입사일, 연봉(보너스 포함)

--직원들의 연봉 계산하는 서브쿼리에 사용할 SELECT
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, JOB_NAME, HIRE_DATE,
               ( (SALARY)*(NVL(BONUS,0)+1) )*12 연봉,
            RANK() OVER(ORDER BY ( (SALARY)*(NVL(BONUS,0)+1))*12 DESC ) 순위
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE=DEPT_ID)
JOIN JOB USING(JOB_CODE);

--상위 5명
SELECT *
FROM( SELECT EMP_ID, EMP_NAME, DEPT_TITLE, JOB_NAME, HIRE_DATE,
               ( (SALARY)*(NVL(BONUS,0)+1) )*12 연봉,
            RANK() OVER(ORDER BY ( (SALARY)*(NVL(BONUS,0)+1))*12 DESC ) 순위
            FROM EMPLOYEE
           JOIN DEPARTMENT ON(DEPT_CODE=DEPT_ID)
             JOIN JOB USING(JOB_CODE)
            )
WHERE 순위 <6;


--실습3
--부서별 급여 합계가 전체 부서 급여 총합의
--20%보다 많은 부서의
--부서명과 부서 급여 합계를 조회

--1) 일반 단일행 서브쿼리
SELECT SUM(SALARY) * 0.2
FROM EMPLOYEE;

SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) > (
                                                 SELECT SUM(SALARY) * 0.2
                                                 FROM EMPLOYEE
                                                 );

--2) 인라인 뷰 활용
--서브쿼리
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--인라인뷰
SELECT DEPT_CODE, SUMDAL
FROM (
              SELECT DEPT_CODE, SUM(SALARY) SUMSAL
              FROM EMPLOYEE
              GROUP BY DEPT_CODE
              )
WHERE SUMSAL > (SELECT SUM(SALARY)*0.2 FROM EMPLOYEE);


--상호 연관 쿼리 : 상관쿼리
--메인쿼리가 사용하는 컬럼, 계산식 등을 서브쿼리에 적용하여
--서브쿼리 실행 시 메인쿼리의 값도 함꼐 사용하는 방식


--사원의 직급에 따른 급여 평균보다 많이 받는 사원의 정보 조회
SELECT JOB_CODE, TRUNC(AVG(SALARY), -3)
FROM EMPLOYEE
GROUP BY JOB_CODE;


SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE E
WHERE SALARY > (
                                       SELECT AVG(SALARY)
                                       FROM EMPLOYEE E2
                                       WHERE E.JOB_CODE = E2.JOB_CODE
                                       );
                                       
--스칼라 서브쿼리
--단일행 + 상관쿼리
--SELECT, WHERE, ORDER BY 절에 사용
--보통은 SELECT 절에 많이 쓰인다. 그래서 SELECT LIST라고도 한다.


--연습(SELECT)
--모든 사원의 사번, 사원명, 관리자 사번, 관리자명을 조회
--관리자가 없을 경우 '없음'이라고 표시
SELECT EMP_ID, EMP_NAME, MANAGER_ID,
              NVL ( (SELECT EMP_NAME 
                           FROM EMPLOYEE M 
                        WHERE E.MANAGER_ID = M.EMP_ID ), '없음') 관리자이름
FROM EMPLOYEE E               
ORDER BY 관리자이름, EMP_ID;

--연습(WHERE)
--자신이 속한 직급의 평균 급여보다 많이 받는 사원의
--이름, 직급명, 급여정보 조회
SELECT EMP_NAME, JOB_NAME, SALARY
FROM EMPLOYEE E
JOIN JOB J ON(E.JOB_CODE = J.JOB_CODE)
WHERE SALARY>(
                                    SELECT AVG(SALARY)
                                    FROM EMPLOYEE E2
                                    WHERE E.JOB_CODE = E2.JOB_CODE
                                    );

--연습(ORDER BY)
--모든 직원의 사번, 사원명, 부서코드를 조회
--부서명 내림차순으로 정렬하는 ORDER BY를 서브쿼리 형식으로 구현

--일반 JOIN
SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
ORDER BY DEPT_TITLE DESC;


--스칼라 서브쿼리
SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE E
ORDER BY(
                       SELECT DEPT_TITLE
                       FROM DEPARTMENT D
                       WHERE E.DEPT_CODE = D.DEPT_ID
                  ) DESC NULLS LAST;
                  


--DDL--
--CREATE : 데이터베이스의 객체를 생성하는 DDL

--CREATE 객체형태 객체명 (관련 내용)

--[[ SYSTEM 계정에서 실행 ]]--
--TEST 계정 생성
CREATE USER TEST IDENTIFIED BY TEST;
GRANT CONNECT, RESOURCE TO TEST;
--[[ SYSTEM 계정에서 실행 ]]--



--[[ TEST 계정에서 실행 ]]--
--테이블 생성시
--CREATE TABLE 테이블명 (
--       컬럼명 자료형(길이)  제약조건,
--       컬럼명 자료형(길이)  제약조건
--);


--제약조건 : 테이블에 데이터를 저장하고자 할 때 지켜야 하는 규칙
--NOT NULL - NULL값을 허용하지 않는다.
--UNIQUE - 중복값을 허용하지 않는다.
--CHECK - 지정한 입력 값 이외에 다른 값은 허용하지 않는다.
--PRIMARY KEY - (NOT NULL + UNIQUE)
--                    테이블 내에서 해당 행을 인식할 수 있는 고유의 값, 유일한 값,
--                    테이블 내에서 단 1개만 존재.
-- FORIEGN KEY - 다른 테이블에 저장된 값을 연결지어서 
--                             참조로 가져오는 데이터에 지정하는 제약조건



--테이블 생성!
--데이터를 저장하기 위한 틀(객체)
--2차원 표 형태
CREATE TABLE MEMBER(
          MEMBER_NO NUMBER,                             --회원 번호
          MEMBER_ID VARCHAR2(20),                  --회원 아이디
          MEMBER_PWD VARCHAR2(20),             --회원 비밀번호
          MEMBER_NAME VARCHAR2(15)          --회원 이름
);

SELECT * FROM MEMBER;

--테이블의 각 컬럼에 주석 달기
--COMMENT ON COLUMN 테이블명.컬럼명 IS '주석내용';
COMMENT ON COLUMN MEMBER.MEMBER_NO IS '회원 번호';
COMMENT ON COLUMN MEMBER.MEMBER_ID IS '회원 아이디';
COMMENT ON COLUMN MEMBER.MEMBER_PWD IS '회원 비밀번호';
COMMENT ON COLUMN MEMBER.MEMBER_NAME IS '회원이름';

--데이터 사전
--현재 접속한 사용자 계정이 보유한 테이블 목록
SELECT * FROM USER_TABLES;

--테이블 정보 확인하기
DESC MEMBER;

SELECT * 
FROM USER_TAB_COLUMNS
WHERE TABLE_NAME = 'MEMBER';

SELECT *
FROM ALL_COL_COMMENTS
WHERE TABLE_NAME = 'MEMBER';

-------------------------------------------------------------
--제약조건(CONSTRAINTS)--
--테이블을 생성할 때 각 컬럼에 값을 기록하는 것에 대한 제약사항을 설정할 때 사용하는 조건

--현재 사용자 계정에 관련된 제약조건을 확인
SELECT * FROM USER_CONSTRAINTS;

SELECT * FROM USER_CONS_COLUMNS;


--[NOT NULL]--
--'널 값을 허용하지 않는다'
--반드시 값을 기록해야 하는 경우
--데이터 삽입/수정/삭제 시에 NULL값을 허용하지 않도록 컬럼 작성시 함께 설정

DROP TABLE USER_NOCONS;

CREATE TABLE USER_NOCONS(
     USER_NO NUMBER,
     USER_ID VARCHAR2(20),
     USER_PWD VARCHAR2(30),
     USER_NAME VARCHAR2(15),
     GENDER VARCHAR2(3),
     PHONE VARCHAR2(14),
     EMAIL VARCHAR2(30)
     );
     
--테이블에 값 추가하기
--DML : INSERT
INSERT INTO USER_NOCONS
VALUES(1,'USER01','PASS01','유관순','여','010-1234-5678','LEE123@GMAIL.COM');

SELECT * FROM USER_NOCONS;

INSERT INTO USER_NOCONS
VALUES(2, NULL,NULL,NULL,'여',NULL,NULL);

SELECT * FROM USER_NOCONS;



CREATE TABLE USER_NOT_NULL(
      USER_NO NUMBER NOT NULL,
      USER_ID VARCHAR2(20) NOT NULL,
      USER_PWD VARCHAR2(30) NOT NULL,
      USER_NAME VARCHAR2(15) NOT NULL,
      GENDER VARCHAR2(3),
      PHONE VARCHAR2(14),
      EMAIL VARCHAR2(30)
);

SELECT * FROM USER_NOT_NULL;

INSERT INTO USER_NOT_NULL
VALUES(1, 'USER01','PASS01','유관순','여','010-1234-5678', 'LEE123@GMAIL.COM');

SELECT * FROM USER_NOT_NULL;


INSERT INTO USER_NOT_NULL
VALUES(2,NULL,NULL,NULL,'여',NULL,NULL);

INSERT INTO USER_NOT_NULL
VALUES(2,'USER02','PASS02','홍길동',NULL,NULL,NULL);

SELECT * FROM USER_NOT_NULL;


--UNIQUE 제약조건--
--중복을 허용하지 않는 제약조건
--만약 중복되는 값으로 추가/수정을 하지 못하게 막는 제약조건

INSERT INTO USER_NOT_NULL
VALUES(1, 'USER01','PASS01','이지민','여','010-1234-5678', 'LEE123@GMAIL.COM');

SELECT * FROM USER_NOT_NULL;

CREATE TABLE USER_UNIQUE(
   USER_NO NUMBER,
   USER_ID VARCHAR2(20) UNIQUE,    --컬럼레벨 제약조건
   USER_PWD VARCHAR2(30),
   USER_NAME VARCHAR2(15)
   );

INSERT INTO USER_UNIQUE
VALUES(1,'USER01','PASS01','이지민');

INSERT INTO USER_UNIQUE
VALUES(1,'USER01','1234','홍길동');

SELECT * FROM USER_UNIQUE;

SELECT * 
FROM USER_CONSTRAINTS C1, USER_CONS_COLUMNS C2
WHERE C1.CONSTRAINT_NAME = C2.CONSTRAINT_NAME
     AND C1.TABLE_NAME = 'USER_UNIQUE';
     
     
     
     
-- P: primary key
-- C: check(not null)
-- U: uniqur
-- R: foregin key ( reference)

--테이블 레벨에서 제약조건 설정
CREATE TABLE USER_UNIQUE2(
   USER_NO NUMBER,
 --USER_ID VARCHAR2(20) UNIQUE,  --UNIQUE,      --컬럼레벨 제약조건
   USER_ID VARCHAR2(20),
   USER_PWD VARCHAR2(30),
   USER_NAME VARCHAR2(15),
   UNIQUE(USER_ID)            --컬럼이 모두 작성된 후에 별도로 작성하는 제약조건을
                                                --테이블 레벨 제약조건이라고 한다.
   );
