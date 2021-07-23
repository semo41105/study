package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		//
//		Singleton singleton = new Singleton();
		//에러, 접근제한자 private -> 외부에서 접근 불가능
	
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton == singleton2);
		
		
		
		
		
	}

}
