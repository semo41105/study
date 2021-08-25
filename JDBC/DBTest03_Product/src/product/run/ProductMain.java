package product.run;

import product.view.ProductView;

public class ProductMain {

	//스태틱은 프로그램 시작되면 바로 메모리영역에 할당되어서 static은 static끼리.
	//메인메서드는 프로그램을 실행하는 용도.
	public static void main(String[] args) {
		new ProductView();
		//생성자 안에다가 메뉴를 만들어서 메서드 호출할 필요가 딱히 없음. 객체만..
	}

}
