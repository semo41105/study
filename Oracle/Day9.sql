--SEQUENCE : 시퀀스 --
--1, 2, 3, 4, 5.... 숫자 데이터를 자동으로 카운트하는 객체


/*
       CREATE SEQUENCE 시퀀스명
       [INCREMENT BY 숫자] : 다음 값에 대한 증감 수치
                    --INCREMENT BY 5 -> 5씩 증가
                    --INCREMENT BY -5 -> 5씩 감소
       [START WITH 숫자 ] : 시작값, 생략시 1부터 시작 
       [MAXVALUE 숫자] : 최대값 설정
       [MINVALUE 숫자] : 최소값 설정
       [CYCLE | NOCYCLE] : 값의 순환 여부(1~100 ~ .. 1~100)
       [CACHE 바이트 크기 | NOCACHE] : 값을 미리 구해놓고 다음 값을 반영할 때 활용하는 설정
                         --기본값 20Byte | 최소값 2Byte
       []안의 내용들은 생략 가능
*/

CREATE SEQUENCE SEQ_EMPID
START WITH 300
INCREMENT BY 5
MAXVALUE 310
NOCYCLE
NOCACHE;

SELECT SEQ_EMPID.NEXTVAL FROM DUAL;

--현재 시퀀스 확인
SELECT SEQ_EMPID.CURRVAL FROM DUAL;

--시퀀스 정보가 들어있는 데이터사전
SELECT * FROM USER_SEQUENCES;

--시퀀스 삭제하기
DROP SEQUENCE SEQ_EMPID;

--
CREATE SEQUENCE SEQ_EID
START WITH 300
INCREMENT BY 1
MAXVALUE 10000
NOCYCLE
NOCACHE;

SELECT * FROM USER_SEQUENCES;


SELECT * FROM EMPLOYEE;

INSERT INTO EMPLOYEE
VALUES(SEQ_EID.NEXTVAL, '홍길동','121212-2123412','YN0114@GMAIL.COM','01012341234',
                                                     'D2','J7','S1',5000000, 0.1,200,SYSDATE, NULL, DEFAULT);


--실습 1.
--D9 부서에 J7직급의 사원 4명을 추가
--EMP_ID는 시퀀스를 활용하고 나머지 컬럼값은 임의로 작성하여 추가.

INSERT INTO EMPLOYEE
VALUES(SEQ_EID.NEXTVAL, '이순신','121212-2534257','YJ@GMAIL.COM','01012344321',
                                                     'D9','J7','S1',5000000, 0.1,200,SYSDATE, NULL, DEFAULT);

INSERT INTO EMPLOYEE
VALUES(SEQ_EID.NEXTVAL, '강감찬','150154-2534257','YC@GMAIL.COM','01012344321',
                                                     'D9','J7','S1',5000000, 0.1,300,SYSDATE, NULL, DEFAULT);

INSERT INTO EMPLOYEE
VALUES(SEQ_EID.NEXTVAL, '김아무개','121142-2534257','KA@GMAIL.COM','01012344321',
                                                     'D9','J7','S1',5000000, 0.1,100,SYSDATE, NULL, DEFAULT);

INSERT INTO EMPLOYEE
VALUES(SEQ_EID.NEXTVAL, '최아무개','121212-2534257','CA@GMAIL.COM','01012344321',
                                                     'D9','J7','S1',5000000, 0.1,500,SYSDATE, NULL, DEFAULT);

SELECT * FROM EMPLOYEE;

--CYCLE : 시퀀스의 값이 최소값/최대값에 도달했을 때 다시 반대의 값부터 시작하는 옵션

CREATE SEQUENCE SEQ_CYCLE
START WITH 200
INCREMENT BY 10
MAXVALUE 230
MINVALUE 15
CYCLE
NOCACHE;


SELECT SEQ_CYCLE.NEXTVAL FROM DUAL;
SELECT SEQ_CYCLE.NEXTVAL FROM DUAL;
SELECT SEQ_CYCLE.NEXTVAL FROM DUAL;
SELECT SEQ_CYCLE.NEXTVAL FROM DUAL; --최대값 도달
SELECT SEQ_CYCLE.NEXTVAL FROM DUAL;
--CYCLE 설정 후 최대값 도달시 다시 최소값부터 시작한다.


--CACHE / NOCACHE
--CACHE : 다음값에 대한 연산들을 그때그때 수행하지 않고 미리 계산해놓은 것.
--NOCACHE : 수행값을 그때그때 처리하는 것.

CREATE SEQUENCE SEQ_CACHE
START WITH 100
INCREMENT BY 1
CACHE 20
NOCYCLE;
--시퀀스 작성 시 순서는 크게 중요하지 않음.

SELECT SEQ_CACHE.NEXTVAL FROM DUAL;

SELECT * FROM USER_SEQUENCES;





--INDEX : 인덱스--
--조회처리속도를 향상시키기 위한 객체

--장점 : 검색속도가 향상된다.
--단점 : 테이블의 내용이 자주 변경되는 테이블이라면 인덱스를 매번 다시 계산해야 하기 때문에
--           오히려 성능 저하
--           인덱스를 저장하기 위한 별도의 공간을 할당



--인덱스 생성
--CREATE [UNIQUE] INDEX 인덱스명
--ON 테이블명(컬럼명[, 컬럼명 ...])

SELECT * FROM USER_IND_COLUMNS;

SELECT ROWID, EMP_ID, EMP_NAME FROM EMPLOYEE;


--인덱스 종류
--1. 고유 인덱스(UNIQUE INDEX)
--2. 비고유 인덱스(NOUNIQUE INDEX)
--3. 단일 인덱스(SINGLE INDEX)
--4. 결합 인덱스(COMPOSITE INDEX)
--5. 함수기반 인덱스(FUNCTION BASED INDEX)

--고유 인덱스
--  인덱스 생성 시 고유값(UNIQUE)을 기준으로 생성하는 인덱스
--  오라클에서 PRIMARY KEY 제약조건을 사용하면 자동으로 생성하는 인덱스

CREATE UNIQUE INDEX IND_EMP_NO
ON EMPLOYEE(EMP_NO);


--ORA-01408: such column list already indexed
--만약 생성하고자 하는 인덱스가 이미 존재한다면 생성 불가
CREATE UNIQUE INDEX IND_EMP_ID
ON EMPLOYEE(EMP_ID);

SELECT * FROM USER_IND_COLUMNS WHERE TABLE_NAME = 'EMPLOYEE';

--ORA-01452: cannot CREATE UNIQUE INDEX; duplicate keys found
--테이블에서 사용하는 컬럼의 값이 중복 값이 존재할 경우
--UNIQUE INDEX로 생성할 수 없다.
CREATE UNIQUE INDEX IDX_DEPT_CODE
ON EMPLOYEE(DEPT_CODE);

--NON_UNIQUE INDEX--
--내가 자주 사용하는 컬럼을 인덱스로 구성하여
--검색속도를 향상시키기 위한 인덱스
CREATE INDEX IDX_DEPT_CODE
ON EMPLOYEE(DEPT_CODE);

SELECT EMP_NAME, DEPT_CODE, JOB_CODE
FROM EMPLOYEE
WHERE DEPT_CODE = 'D6';


--결합 인덱스
CREATE INDEX IDX_DEPT
ON DEPARTMENT(DEPT_ID, DEPT_TITLE);

SELECT * FROM DEPARTMENT;

SELECT DEPT_ID, DEPT_TITLE FROM DEPARTMENT
WHERE DEPT_ID != 'D1'
       AND DEPT_TITLE != '기술지원부';

--함수 기반 인덱스
--조회시에 자주 사용하는 함수식이 있다면
--해당 함수식을 인덱스에 반영하여 생성

CREATE INDEX IDX_EMP_SAL_CAL
ON EMPLOYEE ( (SALARY * NVL(BONUS,0) + SALARY ) * 12 );

SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ( (SALARY * NVL(BONUS,0) + SALARY ) * 12) >10000000;

--DML 작업 후에는
--해당 INDEX를 다시 생성해야 한다.

--인덱스 새로고침
ALTER INDEX IDX_DEPT REBUILD;


--PL/SQL
