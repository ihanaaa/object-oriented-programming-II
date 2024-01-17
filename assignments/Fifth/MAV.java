package Fifth;

import Fourth.UAV;

public class MAV extends UAV {

	private String model;
	private double size;

	public MAV() {
		this.model = "Unknown";
		this.size = 0.0;
	}

	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}

	public MAV(MAV mav) {
		setWeight(mav.getWeight());
		setPrice(mav.getPrice());
		this.model = mav.model;
		this.size = mav.size;
	}

	public void setModel(String m) {
		this.model = m;
	}

	public String getModel() {
		return this.model;
	}

	public void setSize(double s) {
		this.size = s;
	}

	public double getSize() {
		return this.size;
	}

	public String toString() {
		return "The MAV (Micro Air Vehicle) is of the " + this.model + " model. It weighs " + this.weight
				+ " pounds with a size of " + this.size + " ,and costs " + this.price + "$.";
	}

	public boolean equals(Object e7) {
		if (e7 == null || this.getClass() != e7.getClass())
			return false;
		else {
			MAV mav = (MAV) e7;
			return this.model == mav.model && this.size == mav.size;
		}
	}
}
