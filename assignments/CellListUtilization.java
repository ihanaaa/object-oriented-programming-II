
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CellListUtilization {

	public static void main(String[] args) {

		CellList c1 = new CellList(), c2 = new CellList();

		Scanner sc = null;
		Scanner answer = new Scanner(System.in);

		System.out.println("Enter the name of the file to open: ");
		String file = answer.nextLine();

		try {
			sc = new Scanner(new FileInputStream(file));

		} catch (FileNotFoundException e) {
			System.out.println("\nCould not open input file " + file + " for reading. \r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files");
		}

		convertcell(sc, c1);

		// prompt user to search for a few serial numbers
		searchList(c1);

		System.out.println("Would you like to search for another serial number (yes or no)? ");
		String ans = answer.next().toUpperCase();

		while (ans.compareToIgnoreCase("YES") == 0) {

			searchList(c1);
			System.out.println("Would you like to search for another serial number (yes or no)? ");
			ans = answer.next().toUpperCase();
		}

		// test method that deletes the first node of the list
		c1.deleteFromStart();

		c1.showContents();

		// test method that add a new node to the list
		CellPhone what = new CellPhone(44444, "SHAMMA&IHANA", 2022, 556.9);

		c1.insertAtIndex(what, 8);

		c1.showContents();

		answer.close();
	}

	public static void convertcell(Scanner s, CellList c) {
		String n = null;
		String n2 = null;
		Scanner line = null;
		long num = 0;
		double pr = 0.0;
		int yr = 0;

		while (s.hasNextLine()) {
			n = s.nextLine();
			line = new Scanner(n);
			num = line.nextLong();
			n = line.next();
			pr = line.nextDouble();
			yr = line.nextInt();

			CellPhone CP = new CellPhone(num, n, yr, pr);

			if (!c.contains(num)) {
				c.addToStart(CP);
			}
		}

		c.showContents();

		s.close();
	}

	public static void searchList(CellList c) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter a serial number that you want to search: ");
		long number = sc.nextLong();

		if (c.contains(number) == true)
			System.out.println("\nThis serial number is present in the list!\n");

		else
			System.out.println("\nThis serial number is NOT present in the list :(\n");

		sc.close();
	}

}
