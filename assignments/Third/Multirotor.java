package Third;

import Second.Helicopter;

public class Multirotor extends Helicopter {

	private int nbRotors;

	public Multirotor() {
		nbRotors = 0;
	}

	public Multirotor(String brand, double price, int horsepower, int nbCyl, int cYear, int pCapacity, int nbRotors) {
		super(brand, price, horsepower, nbCyl, cYear, pCapacity);
		this.nbRotors = nbRotors;
	}

	public Multirotor(Multirotor m) {
		setBrand(m.getBrand());
		setPrice(m.getPrice());
		setHorsepower(m.getHorsepower());
		setNbCyl(m.getNbCyl());
		setCYear(m.getCYear());
		setPCapacity(m.getPCapacity());
		this.nbRotors = m.nbRotors;
	}

	public void setNbRotors(int nr) {
		this.nbRotors = nr;
	}

	public int getNbRotors() {
		return this.nbRotors;
	}

	public boolean equals(Object e4) {
		if (e4 == null || this.getClass() != e4.getClass())
			return false;
		else {
			Multirotor m = (Multirotor) e4;
			return this.nbRotors == m.nbRotors;
		}
	}

	public String toString() {
		return "The Quadcopter is manufactured by the " + this.brand + " company and it was created in " + cYear
				+ ". It contains " + this.nbCyl + " cylinders, " + this.nbRotors
				+ " rotors and has a passenger capacity of " + this.pCapacity + ". It costs " + this.price
				+ "$ with a horsepower of " + this.horsepower + ".";
	}
}
