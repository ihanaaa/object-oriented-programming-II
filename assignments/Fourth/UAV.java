package Fourth;
import allObjects.FlyingObjects;
import java.text.DecimalFormat;

public class UAV extends FlyingObjects{

	private static final DecimalFormat f = new DecimalFormat("0.00"); 

	protected double weight;
	protected double price;

	public UAV() {
		this.weight = 0.0;
		this.price = 0.0;
	}

	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}

	public UAV(UAV u) {
		this.weight = u.weight;
		this.price = u.price;
	}

	public void setWeight(double w) {
		this.weight = w;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	public double getPrice() {
		return this.price;
	}

	public String toString() {
		return "The UAV (Unmanned Aerial Vehicle / Drone) has a weight of " + f.format(this.weight) + " pounds, and costs "
				+ f.format(this.price) + "$.";
	}

	public boolean equals(Object e5) {
		if (e5 == null || this.getClass() != e5.getClass())
			return false;
		else {
			UAV uav = (UAV) e5;
			return this.weight == uav.weight && this.price == uav.price;
		}
	}

}

