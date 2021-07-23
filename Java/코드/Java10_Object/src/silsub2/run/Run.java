package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product();
		
		p.setBrand("Acne studios");
		p.setPName("¸ÓÇÃ·¯");
		p.setPrice(200000);
		

		String information = p.information();
		System.out.println(information);

	}

}
