
public class Parallelogram {

	private double base;
	private double height;

	public Parallelogram() {
		base = 0.0;
		height = 0.0;
	}

	public Parallelogram(double b, double h) {

		this.base = b;
		this.height = h;
	}

	public Parallelogram(Parallelogram p) {

		this.base = p.base;
		this.height = p.height;

	}

	public void setBase(double b) {

		this.base = b;
	}

	public void setHeight(double h) {

		this.height = h;
	}

	public double getBase() {

		return this.base;
	}

	public double getHeight() {

		return this.height;
	}

	public boolean equals(Parallelogram equals) {

		return this.base == equals.base && this.height == equals.height;
	}

	public double getArea() {

		double area;
		area = this.base * this.height;
		return area;
	}

	public String toString() {

		return "the base is " + this.base + "\nthe height is " + this.height + "\nthe area is " + getArea();

	}

	public static double getTotalArea(double[] p) {

		double totalArea = 0;
		double[] total = new double[p.length];

		for (int i = 0; i < total.length; i++) {

			totalArea += total[i];

		}

		return totalArea;
	}

}
