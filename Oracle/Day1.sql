-- 한줄 주석
/* 여러 줄 주석 */
-- 명령어는 소문자로 적어도 상관없지만 대문자로 적는 이유는 관습적인 이유
-- 실행은 컨트롤+엔터

--현재 계정이 가진 모든 테이블 정보 출력하기
SELECT * FROM TABS;

--특정 테이블 정보 확인하기
SELECT * FROM JOB;
SELECT * FROM DEPARTMENT;
SELECT * FROM EMPLOYEE;


--SELECT
--[사용법]
--SELECT * (조회할 컬럼) : 조회하고자 하는 내용 (별은 모두 조회한다는 뜻)
--FROM 테이블명 : 조회하고자 하는 테이블명
--[WHERE 조건] : 특정 조건
--[ORDER BY 컬럼] : 정렬
--; (닫음)

--모든 행과 모든 컬럼을 조회
SELECT  * FROM EMPLOYEE;

--사원의 ID와 사원명, 연락처
SELECT EMP_ID, EMP_NAME, PHONE
FROM EMPLOYEE;


--실습--
--사원의 아이디(EMP_ID), 사원명(EMP_NAME), 이메일(EMAIL), 연락처(PHONE), 
--부서번호, 직급코드를 조회하시오.

SELECT EMP_ID, EMP_NAME, EMAIL, PHONE, DEPT_CODE, JOB_CODE
FROM EMPLOYEE;

--WHERE
--테이블에서 조건을 만족하는 값을 가진 행을
--선택하여 조회하는 조건절
--여러개의 조건을 선택하고자 한다면 AND, OR와 함께 사용 가능하다.

--부서코드가 'D6'인 사원의 모든 정보 조회
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE = 'D6';

--실습2--
--직급이 'J1'인 사원의 사번, 사원명, 직급코드, 부서코드를 조회하시오
SELECT EMP_ID, EMP_NAME, JOB_CODE, DEPT_CODE
FROM EMPLOYEE
WHERE JOB_CODE = 'J1';

--실습3--
--EMPLOYEE 테이블에서 급여(SALARY)가 300만원 이상인 
--사원의 아이디, 사원명, 직급코드, 급여정보를 조회
SELECT EMP_ID,EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY>3000000;

--조건이 2개 이상 붙을 경우(AND, OR)
--부서코드가 'D6'이면서, 이름이 '유재식'인
--사원의 모든 정보 조회하기
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE='D6' 
      AND EMP_NAME='유재식';

SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE='D6' 
      OR EMP_NAME='유재식';

--컬럼명에 별칭 달기
--1.
SELECT EMP_ID AS "사원번호",
                EMP_NAME AS "사원명"
FROM EMPLOYEE;

--2.
SELECT EMP_ID 사번,
                EMP_NAME "사원 명"
FROM EMPLOYEE;
--별칭에 띄어쓰기가 들어갈 경우 반드시 " "로 구분지어야 한다.
                
--실습4
--EMPLOYEE 테이블에서 사원 번호가 205번인 사원의
--사원명, 이메일, 급여, 입사일자를 조회
--(단, 조회하는 컬럼에 별칭을 부여)

SELECT EMP_NAME 사원명, EMAIL 이메일, SALARY 급여,  HIRE_DATE 입사일자
FROM EMPLOYEE
WHERE EMP_ID = '205';


--컬럼 값을 사용하여 계산식을 적용한 정보 조회하기--
SELECT EMP_NAME "사원명",
                (SALARY*12) "연봉",
                BONUS "보너스",
                (SALARY+(SALARY*BONUS))*12 "연봉총합"
FROM EMPLOYEE;

--NVL() : 조회한 값이 NULL일 경우 별도로 설정한 값으로 변경
--NVL(컬럼명, 기본값)
SELECT EMP_NAME "사원명",
                (SALARY*12) "연봉",
                BONUS "보너스",
                (SALARY+(SALARY*NVL(BONUS,0) ))*12 "연봉총합"
FROM EMPLOYEE;

--컬럼에 일반 값 사용하기
SELECT EMP_NAME, SALARY*12, '원' 단위
FROM EMPLOYEE;

--DISTINCT--
--만약 해당하는 값이 컬럼에 여러 개 존재할 경우
--중복을 제거하고 한 개만 조회(NULL도 포함)

SELECT EMP_NAME, DEPT_CODE
FROM EMPLOYEE;

SELECT DISTINCT DEPT_CODE
FROM EMPLOYEE;

--실습5
--DEPARTMENT 테이블을 참조하여
--부서가 '해외영업2부'인 부서코드를 찾고 
--EMPLOYEE테이블에서 해당 부서의 사원들 중 
--급여를 200만원보다 많이 받는 직원의
--사번, 사원명, 급여를 조회

SELECT *
FROM DEPARTMENT;

SELECT EMP_ID 사번, EMP_NAME 사원명, SALARY 급여
FROM EMPLOYEE
WHERE SALARY>2000000
                AND DEPT_CODE = 'D6';
                
--부서가 '해외영업2부'이거나
--급여를 200만원보다 많이 받는 직원의
--사번, 사원명, 급여를 조회

SELECT EMP_ID 사번, EMP_NAME 사원명, SALARY 급여
FROM EMPLOYEE
WHERE SALARY>2000000
                OR DEPT_CODE = 'D6';

--연산자--
--연결 연산자 '||'
SELECT EMP_ID || '을 가진 사원의 이름은 ' || EMP_NAME || '입니다.'
FROM EMPLOYEE;

--비교 연산ㄴ자
-- <, >, <=, >= : 크기를 비교하는 부등호
-- = : 같다
-- !=, ^=, <> : 같지 않다.

SELECT * FROM EMPLOYEE
--WHERE DEPT_CODE != 'D9';
--WHERE DEPT_COME ^= 'D9';
WHERE DEPT_CODE <> 'D9';

--EMPLOYEE 테이블에서
--급여가 350만원 이상 550만원 이하인
--직원의 사번, 사원명, 부서코드, 직급코드, 급여를 조회
SELECT EMP_ID 사번, EMP_NAME 사원명, DEPT_CODE 부서코드, JOB_CODE 직급코드, SALARY 급여
FROM EMPLOYEE
WHERE SALARY>=3500000 
     AND SALARY <=5500000
ORDER BY SALARY ASC; --오름차순
--ORDER BY SALARY DESC; --내림차순

--BETWEEN A AND B
SELECT EMP_ID, EMP_NAME, DEPT_CODE, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY BETWEEN 3500000 AND 5500000;

--위와 똑같은 직원의 정보 조회를 할 때
--350만원 미만, 550만원 초과인 직원의 정보를 조회
SELECT EMP_ID, EMP_NAME, DEPT_CODE, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY NOT BETWEEN 3500000 AND 5500000;

--LIKE--
--입력한 숫자, 문자가 포함된 정보를 조회할 때 사용하는 연산자
--'_' : 임의의 한 문자
--'%' : 몇 자리 문자든 관계없이

--EMPLOYEE 테이블에서
--사원 이름 가운데에 '중'이 들어가는 사원 정보 조회
SELECT *
FROM EMPLOYEE
WHERE EMP_NAME LIKE '_중_';

--EMPLOYEE 테이블에서
--주민등록번호 기준 남성인 사원의 정보만 조회

SELECT *
FROM EMPLOYEE
WHERE EMP_NO LIKE '______-1%';

--사원 중 이메일 아이디가
--5글자를 초과하는 사원의
--사원명, 사번, 이메일 정보를 조회하시오.
SELECT EMP_NAME, EMP_ID, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '______%@%';

--사원 중 이메일 4번째 자리가 '_'인 사원의 정보 조회하기
--ESCAPE 문자를 선언
--'#'뒤의 문자 자체를 인식하게 함
SELECT EMP_NAME, EMP_ID, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___#_%@%' ESCAPE '#';

--EMPLOYEE 테이블에서 '이'씨 성을 가진 직원 모두 조회
SELECT *
FROM EMPLOYEE
WHERE EMP_NAME LIKE '이%' ;

-- IN 연산자 --
-- IN(값1, 값2, 값3, ....)
-- 안에 있는 값 중 하나라도 일치하는 경우
-- 해당하는 값을 조회하는 연산자

--부서코드가 D1이거나 D6인 부서의 직원 정보 조회
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE ='D1'
         OR DEPT_CODE = 'D6';
         
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IN('D1','D6');

--D1도 D6도 아닌 부서의 직원 조회
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE NOT IN('D1','D6');

-- 연산자의 우선순위
--0. ()
--1. 산술 연산자(+-*/)
--2. 연결 연산자
--3. 비교 연산자
--4. IS NULL / IS NOT NULL, LIKE, IN/NOT IN
--5. BETWEEN A AND B
--6. NOT
--7. AND
--8. OR

-- 종합 문제1
-- 직급이 'J2'이면서 200만원 이상 받는 직원이거나, 직급이 'J7'인
-- 사원의 사번, 사원명, 직급코드, 급여 조회

SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE = 'J2' AND SALARY>=2000000)
OR JOB_CODE = 'J7';

-- 종합 문제2
-- 직급이 'J7' 이거나 'J2'이면서 200만원 이상 받는
-- 직원의 사번, 사원명, 직급코드, 급여 조회

SELECT EMP_ID 사번, EMP_NAME AS 사원명, JOB_CODE "직급코드", SALARY AS "급여"
FROM EMPLOYEE
--WHERE JOB_CODE IN( 'J2', 'J7') AND SALARY>=2000000 ;
WHERE (JOB_CODE = 'J2' OR JOB_CODE = 'J7')
       AND SALARY>=2000000 ;
