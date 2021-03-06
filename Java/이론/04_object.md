객체
=============
- 객체란?  
세상에 존재하는 모든 것을 뜻하며, 프로그래밍에서 속성과 기능을 가지는 프로그램 단위.  
ex)사람(사람1, 사람2), 차, 밥, 사칙연산 프로그램  

- 클래스란?  
객체를 생성하기 위한 틀. 모든 객체는 클래스로부터 생성된다.  

- 클래스 구성요소  
클래스는 속성(멤버 변수)와 기능(메서드)로 구성된다.  

- 클래스 제작  
클래스는 멤버 변수(속성), 메서드(기능), 생성자 등으로 구성된다.  
클래스로부터 'new'를 이용해서 객체를 생성한다.  

- 생성자  
클래스에서 객체를 생성할 때 가장 먼저 호출된다.  

- 메서드 선언과 호출  
메서드도 변수와 같이 선언 및 정의 후 필요시에 호출해서 사용한다.  

- 매개변수(parameter)  
메서드를 호출할 때 데이터를 전달할 수 있다. 필요시에만 정의된다. 매개변수는 자료형과 변수(지역변수)로 이루어진다.   

- 오버로딩(중복 메서드)  
이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드를 만들 수 있다.  

- 접근자  
메서드를 호출할 때 접근자에 따라서 호출이 불가할 수 있다. ex)private  

- 메모리에서 객체 생성(동적 생성)  
객체는 메모리에서 동적으로 생성되며, 객체가 더이상 필요없게 되면 Garbage Collector에 의해서 제거된다.  

- 레퍼런스  
생성한 객체의 주소를 변수에 저장하는 것을 레퍼런스라고 한다.  

- 자료형이 같아도 다른 객체  
자료형이 같아도 다른 공간에 존재하는 객체는 다른 객체다.  

- null
레퍼런스에 null이 저장되면 객체의 연결이 끊어지며 더이상 이용할 수 없다.  

- 디폴트 생성자  
객체가 생성될 때 가장 먼저 호출되는 생성자로, 만약 개발자가 명시하지 않아도 컴파일 시점에 자동으로 생성된다.  

- 사용자 정의 생성자  
디폴트 생성자 외에 특정 목적에 의해 개발자가 만든 생성자로, 매개변수에 차이가 있다.  

- 소멸자  
객체가 Garbage Collector에 의해 메모리에서 제거될 때 finalize()메서드가 호출된다.  

- this 키워드  
현재 객체를 가리킬 때 this를 사용한다.  

- 패키지  
클래스를 폴더 형식으로 관리하는 것을 패키지라고 한다.  
> 이름 결정 요령  
+ 패키지 이름은 패키지의 속한 클래스가 다른 클래스와 중복되지 않게 만든다.  
+ 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다.  
+ 개발 중에 패키지의 이름과 구조는 변경될 수 있다.  
+ 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성, 기능인지 예상이 가능하도록 이름을 만든다.  
다른 패키지에 있는 클래스를 사용하기 위해서는 import 키워드를 이용한다.  

- static  
클래스의 속성과 메서드에 static 키워드를 사용하면 어디서나 속성과 메서드를 공유할 수 있다.
