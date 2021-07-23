package singleton;

public class Singleton {
	//싱글톤은 단 하나의 객체만 생성하여 사용
	
	private static Singleton one;
	
	
	
	//[1]
	private Singleton() {}

	
	//[2]
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton();
		}
		return one;
	}
}
