DML (Data Manipulation Language)

SELECT

INSERT

DELETE

UPDATE

### SELECT 문의 기본

테이블에서 데이터를 꺼낼 때에 사용 // :질의 또는 쿼리라고 부르기도 한다.

``` sql
SELECT ENAME,SAL FROM EMP;  // 특정 COLUMN값 가져오기
SELECT * FROM EMP; // 전체 가져오기
```



#### 열에 별명을 부여하자

```SQL
SELECT ENAME,SAL, SAL*12, DEPTNO AS DNO FROM EMP;
DEPTNO 를 DNO 처럼 부여 ""AS""
SELECT ENAME,SAL, SAL*12 AS ASAL, DEPTNO AS DNO FROM EMP;
SAL*12를 ASAL처럼
SELECT ENAME,SAL, SAL*12 AS "ANN SAL", DEPTNO AS DNO FROM EMP;
띄어쓰기 를 위해서 "" 안에 넣음


```

![1559263648101](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1559263648101.png)

#### 열을 합쳐보자

```SQL
SELECT ENAME||JOB FROM EMP;  // COLUMN 이 합쳐짐
SELECT ENAME||' '||JOB AS ENAMEANDJOB FROM EMP; 사이가 한칸 띄어짐
```



![1559264746764](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1559264746764.png)



#### DISTINCT

``` SQL
SELECT DISTINCT(JOB) FROM EMPJOB
에서 중복된 데이터를 제외하고 출력
SELECT * FROM EMP WHERE JOB ='MANAGER'
JOB이 MANAGER인 사람들만 출력	
SELECT * FROM EMP WHERE JOB ='MANAGER' AND SAL >2500 AND HIREDATE >'04/15/1981'
부가적인 조건을 더 붙일수 있음
SELECT * FROM EMP WHERE JOB ='MANAGER' AND ENAME LIKE '%A%'ENAME 
에서 A가 포함된것을 출력 EX) %c c로 끝나는것 출력
-- 주석은 이렇게 사용 /**/ 는 여러줄 주석
SELECT ENAME, SAL, ((SAL*0.87)*12)+((NVL(COMM,0)*0.88)*12) AS SED FROM EMP;
-- NVL을 사용하여: NULL값을 실제값으로 변환한다.
-- NVL(A,B)  A컬럼에서 널값을 찾아 널값에 B를 채움,  A가 숫자형이면 채우는 B도 동일한 숫자형 이어야 함SQL
```

#### 비교연산자

```SQL
!=  대신에  <> 사용해라 !=는 ORACLE에서만 동작함
NULL 은 비교연산자가 안되기 떄문에
WHERE * FROM EMP WHERE COMM IS NULL;
-- 반대는 IS NOT


```

#### ORDER BY 구

``` SQL
SELECT ENAME, SAL FROM EMP ORDER BY ENAME DESC
ASC(오름차순)/ DESC(내림차순)
숫자를 사용하여 선택할수도있다 EX) ENAME > 1

SELECT ENAME, SAL, SAL*12 AS ASAL FROM EMP
WHERE SAL >1000
AND DEPTNO=20
ORDER BY ASAL ASC

SELECT * FROM EMP
WHERE MGR IS NOT NULL
ORDER BY MGR,ENAME
;
-- MGR로 정렬하고 ENAME으로 다시정렬 
```

### Foreign key

![1559262865141](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1559262865141.png)

### 

