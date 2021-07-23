package singleton;

public class Singleton {
	//�̱����� �� �ϳ��� ��ü�� �����Ͽ� ���
	
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
