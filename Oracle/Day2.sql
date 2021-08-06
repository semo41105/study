--함수(Function)--

--문자 관련 함수

--LENGTH / LENGTHB
--DUAL : 임시 테이블(가상의 테이블), 
--              SELECT문에서 리터럴을 활용한 계산식을 테스트하고자 할 때 사용하는 임시 테이블

SELECT LENGTH('Hello'),
               LENGTHB('Hello')
FROM DUAL;

SELECT LENGTH('홍길동'),
               LENGTHB('홍길동')
FROM DUAL;

-- INSTA : 주어진 값에서 원하는 문자가 몇 번째인지 찾아 반환하는 함수
SELECT INSTR('ABCDE', 'BC'),
                INSTR('ABCDE','C'),
                INSTR('ABCDE','Z')
FROM DUAL;

--SUBSTR : 주어진 문자열에서 특정 부분만 꺼내오는 함수
SELECT 'Hello world',
                SUBSTR('Hello world', 1,5),
                SUBSTR('Hello world', 7)
FROM DUAL;

--실습 1.
--EMPLOYEE 테이블에서
--사원들의 이름과 이메일 주소를 조회하되
--이메일은 아이디 부분만 조회하기
--조회결과--
--홍길동 hong_gd

--1.
SELECT EMP_NAME, EMAIL
FROM EMPLOYEE;

--2.
SELECT INSTR(EMAIL, '@')
FROM EMPLOYEE;

--3.
SELECT EMP_NAME,
                SUBSTR(EMAIL, 1,6)
FROM EMPLOYEE;

--3.
SELECT EMP_NAME,
                SUBSTR(EMAIL, 1, INSTR(EMAIL, '@')-1  )
FROM EMPLOYEE;
-- INSTR로 찾은 @의 위치는 @를 포함한 것이기 때문에 그 앞까지 자르려면 1을 빼주어야 함.

--LPAD / RPAD
--빈칸을 지정한 문자로 채우는 함수
SELECT LPAD(EMAIL, 20, '#')
FROM EMPLOYEE;

SELECT RPAD(EMAIL,20,'-')
FROM EMPLOYEE;

--LTRM / RTRIM
--특정 문자를 찾아 지워주는 함수

--찾을 문자를 지정하지 않으면 빈칸을 지운다.
SELECT LTRIM('     HELLO')
FROM DUAL;

SELECT RTRIM('HELLO        ')
FROM DUAL;

SELECT LTRIM('012345', '0'),
                LTRIM('111234', '1'),
                LTRIM('54321', '1')
FROM DUAL;
--찾는 문자가 아니면 끝남.

--TRIM
--주어진 문자열에서 양끝을 기준으로 특정문자를 지워주는 함수

SELECT TRIM('    월요일  ')
FROM DUAL;

SELECT TRIM('0' FROM '000123000')
FROM DUAL;

--LEADING / TRAILING
SELECT TRIM(LEADING '0' FROM '000123000') --  ==LTRIM
FROM DUAL;

SELECT TRIM(TRAILING '0' FROM '000123000') --  ==RTRIM
FROM DUAL;

SELECT TRIM(BOTH '0' FROM '000123000') --  ==TRIM
FROM DUAL;

--LOWER / UPPER / INITCAP
--주어진 문자열을 소문자, 대문자로, 앞글자만 대문자 형식으로 변경해주는 함수
SELECT LOWER('NICE TO MEET YOU'),
                UPPER('nice to meet you'),
                INITCAP('nice to meet you')
FROM DUAL;

--CONCAT : 여러 문자열을 하나의 문자열로 합치는 함수
SELECT CONCAT('오라클 ', '너무 재밌어요:)')
FROM DUAL;

--연결연산자
SELECT '오라클은 ' || '너무 재밌어요:('
FROM DUAL;

--REPLACE :  주어진 문자열에서 특정 문자열을 변경할 때 사용하는 함수
SELECT REPLACE('HELLO WORLD', 'HELLO', 'BYE')
FROM DUAL;

--실습2
--EMPLOYEE 테이블에서
--사원의 주민번호를 확인하여
--생년월일 각각 조회하시오.
--이름    | 생년 | 생월 | 생일
--홍길동| 00년 | 00월 | 00일

SELECT EMP_NAME 이름, 
SUBSTR(EMP_NO, 1,2) || '년' 생년 ,SUBSTR(EMP_NO, 3,2) || '월' 생월 ,SUBSTR(EMP_NO, 5,2) || '일' 생일
FROM EMPLOYEE;

/*
SELECT EMP_NAME "이름
CONCAT(SUBSTR(EMP_NO,1,2) , '년') "생년",
CONCAT(SUBSTR(EMP_NO,3,2) , '월') "생월",
CONCAT(SUBSTR(EMP_NO,5,2) , '일') "생일"
FROM EMPLOYEE;
*/

--SUBSTR를 활용하면 날짜 데이터도 쪼갤 수 있다
-- '20/12/24' --> 20  /  12  /   24
SELECT HIRE_DATE
FROM EMPLOYEE;

SELECT EMP_NAME 이름,
               CONCAT(SUBSTR(HIRE_DATE, 1,2), '년') "입사년도",
               CONCAT(SUBSTR(HIRE_DATE, 4,2), '월') "입사월",
               CONCAT(SUBSTR(HIRE_DATE, 7,2), '일') "입사일"
FROM EMPLOYEE;

--실습 3
-- EMPLOYEE 테이블에서
--모든 사원의 사번, 사원명, 이메일, 주민번호를 조회하여
--사원의 목록을 정리하고자 한다.
--이때, 이메일은 '@' 전까지, 주민번호는 7번째 자리 이후는 '*'로 처리하여 조회
SELECT EMP_ID 사번, 
               EMP_NAME 사원명, 
               SUBSTR(EMAIL, 1, INSTR(EMAIL, '@')-1  ) 이메일, 
               RPAD(SUBSTR(EMP_NO, 1,8),14,'*') 주민번호
FROM EMPLOYEE
ORDER BY 1; --컬럼 순서

--실습 4
--EMPLOYEE 테이블에서 현재 근무하는
--여성 사번의 사번, 사원명, 직급코드를 조회
--  ** ENT_YN : 퇴사여부
--  ** WHERE 절에서도 함수 사용 가능!!
SELECT EMP_ID 사번,
                EMP_NAME 사원명,
                JOB_CODE 직급코드,
                ENT_YN 퇴사여부
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8,1) = '2' AND
ENT_YN = 'N';

--단일행함수(Single Row Function)--
--결과를 찾아서 출력할 때마다 (각 행에) 함수가 적용

-----------------------------------------------------------------------------------
--다중 행 함수 (Multiple Row Function) : 조건절에 만족하는 모든 행을 다 찾은 다음, 한번에 연산한다.

--그룹함수(Group Function)
-- SUM(), AVG(), MAX(), MIN(), COUNT()

SELECT SUM(SALARY)
FROM EMPLOYEE;

SELECT AVG(SALARY)
FROM EMPLOYEE;

SELECT MAX(SALARY)
FROM EMPLOYEE;

SELECT MIN(SALARY)
FROM EMPLOYEE;

--실습 5
--EMPLOYEE 테이블에서
--'해외영업1부'에 근무하는 모든 사원의
--평균급여, 가장 높은 급여, 가장 낮은 급여, 급여 합계 조회
SELECT AVG(SALARY), MAX(SALARY), MIN(SALARY), SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--COUNT : 행의 갯수
SELECT COUNT(*),
                 COUNT(DEPT_CODE),   --NULL은 계산하지 않는다.
                COUNT(DISTINCT DEPT_CODE)   --중복을 제외한다.
FROM EMPLOYEE;

SELECT DEPT_CODE FROM EMPLOYEE;
