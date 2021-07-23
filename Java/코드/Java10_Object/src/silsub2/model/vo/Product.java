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
		String str ="상품 이름: " + this.pName +"\n브랜드: "+ this.brand+
				"\n가격: "+this.price;

		return str;
		
		/*
		 * return "[pName="+pName+", price="+price+", brand="+brand+"]";
		 */
		
	}
	

}
