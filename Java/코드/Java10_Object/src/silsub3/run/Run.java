package silsub3.run;

import silsub3.model.co.Circle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(); 
		
	//	초기화값을 넣으려면?
	//	c.setRadius(1);
		
		c.printCircleInfo();
		
		c.incrementRadius();
		
		c.printCircleInfo();

	}

}
