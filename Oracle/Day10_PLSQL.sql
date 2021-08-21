--IF문--
--1. IF ~ THEN ~ END IF~
/*
                  IF 조건 THEN
                          조건을 만족할 경우 처리 구문;
                  END IF;        
*/
BEGIN
         IF '&이름' = '홍길동' THEN
                  DBMS_OUTPUT.PUT_LINE('홍길동입니다!!!');
         END IF;
END;       
/

SET SERVEROUTPUT ON;


--문제
--사원 번호를 입력받아서 사원의 사번, 이름, 급여, 보너스율을 출력
--대표님인 경우 '대표님이십니다.'를 출력
DECLARE
          EMP_ID EMPLOYEE.EMP_ID%TYPE;
          EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
          SALARY EMPLOYEE.SALARY%TYPE;
          BONUS EMPLOYEE.BONUS%TYPE;
          JOB_CODE EMPLOYEE.JOB_CODE%TYPE;
BEGIN
          SELECT EMP_ID, EMP_NAME, SALARY, NVL(BONUS, 0) , JOB_CODE
          INTO EMP_ID, EMP_NAME, SALARY, BONUS, JOB_CODE
          FROM EMPLOYEE
          WHERE EMP_ID = &EMP_ID;
          
          DBMS_OUTPUT.PUT_LINE(EMP_ID|| ' ' ||EMP_NAME|| ' ' ||SALARY|| ' ' || BONUS);

          IF (JOB_CODE = 'J1')
          THEN DBMS_OUTPUT.PUT_LINE('대표님이십니다.');
          END IF;
END;
/






--2. IF ~ THEN ~ ELSE ~ END IF;
/*
    IF 조건
    THEN 조건을 만족할 경우 처리 구문;
    ELSE 조건을 만족하지 않을 경우 처리 구문;
    END IF;
*/

--사원번호를 입력받았을 때 사번, 이름, 부서명, 직급명, 소속을 출력
--그 때, 소속은 J1은 대표, 그 외에는 일반 직원으로 출력

DECLARE
          EMP_ID EMPLOYEE.EMP_ID%TYPE;
          EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
         DEPT_TITLE DEPARTMENT.DEPT_TITLE%TYPE;
          JOB_CODE EMPLOYEE.JOB_CODE%TYPE; 
          JOB_NAME JOB.JOB_NAME%TYPE;
          EMP_TEAM VARCHAR2(20);
BEGIN
          SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME, DEPT_TITLE
          INTO EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME, DEPT_TITLE
          FROM EMPLOYEE
          LEFT JOIN DEPARTMENT D ON (DEPT_CODE = DEPT_ID)
          JOIN JOB USING(JOB_CODE)
          WHERE EMP_ID = &EMP_ID;
          
          IF JOB_CODE = 'J1' THEN EMP_TEAM := '대표';
          ELSE EMP_TEAM := '일반직원';
          END IF;   
          
          DBMS_OUTPUT.PUT_LINE('사번: ' || EMP_ID);
          DBMS_OUTPUT.PUT_LINE('이름: ' || EMP_NAME);
          DBMS_OUTPUT.PUT_LINE('부서명: ' || DEPT_TITLE);
          DBMS_OUTPUT.PUT_LINE('직급명: ' || JOB_NAME);
          DBMS_OUTPUT.PUT_LINE('소속: ' || EMP_TEAM);
                   
END;
/



--3. IF ~ THEN ~ ELSIF ~ ELSE END IF;
/*
   IF 조건1 THEN
        조건1를 만족할 경우;
   ELSIF 조건2 THEN
        조건2를 만족할 경우;
   ELSIF 조건3 THEN
           조건3을 만족할 경우;
   ELSE
           조건을 만족하지 않을 경우;
   END IF;
*/

--위에서 J2인 경우는 소속을 '임원진'이라고 출력
DECLARE
          EMP_ID EMPLOYEE.EMP_ID%TYPE;
          EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
         DEPT_TITLE DEPARTMENT.DEPT_TITLE%TYPE;
          JOB_CODE EMPLOYEE.JOB_CODE%TYPE; 
          JOB_NAME JOB.JOB_NAME%TYPE;
          EMP_TEAM VARCHAR2(20);
BEGIN
          SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME, DEPT_TITLE
          INTO EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME, DEPT_TITLE
          FROM EMPLOYEE
          LEFT JOIN DEPARTMENT D ON (DEPT_CODE = DEPT_ID)
          JOIN JOB USING(JOB_CODE)
          WHERE EMP_ID = &EMP_ID;
           
        IF JOB_CODE = 'J1' THEN EMP_TEAM := '대표';
   ELSIF JOB_CODE = 'J2' THEN EMP_TEAM := '임원진';
   ELSE EMP_TEAM := '일반직원';
   END IF;
          
          DBMS_OUTPUT.PUT_LINE('사번: ' || EMP_ID);
          DBMS_OUTPUT.PUT_LINE('이름: ' || EMP_NAME);
          DBMS_OUTPUT.PUT_LINE('부서명: ' || DEPT_TITLE);
          DBMS_OUTPUT.PUT_LINE('직급명: ' || JOB_NAME);
          DBMS_OUTPUT.PUT_LINE('소속: ' || EMP_TEAM);
                   
END;
/

--문제
--사번을 입력받은 후 급여에 따라 등급을 나누어 출력하도록 하시오
--그때 출력값은 사번, 이름, 급여, 급여등급을 출력하시오
--500만원 이상(그외)  : A
--400만원 ~ 499만원 : B
--300만원 ~ 399만원 : C
--200만원 ~ 299만원 : D
--100만원 ~ 199만원 : E
DECLARE
          EMP_ID EMPLOYEE.EMP_ID%TYPE;
          EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
          SALARY EMPLOYEE.SALARY%TYPE; 
          SAL_GRADE VARCHAR2(20);
BEGIN
          SELECT EMP_ID, EMP_NAME, SALARY
          INTO EMP_ID, EMP_NAME, SALARY
          FROM EMPLOYEE
          WHERE EMP_ID = &EMP_ID;
         
           SALARY := SALARY / 10000;
           IF SALARY BETWEEN 0 AND 99 THEN SAL_GRADE := 'F';
           ELSIF SALARY BETWEEN 100 AND 199  THEN SAL_GRADE := 'E';
           ELSIF SALARY BETWEEN 200 AND 299  THEN SAL_GRADE := 'D';
           ELSIF SALARY BETWEEN 300 AND 399  THEN SAL_GRADE := 'C';
           ELSIF SALARY BETWEEN 400 AND 499  THEN SAL_GRADE := 'B';
           ELSE SAL_GRADE := 'A';
           END IF;
          
          DBMS_OUTPUT.PUT_LINE('사번: ' || EMP_ID);
          DBMS_OUTPUT.PUT_LINE('이름: ' || EMP_NAME);
          DBMS_OUTPUT.PUT_LINE('급여: ' || SALARY);
          DBMS_OUTPUT.PUT_LINE('급여등급: ' || SAL_GRADE);
                   
END;
/

--4. CASE
--CASE ~ END CASE;
/*
   CASE
     WHEN 표현식1 THEN 실행문1;
     WHEN 표현식2 THEN 실행문2;
     ELSE 기본실행문3;
    END CASE; 
*/

--사원번호를 입력받아 직급코드로 대표, 임원진, 일반직원을 구분하여 출력
DECLARE
    JOB_CODE EMPLOYEE.JOB_CODE%TYPE;
    EMP_TEAM VARCHAR2(20);
BEGIN
    SELECT JOB_CODE
    INTO JOB_CODE
    FROM EMPLOYEE
    WHERE EMP_ID = &EMP_ID;
    
    CASE JOB_CODE
      WHEN 'J1' THEN EMP_TEAM := '대표';
      WHEN 'J2' THEN EMP_TEAM := '임원진';
      ELSE EMP_TEAM := '일반직원';
      END CASE;
      
      DBMS_OUTPUT.PUT_LINE('소속: ' || EMP_TEAM);
      
END;
/
--문제
--사번을 입력받은 후 급여에 따라 등급을 나누어 출력하도록 하시오
--그때 출력값은 사번, 이름, 급여, 급여등급을 출력하시오(CASE 문으로)
--500만원 이상(그외)  : A
--400만원 ~ 499만원 : B
--300만원 ~ 399만원 : C
--200만원 ~ 299만원 : D
--100만원 ~ 199만원 : E
DECLARE
      E EMPLOYEE%ROWTYPE;
      V_SAL_GRADE CHAR(10);
BEGIN
      SELECT *
      INTO E
      FROM EMPLOYEE
      WHERE EMP_ID = '&사번';
      
      CASE TRUNC(E.SALARY/1000000)
           WHEN 0 THEN V_SAL_GRADE := 'F';
           WHEN 1 THEN V_SAL_GRADE := 'E';
           WHEN 2 THEN V_SAL_GRADE := 'D';
           WHEN 3 THEN V_SAL_GRADE := 'C';
           WHEN 4 THEN V_SAL_GRADE := 'B';
           ELSE V_SAL_GRADE := 'A';                         
      END CASE;
      
      DBMS_OUTPUT.PUT_LINE('사번: ' || E.EMP_ID);
      DBMS_OUTPUT.PUT_LINE('이름: ' || E.EMP_NAME );
      DBMS_OUTPUT.PUT_LINE('급여: ' || E.SALARY);
      DBMS_OUTPUT.PUT_LINE('급여등급: ' || V_SAL_GRADE);
END;
/

--반복문--
--ORA-01422: exact fetch returns more than requested number of rows
DECLARE
    E EMPLOYEE%ROWTYPE;
BEGIN
    SELECT *
    INTO E
    FROM EMPLOYEE;
    
    DBMS_OUTPUT.PUT_LINE(E.EMP_ID);
END;
/

--LOOP와 FOR, WHILE

--LOOP--
/*
    LOOP
       반복시킬 내용
       IF 반복 종료 조건
               EXIT;
       END IF;
       또는
       EXIT [WHEN 종료 조건]
    END LOOP;   
*/

--5~1까지 반복하며 출력해주는 반복문 구현(LOOP)
DECLARE
    N INT := 5;
BEGIN
    LOOP
       DBMS_OUTPUT.PUT_LINE(N);
       N:= N-1;
       
       EXIT WHEN N=0;
    END LOOP;
END;
/

--FOR 반복문--
/*
   FOR 카운터변수 IN [REVERSE] 시작값..종료값 LOOP
            반복할 내용;
   END LOOP
*/

BEGIN
    FOR N IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(N);
        END LOOP;
END;
/


BEGIN
    FOR N IN REVERSE 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(N);
        END LOOP;
END;
/

--
BEGIN
       FOR I IN 1..9 LOOP
         FOR J IN 2..9 LOOP
           DBMS_OUTPUT.PUT(J || ' * ' || I || ' = ' || J*I);
           DBMS_OUTPUT.PUT('  ');
         END LOOP;
         DBMS_OUTPUT.PUT_LINE(' ');
      END LOOP;
END;
/

--FOR문을 이용한 INSERT 사용

CREATE TABLE TB_TEST_FOR(
    NO NUMBER,
    TEST_DATE DATE
    
);

BEGIN
  FOR X IN 1 .. 10 LOOP
    INSERT INTO TB_TEST_FOR VALUES(X, SYSDATE+X);
  END LOOP;
END;
/

SELECT * FROM TB_TEST_FOR;

--문제
--PL/SQL의 FOR반복문을 이용하여 EMPLOYEE 테이블의 200번부터 210번까지
--사원의 사원아이디, 사원명, 이메일을 출력.
DECLARE
   E EMPLOYEE%ROWTYPE;
BEGIN
  FOR I IN 0..10 LOOP
    SELECT *
    INTO E
    FROM EMPLOYEE
    WHERE EMP_ID = 200+I;
     
     DBMS_OUTPUT.PUT_LINE(E.EMP_ID||'  '||E.EMP_NAME||'  '||E.EMAIL);
  
  END LOOP;
END;
/


--WHILE 문 --
/*
   WHILE 반복할 조건식 LOOP
               반복할 내용;
    END LOOP;
*/

DECLARE
    N INT := 5;
BEGIN
         WHILE N>0 LOOP
         DBMS_OUTPUT.PUT_LINE(N);
         N := N-1;
         END LOOP;
END;

--RECORD 자료형 생성--
--RECORD는 특정 테이블들의 컬럼을 각각 뽑아 별도의 한 행짜리 자료형을 선언하는 것
--클래스 타입이 마이레코드, 그걸로 변수 선언
DECLARE
     --myrecord라는 데이터타입 작성
     TYPE my_record_type IS RECORD(
         myid EMPLOYEE.EMP_ID%TYPE,
         myname EMPLOYEE.EMP_NAME%TYPE,
         myjobname JOB.JOB_NAME%TYPE
     );     
     --myrecord 변수에 작성한 my_record_type 타입지정
     myrecord my_record_type;
BEGIN
     SELECT EMP_ID, EMP_NAME, JOB_NAME 
     INTO myrecord
     FROM EMPLOYEE
     LEFT JOIN JOB USING(JOB_CODE)
     WHERE EMP_NAME = '선동일';
     
     DBMS_OUTPUT.PUT_LINE(myrecord.myid || '  ' || myrecord.myname || '  ' || myrecord.myjobname );
END;
/

--EXCEPTION 예외처리--
/*
    EXCEPTION
        WHEN 예외명 THEN 처리문장1;
        WHEN 예외명2 THEN 처리문장2;
        WHEN 예외1 OR 예외2 THEN 처리문장3;
        WHEN OTHERS THEN 처리문장4;
*/
BEGIN
    UPDATE EMPLOYEE
    SET EMP_ID = '201'
    WHERE EMP_ID = '200';
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN DBMS_OUTPUT.PUT_LINE('이미 존재하는 사원입니다.');
END;
/

/*
   오라클에서 제공하는 예외 별칭들
   NO_DATA_FOUND : SELECT한 결과가 하나도 없을 경우
   CASE_NOT FOUND : CASE 구문 중 일치하는 결과도 없고,
                    ELSE로 그 이외의 내용에 대한 처리 구문도 없을 경우
    LOGIN_DENIED : 잘못된 아이디나 비밀번호를 입력하였을 경우
    DUP_VAL_ON_INDEX : UNIQUE 제약조건을 위배했을 경우
    INVALID_NUMBER : 문자데이터를 숫자로 변경할 때, 변경할 수 없는 문자인 경우
                    
*/

--프로시저 : PL/SQL을 미리 저장해 놓았다가 프로시저명으로 호출하여 함수처럼 동작시키는 객체
/*
       CREATE [OR REPLACE] PROCEDURE 프로시저명
         (매개변수1 [IN/OUT/IN OUT] 자료형[, 매개변수2 [MODE] 자료형...])
                     IN: 프로시저에서 사용할 변수 값을 외부에서 받아올 때 사용하는 모드
                     OUT: 프로시저를 실행한 결과를 외부로 추출할 때 사용하는 모드(return과 비슷)
                     IN OUT: IN과 OUT 두 가지 기능을 선택해서 사용할 수 있는 모드
       IS --(선언부, DECLARE)
          변수선언
       BEGIN
         실행코드
       END;
       /
       
       [호출]
       EXECUTE 프로시저명[(전달값1, 전달값2, ...)];
       EXEC           "                       "
       
       [삭제]
       DROP PROCEDURE 프로시저명;
       
*/


--직원 정보를 모두 삭제하는 프로시저 구현

--테이블 생성해서 EMPLOYEE 복사
CREATE TABLE EMP_TMP
AS SELECT *  FROM EMPLOYEE;

SELECT * FROM EMP_TMP;

--프로시저 생성
CREATE OR REPLACE PROCEDURE DEL_ALL_EMP
IS
  --변수 선언이 없더라도 생략 불가능
BEGIN
    DELETE FROM EMP_TMP;
    COMMIT;
END;
/

--COUNT 28
SELECT COUNT(*) FROM EMP_TMP;

--프로시저 실행
EXEC DEL_ALL_EMP;
SELECT COUNT(*) FROM EMP_TMP;
DROP TABLE EMP_TMP;

--매개변수를 갖는 프로시저
--[IN]--
--IN 모드는 외부의 값을 내부로 전달하는 방식

CREATE TABLE EMP_TMP
AS SELECT * FROM EMPLOYEE;

--특정 이름을 가진 사원 삭제하기

SELECT * FROM EMP_TMP
WHERE EMP_NAME LIKE '이%';

-- 매개변수 있는 프로시저 생성
CREATE OR REPLACE PROCEDURE DEL_EMP_NAME(V_NAME IN EMP_TMP.EMP_NAME%TYPE)
IS
BEGIN
      DELETE FROM EMP_TMP
      WHERE EMP_NAME LIKE V_NAME;
      
      DBMS_OUTPUT.PUT_LINE(V_NAME || '직원 정보가 삭제되었습니다.');
      COMMIT;
END;
/

EXEC DEL_EMP_NAME('홍길동');

SELECT * FROM EMP_TMP
WHERE EMP_NAME LIKE '홍%';

EXEC DEL_EMP_NAME('홍%');

--[ OUT ] --
/*
       내부의 값을 외부로 전달하는 방식
       외부에서도 값을 받을 수 있게 VARIABLE(변수)객체를 생성
       
       --내부의 값을 전달받을 변수 선언
       VARIABLE 변수명 자료형;
       
       EXEC 프로시저명(전달값, :전달받을변수명)
       
       --받은 값 출력
       PRINT 변수명;
       
*/
CREATE OR REPLACE PROCEDURE 
         EMP_INFO(VEMP_ID IN EMPLOYEE.EMP_ID%TYPE,
                             VEMP_NAME OUT EMPLOYEE.EMP_NAME%TYPE,
                             VPHONE OUT EMPLOYEE.PHONE%TYPE)
IS
BEGIN
     SELECT EMP_NAME, PHONE
     INTO VEMP_NAME, VPHONE
     FROM EMPLOYEE
     WHERE EMP_ID = VEMP_ID;

END;
/


--변수 => 프로시저를 통해 OUT되는 데이터를 담는다.
VARIABLE VAR_ENAME VARCHAR2(20);
VARIABLE VAR_PHONE VARCHAR2(12);

--아무것도 출력 안 된다.
PRINT VAR_ENAME;

--프로시저 실행 후 변수 출력
EXEC EMP_INFO(201, :VAR_ENAME, :VAR_PHONE);

PRINT VAR_ENAME;
PRINT VAR_PHONE;

--실행한 프로시저를 통해 저장된 변수 값을 자동으로 호출
SET AUTOPRINT ON;


