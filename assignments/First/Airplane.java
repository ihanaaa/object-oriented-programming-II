package First;
import allObjects.FlyingObjects;

public class Airplane extends FlyingObjects {

	protected String brand;
	protected double price;
	protected int horsepower;

	public Airplane() {
		brand = "Unknown";
		price = 0.0;
		horsepower = 0;
	}

	public Airplane(String brand, double price, int horsepower) {
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}

	public Airplane(Airplane a) {
		this.brand = a.brand;
		this.price = a.price;
		this.horsepower = a.horsepower;
	}

	public void setBrand(String b) {
		this.brand = b;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	public double getPrice() {
		return this.price;
	}

	public void setHorsepower(int h) {
		this.horsepower = h;
	}

	public int getHorsepower() {
		return this.horsepower;
	}

	public String toString() {
		return "The Airplane is manufactured by the " + this.brand + " company. It costs " + this.price
				+ "$ and has a horsepower of " + this.horsepower + ".";
	}

	public boolean equals(Object e1) {
		if (e1 == null || this.getClass() != e1.getClass())
			return false;
		else {
			Airplane a = (Airplane) e1;
			return this.brand == a.brand && this.price == a.price && this.horsepower == a.horsepower;
		}
	}
}
