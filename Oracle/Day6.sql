--Day6--

--UNIQUE 제약조건을 여러 컬럼에 적용하기
--D1 --200
--D1 --201

--D2 --200
--D2 --201

CREATE TABLE USER_UNIQUE3(
      USER_NO NUMBER,
      USER_ID VARCHAR2(20),
      USER_PWD VARCHAR2(30),
      USER_NAME VARCHAR2(15),
      UNIQUE(USER_NO, USER_ID)
      );
      
INSERT INTO USER_UNIQUE3
VALUES(1, 'USER01','PASS01','LEE');

INSERT INTO USER_UNIQUE3
VALUES(1, 'USER02','PASS02','KIN'); --유니크 제약조건이 걸린 두 개의 컬럼을 하나처럼 생각한 것.

INSERT INTO USER_UNIQUE3
VALUES(2, 'USER01','PASS03','HONG');

INSERT INTO USER_UNIQUE3
VALUES(2, 'USER02','PASS04','PARK');

SELECT * FROM USER_UNIQUE3;


-- 제약조건에 이름 설정하기
CREATE TABLE CONS_NAME(
NO1 NUMBER CONSTRAINT NN_NO1 NOT NULL,
DATA1 VARCHAR2(20) CONSTRAINT UN_DATA1 UNIQUE,
DATA2 VARCHAR2(20),
CONSTRAINT UK_DATA2 UNIQUE(DATA2)
);

SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'CONS_NAME';

--CHECK 제약조건--
--컬럼에 값을 기록할 때 지정한 값 이외에는 값이 기록되지 않도록 범위를 제한하는 조건
--CHECK (컬럼명  비교연산자  값)

CREATE TABLE USER_CHECK(
   NO NUMBER,
   ID VARCHAR2(20),
   PW VARCHAR2(30),
   NAME VARCHAR2(15),
   GENDER CHAR(3) CHECK(GENDER IN('남','여'))
);
   
INSERT INTO USER_CHECK
VALUES(1,'USER01','PASS01','LEE','남');

--ORA-12899: value too large for column "TEST"."USER_CHECK"."GENDER" (actual: 6, maximum: 3)
INSERT INTO USER_CHECK
VALUES(2,'USER02','PASS02','KIN','남자');

--ORA-02290: check constraint (TEST.SYS_C007051) violated
INSERT INTO USER_CHECK
VALUES(2,'USER02','PASS02','KIN','M');


INSERT INTO USER_CHECK
VALUES(2,'USER02','PASS02','KIN','여');



--CHECK 제약조건에 부등호로 표기
CREATE TABLE TEST_CHECK2(
   TEST_DATA NUMBER,
   CONSTRAINT CK_TEST_DATA CHECK(TEST_DATA>0)
);   

INSERT INTO TEST_CHECK2 VALUES(10);
--ORA-02290: check constraint (TEST.CK_TEST_DATA) violated
INSERT INTO TEST_CHECK2 VALUES(-10);

SELECT * FROM TEST_CHECK2;



CREATE TABLE TEST_CHECK3(
    CPRICE NUMBER,
    CDATE DATE,
    CONSTRAINT CK_TEST3_CPRICE CHECK ( CPRICE BETWEEN 1 AND 999999 ),
    CONSTRAINT CK_TEST3_CDATE CHECK(CDATE >= TO_DATE('2020/01/01', 'YYYY/MM/DD'))
);

--제약조건 여러개 설정
CREATE TABLE TEST_DOUBLE_CONS(
   TEST_NO NUMBER NOT NULL UNIQUE,
   TEST_NO2 NUMBER NOT NULL
);   
SELECT * FROM USER_CONS_COLUMNS
WHERE TABLE_NAME = 'TEST_DOUBLE_CONS';


--PRIMARY KEY 제약조건--
--'기본키 제약조건'
--테이블 내에서 한행한행을 식별하기 위한 고유의 값을 가지는 컬럼
--NOT NULL, UNIQUE 제약조건을 함께 걸어준다.
--테이블 전체에 각 데이터들 간의 식별자 역할을 수행시키는 제약조건

CREATE TABLE USER_PK_TABLE(
   USER_NO NUMBER CONSTRAINT PK_USER_NO PRIMARY KEY,
   USER_ID VARCHAR2(20) UNIQUE,
   USER_PWD VARCHAR2(30) NOT NULL,
   USER_NAME VARCHAR2(15) NOT NULL,
   GENDER CHAR(3) CHECK(GENDER IN ('남', '여'))
);

SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'USER_PK_TABLE';


INSERT INTO USER_PK_TABLE
VALUES(1,'USER01','PASS01','LEE','남');

INSERT INTO USER_PK_TABLE
VALUES(2,'USER02','PASS02','KIM','여');

--ORA-00001: unique constraint (TEST.PK_USER_NO) violated
INSERT INTO USER_PK_TABLE
VALUES(1,'USER03','PASS03','PARK','남');

--ORA-01400: cannot insert NULL into ("TEST"."USER_PK_TABLE"."USER_NO")
INSERT INTO USER_PK_TABLE
VALUES(NULL,'USER03','PASS03','PARK','남');


--기본키 제약 조건을 여러 컬럼에 적용
CREATE TABLE USER_PK_TABLE2(
   USER_NO NUMBER,
   USER_ID VARCHAR2(20) UNIQUE,
   USER_PWD VARCHAR2(30) NOT NULL,
   USER_NAME VARCHAR2(15) NOT NULL,
   GENDER CHAR(3) CHECK(GENDER IN ('남', '여')),
   CONSTRAINT PK_USER_NO2 PRIMARY KEY(USER_NO, USER_ID)
);

--1, 'USER01' ==> 성공
--2, 'USER02' ==> 성공
--1, 'USER03' ==> 성공
--2, 'USER01' ==> 실패!

--DROP은 객체를 삭제
DROP TABLE MEMBER;

--실습 1.
--MEMBER 테이블을 생성하여
--사용자 정보를 받을 수 있는 테이블 객체를 만들되,

--회원 번호는 NUMBER형태로 기본키 설정하고,
--회원 아이디는 중복 불가에 필수 입력 사항으로,
--회원 비밀번호는 필수 입력 사항,
--회원 이름, 성별('M', 'F'),
--회원 이메일, 회원 연락처, 회원 생년월일 정보를
--받을 수 있는 컬럼을 가진 테이블을 생성하시오.

--단, 각 컬럼의 길이는 직접 판단하고,
--위에 생성된 테이블 기준으로
--회원 정보를 최소 5개 이상 삽입하여 확인하시오.
CREATE TABLE MEMBER(
MB_NO NUMBER CONSTRAINT PK_MEMBER PRIMARY KEY,
MB_ID VARCHAR2(15) NOT NULL UNIQUE,
MB_PWD VARCHAR2(30) NOT NULL,
MB_NAME VARCHAR2(30),
MB_GENDER CHAR(3) CHECK(MB_GENDER IN('M','F')),
MB_EMAIL VARCHAR2(30),
MB_PHONE VARCHAR2(14),
MB_BDAY DATE
);
 
COMMENT ON COLUMN MEMBER.MB_NO IS '회원번호';

INSERT INTO MEMBER
VALUES(1,'USER01','PASS01','LEE','F', 'NO_1@GMAIL.COM', 
'010-1234-1234', TO_DATE(101010, 'RRMMDD') );

--FOREIGN KEY 제약조건--
--외래키, 외부키, 참조키
--다른 테이블의 컬럼값을 참조하여(REFERENCE)하여
--참조하는 테이블의 값만을 허용한다.
--해당 제약조건을 통해 다른 테이블과의 관계(RELATIONSHIP)가 형성된다.

--컬럼 레벨
--  REFERENCES 참조할테이블명[(참조할 컬럼명) ] [삭제 옵션]

--테이블 레벨
--  FOREIGN KEY(적용할 컬럼) REFERENCES 참조할테이블명 [(참조할 컬럼명)] [삭제 옵션]

--참조할 컬럼명이 생략될 경우
--대상 테이블의 기본키를 참조할 컬럼으로 가져온다.
--참조하고자 하는 컬럼은 반드시 PRIMARY KEY이거나 UNIQUE 제약조건이 걸려있어야 한다.

DROP TABLE USER_GRADE;

CREATE TABLE USER_GRADE(
   GRADE_CODE NUMBER PRIMARY KEY,
   GRADE_NAME VARCHAR2(30) NOT NULL
);   

INSERT INTO USER_GRADE VALUES(1, '일반회원');
INSERT INTO USER_GRADE VALUES(2, 'SILVER');
INSERT INTO USER_GRADE VALUES(3, 'GOLD');
INSERT INTO USER_GRADE VALUES(4, 'VIP');

SELECT * FROM USER_GRADE;

DROP TABLE USER_FOREIGN_KEY;

CREATE TABLE USER_FOREIGN_KEY(
  USER_NO NUMBER PRIMARY KEY,
  USER_ID VARCHAR2(20),
  USER_PWD VARCHAR2(30),
  USER_NAME VARCHAR2(15),
  GENDER CHAR(1) CHECK(GENDER IN ('M','F') ),
  GRADE_CODE NUMBER,
  CONSTRAINT FK_GRADE_CODE FOREIGN KEY(GRADE_CODE)
  REFERENCES USER_GRADE(GRADE_CODE)
  --포리언 키 앞까진 생략 가능-- 
    );
    
INSERT INTO USER_FOREIGN_KEY VALUES(1, '123','321','LEE','F',2);
INSERT INTO USER_FOREIGN_KEY VALUES(2, 'ABC','CBA','KIM','M',4);
INSERT INTO USER_FOREIGN_KEY VALUES(3, '456','654','PARK','M',1);
INSERT INTO USER_FOREIGN_KEY VALUES(4, 'DEF','FED','CHO','F',3);
INSERT INTO USER_FOREIGN_KEY VALUES(5, 'QWE','EWQ','JANG','F',1);

SELECT * FROM USER_FOREIGN_KEY;

--ORA-02291: integrity constraint (TEST.FK_GRADE_CODE) violated - parent key not found
INSERT INTO USER_FOREIGN_KEY VALUES(6, 'QWE','EWQ','JANG','F',10);

SELECT * FROM USER_FOREIGN_KEY;

INSERT INTO USER_GRADE VALUES(10, 'MANAGER');
INSERT INTO USER_FOREIGN_KEY VALUES(6, 'QWE','EWQ','JANG','F',10);

SELECT * FROM USER_FOREIGN_KEY;

SELECT *
FROM USER_FOREIGN_KEY
JOIN USER_GRADE USING(GRADE_CODE);

--삭제 옵션
--ORA-02292: integrity constraint (TEST.FK_GRADE_CODE) violated - child record found
DELETE FROM USER_GRADE
WHERE GRADE_CODE = 10;

--참조되고(USER_GRADE) 있는 원본 테이블의 컬럼값이 삭제될 때
--참조하고(USER_FOREIGN_KEY) 있는 값을 어떻게 처리할 것인지 설정하는 옵션

--일반적으로 원본 컬럼 내용을 삭제하고자 할 때 외래키로 사용중인 자식이 존재한다면 함부로 삭제할 수 없다.

--1. 부모 컬럼을 삭제할 때 자식을 NULL로 변경하기
--ON DELETE SET NULL
--2. 부모 컬럼을 삭제할 때 관련된 자식도 함께 삭제하기
--ON DELETR CASCADE

-----
--ORA-02449: unique/primary keys in table referenced by foreign keys
DROP TABLE USER_FOREIGN_KEY;
DROP TABLE USER_GRADE;


CREATE TABLE USER_GRADE(
   GRADE_CODE NUMBER PRIMARY KEY,
   GRADE_NAME VARCHAR2(30) NOT NULL
);   

INSERT INTO USER_GRADE VALUES(1, '일반회원');
INSERT INTO USER_GRADE VALUES(2, 'SILVER');
INSERT INTO USER_GRADE VALUES(3, 'GOLD');
INSERT INTO USER_GRADE VALUES(4, 'VIP');

SELECT * FROM USER_GRADE;


--1. USER_FOREIGN_KEY + ON DELETE SET NULL

CREATE TABLE USER_FOREIGN_KEY(
  USER_NO NUMBER PRIMARY KEY,
  USER_ID VARCHAR2(20),
  USER_PWD VARCHAR2(30),
  USER_NAME VARCHAR2(15),
  GENDER CHAR(1) CHECK(GENDER IN ('M','F') ),
  GRADE_CODE NUMBER,
  CONSTRAINT FK_GRADE_CODE FOREIGN KEY(GRADE_CODE)
  REFERENCES USER_GRADE(GRADE_CODE) ON DELETE SET NULL
    );
    
INSERT INTO USER_FOREIGN_KEY VALUES(1, '123','321','LEE','F',2);
INSERT INTO USER_FOREIGN_KEY VALUES(2, 'ABC','CBA','KIM','M',4);
INSERT INTO USER_FOREIGN_KEY VALUES(3, '456','654','PARK','M',1);
INSERT INTO USER_FOREIGN_KEY VALUES(4, 'DEF','FED','CHO','F',3);
INSERT INTO USER_FOREIGN_KEY VALUES(5, 'QWE','EWQ','JANG','F',1);

SELECT * FROM USER_FOREIGN_KEY;

COMMIT;

DELETE FROM USER_GRADE
WHERE GRADE_CODE = 4;

SELECT * FROM USER_FOREIGN_KEY;

ROLLBACK;

--2. USER_FOREIGN_KEY + ON DELETE CASCADE
DROP TABLE USER_FOREIGN_KEY;

CREATE TABLE USER_FOREIGN_KEY(
  USER_NO NUMBER PRIMARY KEY,
  USER_ID VARCHAR2(20),
  USER_PWD VARCHAR2(30),
  USER_NAME VARCHAR2(15),
  GENDER CHAR(1) CHECK(GENDER IN ('M','F') ),
  GRADE_CODE NUMBER,
  CONSTRAINT FK_GRADE_CODE FOREIGN KEY(GRADE_CODE)
  REFERENCES USER_GRADE(GRADE_CODE) ON DELETE CASCADE
    );
    
INSERT INTO USER_FOREIGN_KEY VALUES(1, '123','321','LEE','F',2);
INSERT INTO USER_FOREIGN_KEY VALUES(2, 'ABC','CBA','KIM','M',4);
INSERT INTO USER_FOREIGN_KEY VALUES(3, '456','654','PARK','M',1);
INSERT INTO USER_FOREIGN_KEY VALUES(4, 'DEF','FED','CHO','F',3);
INSERT INTO USER_FOREIGN_KEY VALUES(5, 'QWE','EWQ','JANG','F',1);

SELECT * FROM USER_FOREIGN_KEY;

SELECT * FROM USER_GRADE;

DELETE FROM USER_GRADE
WHERE GRADE_CODE = 2;




-----------------------------------------
SELECT * FROM EMPLOYEE;

--SUBQUERY를 활용한 테이블 만들기
--SUBQUERY를 사용하여 테이블을 생성할 경우
--컬럼명, 데이터 타입, 값, NOT NULL은 복사가능
--하지만 다른 제약조건은 복사되지 않는다.

SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'EMPLOYEE';

CREATE TABLE EMPLOYEE_COPY
AS SELECT * FROM EMPLOYEE;

SELECT*FROM EMPLOYEE_COPY;

--테이블의 형식만 복사하기
--저장된 값 제외

CREATE TABLE EMPLOYEE_COPY2
AS SELECT * FROM EMPLOYEE WHERE 1=2;

SELECT*FROM EMPLOYEE_COPY2;

CREATE TABLE EMPLOYEE_COPY3
AS SELECT EMP_ID, EMP_NAME, DEPT_CODE "DEPT" FROM EMPLOYEE;

SELECT*FROM EMPLOYEE_COPY3;

--기본값 설정하기
CREATE TABLE DEFAULT_TABLE(
  COL1 VARCHAR2(30) DEFAULT '없음',
  COL2 DATE DEFAULT SYSDATE
 );

INSERT INTO DEFAULT_TABLE
VALUES( DEFAULT, DEFAULT );

SELECT * FROM DEFAULT_TABLE;

--- 제약조건을 테이블 생성 후 추가하는 DDL
-- [ALTER] --
-- ALTER    TABLE   테이블명  ADD 제약조건~ : PRIMARY KEY, FOREIGN KEY, UNIQUE, CHECK
-- ALTER    TABLE   테이블명  MODIFY  컬럼명  NOT NULL

ALTER TABLE EMPLOYEE ADD FOREIGN KEY(DEPT_CODE) REFERENCES DEPARTMENT;
ALTER TABLE EMPLOYEE ADD FOREIGN KEY(SAL_LEVEL) REFERENCES SAL_GRADE;

ALTER TABLE EMPLOYEE ADD CHECK(ENT_YN IN ('Y','N'));
ALTER TABLE EMPLOYEE ADD UNIQUE(EMP_NO);

ALTER TABLE DEPARTMENT ADD FOREIGN KEY(LOCATION_ID) REFERENCES LOCATION;

-----------------------------------------------------------------------------------------------------------
--DML(데이터 조작언어)
--INSERT, UPDATE, DELETE, SELECT
--[CRUD]--
--C(CREATE) : INSERT  /  데이터 추가
--R(READ)     : SELECT /  데이터 조회
--U(UPDATE) : UPDATE / 데이터 수정
--D(DELETE)  : DELETE / 데이터 삭제


--INSERT : 새로운 행을 특정 테이블에 추가하는 명령어

--[사용형식]
--1. 특정 컬럼에 값을 추가하는 방법
--INSERT INTO 테이블명 (컬럼명, ...) VALUES(값1, 값2, ...);

--2. 모든 컬럼에 값을 추가하는 방법
--INSERT INTO 테이블명 VALUES(값1, 값2, ..);

DESC EMPLOYEE;

--컬럼을 명시하여 데이터 추가
INSERT INTO EMPLOYEE (EMP_ID, EMP_NAME, EMP_NO, EMAIL, PHONE, DEPT_CODE, JOB_CODE,
                                                 SAL_LEVEL, SALARY, BONUS, MANAGER_ID, HIRE_DATE, 
                                                 ENT_DATE, ENT_YN)
VALUES(500, '이소근', '700101-1234567','LEESG@KH.OR.KR','01011112222','D1','J7','S4',3100000,
                 0.1, '200', SYSDATE, NULL, DEFAULT);

SELECT * FROM EMPLOYEE
WHERE EMP_ID = 500;

--컬럼을 생략하고 사용하기
INSERT INTO EMPLOYEE
VALUES(900, '밥보검', '510101-1234567','bob_bg@kh,or,kr','01022223344','D1','J7','S3',4300000,
                 0.2,'200',SYSDATE,NULL,DEFAULT);

SELECT * FROM EMPLOYEE
WHERE EMP_ID = 900;

COMMIT;

--INSERT + SUBQUERY
CREATE TABLE EMP_01(
   EMP_ID NUMBER,
   EMP_NAME VARCHAR2(20),
   DEPT_TITLE VARCHAR2(40)
   );
   
   
INSERT INTO EMP_01(
                SELECT EMP_ID, EMP_NAME, DEPT_TITLE
                FROM EMPLOYEE
                LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
);

SELECT * FROM EMP_01;


