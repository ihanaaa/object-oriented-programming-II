package Fifth;

import Fourth.UAV;

public class AgriculturalDrone extends UAV {

	private String brand;
	private int cCapacity;

	public AgriculturalDrone() {
		this.brand = "Unknown";
		this.cCapacity = 0;
	}

	public AgriculturalDrone(double weight, double price, String brand, int cCapacity) {
		super(weight, price);
		this.brand = brand;
		this.cCapacity = cCapacity;
	}

	public AgriculturalDrone(AgriculturalDrone ag) {
		setWeight(ag.getWeight());
		setPrice(ag.getPrice());
		this.brand = ag.brand;
		this.cCapacity = ag.cCapacity;
	}

	public void setBrand(String b) {
		this.brand = b;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setCCapacity(int cc) {
		this.cCapacity = cc;
	}

	public int getCCapacity() {
		return this.cCapacity;
	}

	public String toString() {
		return "The Agricultural Drone is manufactured by the " + this.brand + ". It weighs " + this.weight
				+ " pounds, and costs " + this.price + "$. It can carry up to " + this.cCapacity + " kg.";
	}

	public boolean equals(Object e6) {
		if (e6 == null || this.getClass() != e6.getClass())
			return false;
		else {
			AgriculturalDrone ag = (AgriculturalDrone) e6;
			return this.brand == ag.brand && this.cCapacity == ag.cCapacity;
		}
	}
}
