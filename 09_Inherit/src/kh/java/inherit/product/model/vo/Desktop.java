package kh.java.inherit.product.model.vo;

public class Desktop extends Product{

	private String os;
	private String monitor;
	private String keyboard;
	
	public Desktop() {
		
	}
	
	//brand,productName,price도 받아와야한다
	public Desktop(String brand, String productName, int price, String os,String monitor,String keyboard) {
		//1. 상속받은 public메소드는 현재객체 소속인것처럼 사용가능
		setBrand(brand);
		setProductName(productName);
		setPrice(price);
		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
	
	public String printDesktopInfo() {
		return getBrand() + ", " + getProductName() + ", " + getPrice() + ", " + os + ", " + monitor + ", " + keyboard;
		//return getProductInfo() + ", " + os + ", " + monitor + ", " + keyboard;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + os + ", " + monitor + ", " + keyboard;
	}
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	
}
