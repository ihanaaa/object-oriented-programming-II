package Second;

public class Quadcopter extends Helicopter {

	protected int mFSpeed;

	public Quadcopter() {
		mFSpeed = 0;
	}

	public Quadcopter(String brand, double price, int horsepower, int nbCyl, int cYear, int pCapacity, int mFSpeed) {
		super(brand, price, horsepower, nbCyl, cYear, pCapacity);
		this.mFSpeed = mFSpeed;
	}

	public Quadcopter(Quadcopter q) {
		setBrand(q.getBrand());
		setPrice(q.getPrice());
		setHorsepower(q.getHorsepower());
		setNbCyl(q.getNbCyl());
		setCYear(q.getCYear());
		setPCapacity(q.getPCapacity());
		this.mFSpeed = q.mFSpeed;
	}

	public void setMFSpeed(int mfs) {
		this.mFSpeed = mfs;
	}

	public int getMFSpeed() {
		return this.mFSpeed;
	}

	public boolean equals(Object e3) {
		if (e3 == null || this.getClass() != e3.getClass())
			return false;
		else {
			Quadcopter q = (Quadcopter) e3;
			return this.mFSpeed == q.mFSpeed;
		}
	}

	public String toString() {
		return "The Quadcopter is manufactured by the " + this.brand + " company and it was created in " + cYear
				+ ". It contains " + this.nbCyl + " cylinders and has a passenger capacity of " + this.pCapacity + ". It costs "
				+ this.price + "$ with a horsepower of " + this.horsepower + " and a maximum flying speed of " + this.mFSpeed + " km/h.";
	}
}
