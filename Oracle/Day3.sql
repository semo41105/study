--날짜 처리 함수--
--SYSDATE : 현재 컴퓨터의 날짜를 반환하는 함수

SELECT SYSDATE
FROM DUAL;

--MONTHS_BETWEEN : 두 날짜 사이의 개월 수
SELECT HIRE_DATE 입사일,
                MONTHS_BETWEEN(SYSDATE, HIRE_DATE) "입사 후 개월 수"
FROM EMPLOYEE;

--ADD_MONTHS
SELECT ADD_MONTHS(SYSDATE, 6)
FROM DUAL;

--EXTRACT : 지정한 날짜로부터 날짜 값을 추출하는 함수
SELECT EXTRACT(YEAR FROM HIRE_DATE),
                EXTRACT(MONTH FROM HIRE_DATE),
                EXTRACT(DAY FROM HIRE_DATE)
FROM EMPLOYEE;

-----------------------------------------------------------------------------------

--형변환 함수--
--TO_DATE(), TO_CHAR(), TO_NUMBER()

--TO_CHAR()--
--날짜정보변경
SELECT HIRE_DATE,
                TO_CHAR(HIRE_DATE, 'YYYY-MM-DD'),
                TO_CHAR(HIRE_DATE, 'YY-MON-DD')
FROM EMPLOYEE;



--숫자정보변경
SELECT SALARY, 
                TO_CHAR(SALARY, 'L999,999,999'),--9는 빈 칸을 표시하지 않음. 0은 빈 칸을 0으로 표시함.
                TO_CHAR(SALARY, '000,000,000'),--자릿수 9개
                TO_CHAR(SALARY, 'L999,999'), -- 제대로 문자열로 표기할 수 없다(초과하니까)
                TO_CHAR(SALARY, 'L000,000')
FROM EMPLOYEE;


--TO_DATE()--
SELECT 20201215,
                TO_DATE(20201215, 'yyyymmdd'),
                TO_DATE(20201215, 'yyyy/mm/dd')
FROM DUAL;



--
--DECODE()--
--JAVA의 3항 연산자
--DECODE(컬럼|데이터, 비교값, 결과1, 비교값2, 결과2 .. , 기본값)

-- 현재 근무하는 직원의 성별을 남, 여로 구분짓기
SELECT EMP_NAME, EMP_NO,
                DECODE(SUBSTR(EMP_NO,8,1), '2', '여', '1', '남' ) 성별
FROM EMPLOYEE
ORDER BY 성별;

--실습1
--EMPLOYEE 테이블에서
--모든 직원의 사번, 사원명, 부서코드, 직급코드, 근무여부, 관리자 여부를 조회하되.
--만약 근무여부가 'Y' 퇴사자
--                           'N' 근무자,
--관리자 사번(MANAGER_ID)이 있으면 사원, 없으면 관리자
--로 작성해서 조회

SELECT EMP_ID 사번, EMP_NAME 사원명, DEPT_CODE 부서코드, JOB_CODE 직급코드, 
DECODE(ENT_YN, 'Y', '퇴사자', 'N', '근무자' ) "근무 여부",
DECODE(MANAGER_ID,  NULL, '관리자', '사원') "관리자 여부"
FROM EMPLOYEE;


--CASE 문--
--자바의 IF, SWITCH

--CASE
--          WHEN (조건식1) THEN 결과값1
--          WHEN (조건식2) THEN 결과값2
--          ELSE 결과값3
--END
SELECT EMP_ID, EMP_NAME, DEPT_CODE, JOB_CODE,
                CASE
                    WHEN ENT_YN = 'Y' THEN '퇴사자'
                    ELSE '근무자'
                END "근무 여부",
                CASE
                    WHEN MANAGER_ID IS NULL THEN '관리자'
                    ELSE '사원'
                END "관리자 여부"
FROM EMPLOYEE;

--숫자 데이터 함수--
--ABS() : 특정 숫자의 절대값 표현
SELECT ABS(10), ABS(-10)
FROM DUAL;

--MOD() : 나머지를 반환하는 함수
SELECT MOD(10,3), MOD(10,2), MOD(10,7)
FROM DUAL;

--ROUND() : 지정한 숫자를 반올림할 때 사용
SELECT ROUND(123.456),
                ROUND(123.456, 0),
                ROUND(123.456, 1),
                ROUND(123.456, 2),
                ROUND(123.456, -1),
                ROUND(123.456, -2)
FROM DUAL;

--CEIL() : 소수점 첫째 자리에서 올림하는 함수
--FLOOR() : 소수점 이하 자리를 버리는 함수
SELECT CEIL(123.456), FLOOR(123.456)
FROM DUAL;

--TRUNC() : 지정한 위치까지 버리는 함수
SELECT TRUNC(123.456, 0),
                TRUNC(123.456, 1),
                TRUNC(123.456, 2),
                TRUNC(123.456, -1),
                TRUNC(123.456, -2)
FROM DUAL;

--실습2
--EMPLOYEE 테이블에서
--입사한 달의 숫자가 홀수 달인
--직원의 사번, 사원명, 입사일 정보를 조회

SELECT EMP_ID 사번, EMP_NAME 사원명, HIRE_DATE 입사일
FROM EMPLOYEE
WHERE  MOD (  SUBSTR(HIRE_DATE, 5,1) , 2) = 1 ;

--날짜데이터--
--SYSDATE, MONTHS_BETWEEN, ADD_MONTHS,
--EXTRACT, LAST_DAY, NEXT_DAY

--오늘 날짜
--SYSDATE : 오늘 날짜만을 표시
--SYSTIMESTAMP : 시간까지 표시

SELECT SYSDATE, SYSTIMESTAMP
FROM DUAL;

--NEXT DAY  : 앞으로 다가올 가장 가까운 요일을 반환
SELECT NEXT_DAY(SYSDATE, '토요일'),
                NEXT_DAY(SYSDATE, '토'),
                NEXT_DAY(SYSDATE, 7)
              --  NEXT_DAY(SYSDATE, 'SATURDAY')
FROM DUAL;                

SELECT *  FROM V$NLS_PARAMETERS;
--설정이 한국어로 되어있기 때문에 영어로 쓰면 인식하지 못함.
ALTER SESSION SET NLS_LANGUAGE = AMERICAN;
SELECT * FROM V$NLS_PARAMETERS;

SELECT NEXT_DAY(SYSDATE, 'SATURDAY')
FROM DUAL;

SELECT NEXT_DAY(SYSDATE, '토')
FROM DUAL;

ALTER SESSION SET NLS_LANGUAGE = KOREAN;

--LAST_DAY() : 주어진 날짜가 있는 달의 마지막 일자를 조회하는 함수
SELECT LAST_DAY (SYSDATE)
FROM DUAL;

--날짜는 +,-연산 가능
--가장 최근 날짜일수록 큰 값으로 판단
SELECT (SYSDATE - 10) "날짜 1",
                 TRUNC(SYSDATE-TO_DATE('19/03/01', 'YY/MM/DD')) 날짜2
FROM DUAL;

--실습3
--EMPLOYEE 테이블에서
--근무년수가 20년 이상인 사원들의
--사번, 사원명, 부서코드, 입사일을 조회
--MONTHS_BETWEEN(), ADD_MONTHS()등을 활용

SELECT EMP_ID 사번, EMP_NAME 사원명, DEPT_CODE 부서코드, HIRE_DATE 입사일
FROM EMPLOYEE
WHERE MONTHS_BETWEEN(SYSDATE, HIRE_DATE) >= 240;
--WHERE ADD_MONTHS(HIRE_DATE, 240) <=SYSDATE;
--WHERE MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12 >= 20;

--형 변환
--TO_CHAR()
--날짜 정보를 특정 형식의 문자로 변경하여 조회

SELECT TO_CHAR(SYSDATE, 'AM HH24:MI:SS'),
                TO_CHAR(SYSDATE, 'PM HH:MI:SS')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'MON DY, YYYY'),
                TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY'),
                TO_CHAR(SYSDATE, 'YEAR, Q') --분기
FROM DUAL;

----
SELECT TO_CHAR(TO_DATE('190325', 'YYMMDD'), 'YYYY' ) "결과1",
                TO_CHAR(TO_DATE('190325', 'RRMMDD'), 'RRRR' ) "결과2",
                TO_CHAR(TO_DATE('800325', 'YYMMDD'), 'YYYY' ) "결과3",
                TO_CHAR(TO_DATE('800325', 'RRMMDD'), 'RRRR' ) "결과4"
FROM DUAL;

--YY : 현 세기
--80 --> 2080

--RR : 반 세기
--51~99 --> 1900년대
--00~50 --> 2000년대

--TO_NUMBER() : 주어진 값을 숫자로 변경
SELECT '123'+'567'
FROM DUAL;

SELECT '123'+'567ABC'
FROM DUAL;

SELECT TO_NUMBER('123456')
FROM DUAL;

--실습 4
--오늘은 연봉 협상의 날
--다음에 해당하는 사원들의 급여를 인상하고자 한다.
--직급코드가 J5인 사원들은 급여의 20%
--                  J6인 사람들은 급여의 15%
--                   J7인 사원들은 급여의 10%
--그 외 직급은 급여의 5%를 인상하려고 할 때,
--EMPLOYEE 테이블에서
--해당 조건을 만족하는 사원들의 사번, 사원명, 직급코드, 인상된 급여 정보를 조회

--CASE
SELECT EMP_ID 사번, EMP_NAME 사원명, JOB_CODE 직급코드,
                SALARY * CASE
                WHEN (JOB_CODE = 'J5') THEN 1.2
                WHEN (JOB_CODE = 'J6') THEN 1.15
                WHEN (JOB_CODE = 'J7') THEN 1.1
                ELSE 1.05
                END "인상된 급여"
FROM EMPLOYEE;

--DECODE
SELECT EMP_ID 사번, EMP_NAME 사원명, JOB_CODE 직급코드,
                TO_CHAR(SALARY*DECODE(JOB_CODE, 'J5', 1.2, 'J6', 1.15, 'J7', 1.1, 1.05), 'L99,999,999' )인상급여
                FROM EMPLOYEE;
                
--SELECT 문의 실행 순서--
/*
            5 : SELECT 컬럼명 AS 별칭, 계산식, 함수, 리터럴...
            1: FROM 테이블명
            2: WHERE 조건
            3: GROUP BY 그룹을 묶을 컬럼명
            4: HAVING 그룹에 대한 조건식, 함수식
            6: ORDER BY 컬럼명 | 별칭 | 컬럼의 순서 ; 
            
*/

--ORDER BY--
SELECT EMP_ID, EMP_NAME 이름, SALARY, DEPT_CODE
FROM EMPLOYEE
--ORDER BY EMP_ID;
--ORDER BY EMP_NAME; --기본값 ASC(오름차순)
--ORDER BY DEPT_CODE DESC, EMP_ID;
--ORDER BY 이름 DESC;
ORDER BY 2 DESC;

--GROUP BY--
-- 급여 평균
SELECT TRUNC(AVG(SALARY), -3)
FROM EMPLOYEE;

--D1 평균 급여
SELECT TRUNC(AVG(SALARY), -3)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D1';

--GROUP BY 절 : 특정 컬럼이나 계산식을 하나의 그룹으로 묶어
--한 테이블 내에서 소그룹별로 조회하고자 할 때 사용
SELECT DEPT_CODE, TRUNC(AVG(SALARY), -3)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--실습5
--EMPLOYEE 테이블에서
--부서별 총 인원, 급여 합계, 급여 평균, 최대 급여, 최소 급여를
--조회하여 부서코드 오름차순으로 정렬하시오.
--&숫자 데이터는 100자리까지만 처리, 100미만 자리는 내림 처리하여 조회.
SELECT DEPT_CODE,
                COUNT(*), 
                TRUNC(SUM(SALARY)), 
                TRUNC(AVG(SALARY),-2), 
                MAX(SALARY), 
                MIN(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY 1;

--실습6.
--EMPLOYEE 테이블에서
--직급코드와 직급코드 별 보너스를 받는 사원 수를 조회
--직급코드 순으로 내림차순 정렬
SELECT JOB_CODE, COUNT(BONUS)||'명' "사원수"
FROM EMPLOYEE
GROUP BY JOB_CODE
ORDER BY 1 DESC;

--EMPLOYEE 테이블에서
--남성직원과 여성직원의 수를 조회
--GROUP BY에서 주어진 컬럼만이 아닌 함수 식도 사용 가능
SELECT DECODE(SUBSTR(EMP_NO,8,1), 1, '남성', 2, '여성') 성별,
                COUNT(*) || '명' 직원수
FROM EMPLOYEE
GROUP BY SUBSTR(EMP_NO,8,1);

--HAVING 구문
--GROUP BY 한 각 소그룹에 대한 조건을 설정
--그룹함수와 함께 사용하는 조건 구문
SELECT DEPT_CODE,
                AVG(SALARY) 평균
                FROM EMPLOYEE
                WHERE SALARY>3000000
                GROUP BY DEPT_CODE;
--SALARY가 300만원이 넘는 애들끼리 평균을 내버려서 결과가 이상하게 나옴.

SELECT DEPT_CODE,
                AVG(SALARY) 평균
                FROM EMPLOYEE
                GROUP BY DEPT_CODE
                HAVING AVG(SALARY) >3000000
                ORDER BY 1;

--실습7
--부서별 그룹의 급여 합계 중 900만원을 초과하는
--부서의 코드와 급여 합계를 조회하시오.
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) >9000000;

--실습8
--급여 합계가 가장 높은 부서를 찾고,
--해당 부서의 부서 코드와 급여 합계를 조회하시오.

--1) 급여 합계가 가장 높은 부서
SELECT MAX( SUM(SALARY) )
FROM EMPLOYEE
GROUP BY DEPT_CODE;
--1770000

--2) 급여 합계가 가장 높은 급여 합계와 같은 부서
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = 17700000 ;

--SUB QUERY--
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = (SELECT MAX( SUM(SALARY) )
                                                FROM EMPLOYEE
                                                GROUP BY DEPT_CODE);
                                               
--실습 9
--EMPLOYEE 테이블에서 직급별 그룹을 편성하여
--직급코드, 급여합계, 급여평균, 인원 수를 조회
--단, 조회 결과는 인원수 내림차순하여 출력하고,
--인원수는 3명을 초과하는 직급만을 조회

SELECT JOB_CODE, SUM(SALARY), TRUNC(AVG(SALARY),-2), COUNT(*)
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING COUNT(*) > 3 
ORDER BY 4 DESC;