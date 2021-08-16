--ORACLE Object--
--오라클 객체--

--VIEW(뷰)--
/*
    --관리자 계정에서 뷰 생성 권한 부여하기
    GRANT CREATE VIEW TO KH;
    --권한 뺏기
    REVOKE CREATE VIEW FROM KH;
*/

--VIEW : SELECT를 실행한 결과(Result Set) 화면을 담는 객체
--SELECT 쿼리문장 자체를 저장. 실질적으로 데이터를 담은 건 아님.

--사용방법
--CREATE  [OR REPLACE]  VIEW  뷰이름
--AS  서브쿼리(뷰에서 확인할 SELECT)

CREATE VIEW V_EMP
AS SELECT EMP_ID, EMP_NAME, DEPT_CODE FROM EMPLOYEE;


SELECT * FROM V_EMP;


CREATE OR REPLACE VIEW V_EMP(사번, 이름, 부서, 직급)
AS SELECT EMP_ID, EMP_NAME, DEPT_CODE, JOB_CODE
      FROM EMPLOYEE;

SELECT * FROM V_EMP;

--생성한 뷰의 정보 확인
SELECT * FROM USER_VIEWS;


--실습1.
--사번, 이름, 직급명, 부서명, 근무지역을 조회하고
--그 결과를 V_RESULTSET_EMP라는 뷰를 만들어
--뷰를 통해 그 결과를 조회하여 확인하시오.

--[1]V_RESULTSET_EMP라는 뷰 생성
CREATE OR REPLACE VIEW V_RESULTSET_EMP
AS SELECT EMP_ID 사번, EMP_NAME 이름, JOB_NAME 직급명, 
DEPT_TITLE 부서명, NATIONAL_CODE 근무지역
FROM EMPLOYEE
LEFT JOIN JOB USING(JOB_CODE)
LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
LEFT JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE);

SELECT * FROM V_RESULTSET_EMP;

--[2]만들어진 VIEW를 활용하여 사번이 '205'인 직원을 조회
SELECT * FROM V_RESULTSET_EMP
WHERE 사번 = 205;

--VIEW는 SELECT 쿼리를 저장하고 있기 때문에
--원본 테이블의 값이 변경되었을 때 뷰도 함께 변경되어 조회된다.
UPDATE EMPLOYEE
SET EMP_NAME = '정준하'
WHERE EMP_ID='205';

SELECT * FROM EMPLOYEE WHERE EMP_ID = '205';

SELECT * FROM V_RESULTSET_EMP WHERE 사번 = '205';

--뷰 삭제
DROP VIEW V_RESULTSET_EMP;

SELECT * FROM USER_VIEWS;

---
SELECT * FROM V_EMP;

--뷰에 컬럼별 별칭을 붙일 수 있다.
CREATE OR REPLACE VIEW V_EMP(사번, 사원명, 부서코드)
AS
SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE;

--뷰에는 연산 결과도 포함하여 저장 가능
--사번, 이름, 성별, 근무년수 조회

--1) 서브쿼리
SELECT EMP_ID, EMP_NAME,
               DECODE(SUBSTR(EMP_NO,8,1),1,'남성','여성'),
               EXTRACT(YEAR FROM SYSDATE) - EXTRACT(YEAR FROM HIRE_DATE)
FROM EMPLOYEE;               

--2) 뷰 생성
CREATE OR REPLACE VIEW V_EMP(사번, 이름, 성별, 근무년)
AS
SELECT EMP_ID, EMP_NAME,
               DECODE(SUBSTR(EMP_NO,8,1),1,'남성','여성'),
               EXTRACT(YEAR FROM SYSDATE) - EXTRACT(YEAR FROM HIRE_DATE)
FROM EMPLOYEE;  

SELECT * FROM V_EMP;

----

--뷰를 이용하여 데이터 삽입, 수정, 삭제

CREATE OR REPLACE VIEW V_JOB
AS
SELECT * FROM JOB;

SELECT * FROM V_JOB;
--뷰를 통한 데이터 추가
INSERT INTO V_JOB
VALUES('J8','인턴');

SELECT * FROM V_JOB;
SELECT * FROM JOB;
--뷰를 통한 데이터 수정
UPDATE V_JOB
SET JOB_NAME = '알바'
WHERE JOB_CODE = 'J8';

SELECT * FROM V_JOB;
SELECT * FROM JOB;

--뷰를 통한 데이터 삭제
DELETE V_JOB
WHERE JOB_CODE = 'J8';

SELECT * FROM V_JOB;
SELECT * FROM JOB;

/*

뷰에서 데이터 추가, 수정, 삭제 불가능한 6가지 상황
1. 뷰에 정의되지 않은 컬럼을 수정할 경우(뷰에서는 보이지 않는)
2. 뷰에서 보이지 않는 컬럼 중 NOT NULL 제약조건을 가진 컬럼이 있을 경우
3. 산술연산이 적용된 컬럼일 경우
4. JOIN을 통해 여러 테이블을 참조할 경우(단, 조회한 테이블의 정보 중 기본키 요소가 한개일 경우는 가능)
5. DISTINCT를 사용하여 실제 데이터의 내용이 명확하지 않을 경우
6. 그룹함수나 GROUP BY 구문을 사용한 쿼리일 경우

*/

--뷰에 정의되어 있지 않는 컬럼을 수정할 경우
CREATE OR REPLACE VIEW V_JOB
AS SELECT JOB_CODE FROM JOB;

SELECT * FROM V_JOB;

--SQL 오류: ORA-00913: too many values
INSERT INTO V_JOB
VALUES('J8','인턴');

--SQL 오류: ORA-00904: "JOB_NAME": invalid identifier
UPDATE V_JOB
SET JOB_NAME = '인턴'
WHERE JOB_CODE = 'J7';

--산술표현
CREATE OR REPLACE VIEW V_EMP_SAL
AS
SELECT EMP_ID, EMP_NAME, SALARY,
               (SALARY + SALARY*NVL(BONUS,0)) * 12 연봉
               FROM EMPLOYEE;

SELECT * FROM V_EMP_SAL;

--SQL 오류: ORA-01733: virtual column not allowed here
INSERT INTO V_EMP_SAL
VALUES(901, '문정아' , 3000000, 40000000);


COMMIT;

--JOIN을 통해 VIEW 정보를 수정
CREATE OR REPLACE VIEW V_JOIN_EMP
AS
SELECT EMP_ID, EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

SELECT * FROM V_JOIN_EMP;

--SQL 오류: ORA-01776: cannot modify more than one base table through a join view
INSERT INTO V_JOIN_EMP
VALUES(904, '민성수','기술지원부');

--SQL 오류: ORA-01779: cannot modify a column which maps to a non key-preserved table
UPDATE V_JOIN_EMP
SET DEPT_TITLE = '기술지원부'
WHERE EMP_ID = 218;

--데이터 삭제는 가능
DELETE FROM V_JOIN_EMP
WHERE DEPT_TITLE = '기술지원부';

SELECT * FROM V_JOIN_EMP;
SELECT * FROM DEPARTMENT;
SELECT * FROM EMPLOYEE WHERE DEPT_CODE = 'D8';

ROLLBACK;


--DISTINCT를 사용하는 경우
CREATE OR REPLACE VIEW V_DEPT_EMP
AS
SELECT DISTINCT DEPT_CODE
FROM EMPLOYEE;

SELECT * FROM V_DEPT_EMP;

--SQL 오류: ORA-01732: data manipulation operation not legal on this view
--중복 제거한 채로 DEPT_CODE만 가져왔음. 
INSERT INTO V_DEPT_EMP
VALUES('D0');

--SQL 오류: ORA-01732: data manipulation operation not legal on this view
DELETE FROM V_DEPT_EMP
WHERE DEPT_CODE = 'D9';

--그룹함수
--ORA-00998: must name this expression with a column alias
--함수식이 컬럼으로 표현이 될 경우 반드시 별칭을 붙여줘야 한다.
CREATE OR REPLACE VIEW V_GROUP_DEPT
AS
SELECT DEPT_CODE, SUM(SALARY) 합계, TRUNC(AVG(SALARY), -4) 평균
FROM EMPLOYEE
GROUP BY DEPT_CODE;

SELECT * FROM V_GROUP_DEPT;

--SQL 오류: ORA-01733: virtual column not allowed here
INSERT INTO V_GROUP_DEPT
VALUES('D10',500000,500000);

--SQL 오류: ORA-01732: data manipulation operation not legal on this view
UPDATE V_GROUP_DEPT
SET DEPT_CODE = 'D10'
WHERE DEPT_CODE = 'D5';

--SQL 오류: ORA-01732: data manipulation operation not legal on this view
DELETE FROM V_GROUP_DEPT
WHERE DEPT_CODE = 'D6';



--VIEW 생성 시 설정 옵션
--OR REPLACE : 기존에 있던 동일한 이름의 뷰가 있을 경우 덮어씌우고, 없다면 새로 만든다.
--FORCE / NO FORCE : 서브쿼리에 사용되는 테이블이 존재하지 않아도 뷰를 강제로 생성할 것인지 설정.
--WITH CHECK / READ ONLY :
--            CHECK : 옵션을 설정한 컬럼의 값을 바꾸지 못하게 막는 설정
--            READ ONLY : Q뷰에 사용되는 어떠한 컬럼도 뷰를 통해서 변경하지 못하게 막는 설정

--FORCE : 존재하지 않는 테이블이라도 뷰를 강제로 생성하기
CREATE OR REPLACE FORCE VIEW V_EMP
AS
SELECT T_CODE, T_NAME, T_CONTENT
FROM TEST_TABLE;

--ORA-04063: view "KH.V_EMP" has errors
SELECT * FROM V_EMP;

DROP VIEW V_EMP;

--NO FORCE : 생성하려는 뷰의 테이블이 존재하지 않는다면 뷰를 생성하지 않는다.

--ORA-00942: table or view does not exist
CREATE OR REPLACE /*NOFORCE*/ VIEW V_EMP
AS
SELECT T_CODE, T_NAME, T_CONTENT
FROM TEST_TABLE;

--기본값은 NOFORCE

--WITH CHECK : 뷰에 존재하는 컬럼을 추가하거나 수정하지 못하게 막는 뷰의 옵션

--1)
CREATE OR REPLACE VIEW V_EMP
AS
SELECT * FROM EMPLOYEE
WITH CHECK OPTION;

SELECT * FROM V_EMP;

--SQL 오류: ORA-32575: Explicit column default is not supported for modifying views
INSERT INTO V_EMP
VALUES(810, '제예솔', '101010-1234567','TEST@KH.OR.KR','01012344321','D1',
                'J7','S1',8000000,0.2,200,SYSDATE, NULL, DEFAULT);

--DELETE
DELETE FROM V_EMP
WHERE EMP_ID = '222';

SELECT * FROM V_EMP;

ROLLBACK;


--WITH READ ONLY : 데이터의 입력, 수정, 삭제 모두를 막는 옵션
CREATE OR REPLACE VIEW V_EMP
AS
SELECT * FROM EMPLOYEE
WITH READ ONLY;

--SQL 오류: ORA-32575: Explicit column default is not supported for modifying views
INSERT INTO V_EMP
VALUES(810, '제예솔', '101010-1234567','TEST@KH.OR.KR','01012344321','D1',
                'J7','S1',8000000,0.2,200,SYSDATE, NULL, DEFAULT);

--SQL 오류: ORA-42399: cannot perform a DML operation on a read-only view
DELETE FROM V_EMP
WHERE EMP_ID = '222';

----------
--ROLE--
----------
--> GRANT를 통해 부여했던 건 권한을 묶어둔 ROLE이라는 객체

--##ORACLE DB 설치시 기본 제공되는 ROLE
--CONNECT : 사용자가 데이터 베이스에 접속 가능하도록 하기 위한 권한이 있는 ROLE
--RESOURCE : 사용자가 객체(테이블, 인덱스..) 를 생성하기 위한 시스템 권한이 제공되는 ROLE
--DBA : 시스템 자원을 무제한적으로 사용가능, 시스템 관리를 하기 위한 모든 권한을 제공하는 ROLE

SELECT * FROM ROLE_SYS_PRIVS
--WHERE ROLE = 'RESOURCE';
WHERE ROLE = 'CONNECT';



--------------------------------
--관리자계정------------------
SELECT * FROM ROLE_SYS_PRIVS WHERE ROLE = 'DBA';

--사용자 ROLE 생성 / 부여 실습
--TESTER/TESTER 생성, 

CREATE USER TESTER IDENTIFIED BY TESTER
DEFAULT TABLESPACE USERS;

SELECT * FROM DBA_TABLESPACES;
SELECT * FROM USER_USERS;

GRANT CONNECT, RESOURCE TO TESTER;

--특정 사용자에게 특정 테이블에 대한 조회 권한 부여하기
--시스템 계정으로 ROLE 생성
CREATE ROLE EMP_ROLE;

--시스템 계정으로 생성된 ROLE에 권한 부여
GRANT SELECT ON KH.EMPLOYEE TO EMP_ROLE;

--TESTER 계정에 EMP_ROLE 부여
GRANT EMP_ROLE TO TESTER;

--TESTER 계정에서 EMPLOYEE 테이블 확인
SELECT * FROM KH.EMPLOYEE;

--권한 회수하기
REVOKE EMP_ROLE FROM TESTER;
