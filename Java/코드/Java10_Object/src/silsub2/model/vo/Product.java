package silsub2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;

	public Product() {
	}
	//setter
	public void setPName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter
	public String getPName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String information() {
		String str ="��ǰ �̸�: " + this.pName +"\n�귣��: "+ this.brand+
				"\n����: "+this.price;

		return str;
		
		/*
		 * return "[pName="+pName+", price="+price+", brand="+brand+"]";
		 */
		
	}
	

}
