
public class CellPhone {

	long serialNum;
	String brand;
	int year;
	double price;

	public CellPhone(long serialNum, String brand, int year, double price) {
		this.serialNum = serialNum;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}

	public CellPhone (CellPhone cp, long serialNum) {
		setBrand(cp.getBrand());
		setYear(cp.getYear());
		setPrice(cp.getPrice());
		this.serialNum = serialNum;
	}

	public CellPhone clone() {

		return new CellPhone(this, serialNum);
	}

	public long getSerialNum() {
		return serialNum;
	}
	
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return"The Cellphone is from the brand " + this.brand + " and was created in " + this.year + 
				". It costs " + this.price + " and its serial number is " + this.serialNum;
	}

	public boolean equals(Object x) {
		
		if (x == null || this.getClass() != x.getClass()) 
			return false;
		
		else {
			CellPhone cp = (CellPhone) x;
			return (this.brand == cp.brand && this.price == cp.price && this.year == cp.year && this.serialNum == cp.serialNum);
		}
		
	}

}