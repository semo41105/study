--PL/SQL--
--PROCEDUAL LANGUAGE EXTENSION TO SQL
--SQL에서 확장된 형태의 언어
--오라클 자체에 내장된 언어
--기존 SQL의 단점을 극복하기 위해

--기능: 변수선언, 비교처리, 반복처리


--PL/SQL의 구조
--선언부, 실행부, 예외처리부로 구성됨
--      선언부: DECLARE/ 변수 선언하는 부분
--      실행부: BEGIN/ 제어문, 반복문, 함수 정의 등을 작성하는 부분
--      예외처리부: EXCEPTION/ 예외 발생시 처리할 내용을 작성하는 부분



--뷰: SELECT문을 저장해서 필요할 때마다 사용
--프로시저: PL/SQL문을 저장해서 사용



--실행부를 사용해서 간단한 문장 출력
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello World');
END;
/

-- 기본값 OFF
-- 접속 종료하면 다시 초기화된다.
SET SERVEROUTPUT ON;



--변수의 선언과 초기화, 변수값 출력
--[1] 일반 변수
DECLARE
          vid NUMBER;
BEGIN
            SELECT EMP_ID
            INTO vid             --변수에 조회한 값을 담음.
            FROM EMPLOYEE
            WHERE EMP_NAME = '선동일1';
            
            DBMS_OUTPUT.PUT_LINE('ID='||vid);
EXCEPTION      
            WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Data!!');   
            
END;
/

DECLARE
            v_empno NUMBER(4);
            v_empname VARCHAR2(10);
            test_num NUMBER(10) := 10*20;
BEGIN
             --변수에 값 대입
             --변수명 := 값;
              v_empno := 1001;
              v_empname := '유관순';
              
              DBMS_OUTPUT.PUT_LINE(v_empno||'   '||v_empname);
              DBMS_OUTPUT.PUT_LINE('test_num = ' || test_num);
              
              
END;

--[2]레퍼런스 변수
----(1) %TYPE : 한 컬럼의 자료형을 받아올 때 사용하는 자료형 타입
DECLARE
           EMP_ID  EMPLOYEE.EMP_ID%TYPE;
           EMP_NAME  EMPLOYEE.EMP_NAME%TYPE;
           SALARY  EMPLOYEE.SALARY%TYPE;
BEGIN
        SELECT EMP_ID, EMP_NAME, SALARY
        INTO EMP_ID, EMP_NAME, SALARY
        FROM EMPLOYEE
        WHERE EMP_NAME = '선동일';
        
        DBMS_OUTPUT.PUT_LINE(EMP_ID || '  ' ||EMP_NAME|| '  ' || LTRIM(TO_CHAR(SALARY,'L99,999,999')));
END;
/
           


----(2) %ROWTYPE :
DECLARE
           myrow EMPLOYEE%ROWTYPE;
BEGIN
          SELECT EMP_ID, EMP_NAME
          INTO myrow.emp_id, myrow.emp_name
          FROM EMPLOYEE
          WHERE EMP_NAME = '선동일';
          
          DBMS_OUTPUT.PUT_LINE(myrow.emp_id || ' , ' || myrow.emp_name);
EXCEPTION
        WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Data!!');
END;
/


-- * 와 ROWTYPE 변수를 이용해서 한 행을 통째로 담기
DECLARE
           myrow EMPLOYEE%ROWTYPE;
BEGIN
          SELECT *
          INTO myrow
          FROM EMPLOYEE
          WHERE EMP_NAME = '&emp_name';
          
          DBMS_OUTPUT.PUT_LINE(myrow.emp_id || ' , ' || myrow.emp_name || ' , ' || myrow.dept_code);
EXCEPTION
        WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Data!!');
END;
/

