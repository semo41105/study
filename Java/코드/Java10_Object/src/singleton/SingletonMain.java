package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		//
//		Singleton singleton = new Singleton();
		//����, ���������� private -> �ܺο��� ���� �Ұ���
	
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton == singleton2);
		
		
		
		
		
	}

}
