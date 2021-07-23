package silsub3.model.co;

public class Circle {
	
	public static double PI = 3.14;
	private static int radius;
		

	public Circle() {}
	

	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void incrementRadius() {
		setRadius(radius+1);
		//Circle.radius++;도 가능
	}

	public void printCircleInfo( ) {

		double cir = 2*radius*PI;
		System.out.println("원의 둘레: "+cir);
		double area = radius*radius*PI;
		System.out.println("원의 넓이: "+area);
		
	}

}
