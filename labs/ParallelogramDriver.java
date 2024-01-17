
public class ParallelogramDriver {

	public static void main(String[] args) {

		// first one w/ set
		Parallelogram p1 = new Parallelogram(3.33, 4.5);
		System.out.println("this is " + p1.equals(p1));
		p1.toString();
		p1.setBase(5.5);
		p1.setHeight(5.5);
		System.out.println("this is now " + p1.equals(p1));
		System.out.println(p1.toString());

		// second one
		Parallelogram p2 = new Parallelogram(23.1, 100.0);

		System.out.println("this is " + p1.equals(p2));
		System.out.println(p2.toString());

		// third one w/ get
		Parallelogram p3 = new Parallelogram(56.7, 99.3);
		System.out.println("this is " + p3.equals(p2));
		System.out.println("the base is " + p3.getBase() + " and the height is " + p3.getHeight());
		System.out.println(p3.toString());

		double[] allP = { p1.getArea(), p2.getArea(), p3.getArea() };

		
		
		double totalArea=0; 
	//	totalArea = getTotalArea(allP);

	}

}
