package kh.java.inherit.product.model.vo;

//"애플","iphone12",500000,"ios14","SKT"
public class SmartPhone extends Product{

	private String os;
	private String carrier;
	
	public SmartPhone() {
		
	}
	
	//brand,productName,price도 받아와야한다
	public SmartPhone(String brand, String productName, int price, String os,String carrier) {
//		setBrand(brand);
//		setProductName(productName);
//		setPrice(price);
		//2.부모생성자 호출 방법도 있음
		super(brand,productName,price);
		this.os = os;
		this.carrier = carrier;
	}
	
	public String printSmartPhoneInfo() {
		return getProductInfo() + ", " + os + ", " + carrier;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + os + ", " + carrier;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	
}
