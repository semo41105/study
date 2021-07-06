for each문  
==============
- for each는 자바 5.0 부터 추가되었다.  
for each 라는 키워드가 따로 있는 것은 아니고 동일한 for를 이용하지만 조건식 부분이 조금 다르다. 보통 다른 언어에서 for each 라고 많이 하므로 자바에서도 보통 for each문이라고 말한다.  

- 기본 for문 

String[] numbers = {"one", "two", "three"};  
for(int i=0; i<numbers.length; i++) {  
    System.out.println(numbers[i]);  
}  
- for each 구조로 변경하면 다음과 같다.
String[] numbers = {"one", "two", "three"};  
for(String number: numbers) {  
    System.out.println(number);  
}  


* for each 문의 구조는 다음과 같다.
for (type var: iterate) {  
    body-of-loop  
}  
위 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 순차적으로 var에 대입되어 for문을 수행하게 된다. iterate부분에 들어가는 타입은 루프를 돌릴수 있는 형태인 배열 및 ArrayList등이 가능하다.  


ArrayList<String> numbers = new ArrayList<String>();  
numbers.add("one");  
numbers.add("two");  
numbers.add("three");  

for(String number: numbers) {  
    System.out.println(number);  
}  
단, foreach문은 따로 반복회수를 명시적으로 주는 것이 불가능하다.  
역순으로 탐색할 수 없다.  
값을 읽을 수는 있으나 수정할 수 없다.  
