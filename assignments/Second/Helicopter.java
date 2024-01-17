package Second;

import First.Airplane;

public class Helicopter extends Airplane {

	protected int nbCyl;
	protected int cYear;
	protected int pCapacity;

	// there are two ways in doing the constructors Helicopter is the first way and
	// the second way is Quadcopter

	public Helicopter() {
		nbCyl = 0;
		cYear = 0;
		pCapacity = 0;
	}

	public Helicopter(int nbCyl, int cYear, int pCapacity) {
		this.nbCyl = nbCyl;
		this.cYear = cYear;
		this.pCapacity = pCapacity;
	}

	public Helicopter(Helicopter h) {
		setBrand(h.getBrand());
		setPrice(h.getPrice());
		setHorsepower(h.getHorsepower());
		this.nbCyl = h.nbCyl;
		this.cYear = h.cYear;
		this.pCapacity = h.pCapacity;
	}

	public Helicopter(String brand, double price, int horsepower, int nbCyl, int cYear, int pCapacity) {
		this(nbCyl, cYear, pCapacity);
		setBrand(brand);
		setPrice(price);
		setHorsepower(horsepower);
	}

	public void setNbCyl(int nc) {
		this.nbCyl = nc;
	}

	public int getNbCyl() {
		return this.nbCyl;
	}

	public void setCYear(int cy) {
		this.cYear = cy;
	}

	public int getCYear() {
		return this.cYear;
	}

	public void setPCapacity(int pc) {
		this.horsepower = pc;
	}

	public int getPCapacity() {
		return this.pCapacity;
	}

	public boolean equals(Object e2) {
		if (e2 == null || this.getClass() != e2.getClass())
			return false;
		else {
			Helicopter h = (Helicopter) e2;
			return this.nbCyl == h.nbCyl && this.cYear == h.cYear && this.pCapacity == h.pCapacity;
		}
	}

	public String toString() {
		return "The Helicopter is manufactured by the " + this.brand + " company and it was created in " + this.cYear
				+ ". It contains " + this.nbCyl + " cylinders and has a passenger capacity of " + this.pCapacity + ". It costs "
				+ this.price + "$ with a horsepower of " + this.horsepower + ".";
	}
}
