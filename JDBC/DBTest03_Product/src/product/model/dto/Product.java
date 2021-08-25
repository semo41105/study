package product.model.dto;

public class Product {
	private String pId;
	private String pName;
	private int price;
	private String des;
	//driver properties를 밖으로 빼는 이유는 유지보수를 용이하게 하기 위함임.
	
	//생성자(기본, 매개변수), getter/setter, toString
	
	public Product(String pId, int price) {
		super();
		this.pId = pId;
		this.price = price;
	}
	public Product() {
		super();
	}
	public Product(String pId, String pName, int price, String des) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.des = des;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Product pId=" + pId + ", pName=" + pName + ", price=" + price + ", des=" + des;
	}

}
