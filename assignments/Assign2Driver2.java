import First.Airplane;
import Second.Helicopter;
import Second.Quadcopter;
import Third.Multirotor;
import Fourth.UAV;
import Fifth.AgriculturalDrone;
import Fifth.MAV;
import allObjects.FlyingObjects;
import java.util.Arrays;

public class Assign2Driver2 {

	public static void copyFlyingObject(FlyingObjects[] newArray) {

		FlyingObjects[] newArray2 = new FlyingObjects[newArray.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray2[i] = new FlyingObjects(newArray[i]);
      }
      System.out.println(Arrays.toString(newArray2));
			System.out.println();
		
	}

	public static void main(String[] args) {
		Airplane airplane = new Airplane("Airbus", 3500000, 4000);

		Airplane airplane2 = new Airplane("Boeing", 4600000, 6000);

		Airplane airplane3 = new Airplane("Airlines", 5000000, 7000);

		Helicopter helicopter = new Helicopter("Bell", 2006, 10, 8, 50000, 2000);

		Helicopter helicopter2 = new Helicopter("BJX", 2018, 40, 8, 7600000, 2100);

		Quadcopter quadcopter = new Quadcopter("DJI Air", 48000, 3500, 4, 2005, 600, 7690);

		Quadcopter quadcopter2 = new Quadcopter("JIX Air", 48670, 3000, 8, 2010, 620, 7888);

		Multirotor multirotor = new Multirotor("Ryze Tello", 450500, 4500, 6, 2012, 1000, 10);

		Multirotor multirotor2 = new Multirotor("BBL", 390000, 5000, 8, 2003, 1200, 50);

		UAV uav = new UAV(151.46, 40000);

		UAV uav2 = new UAV(121.11, 60000);

		AgriculturalDrone AD = new AgriculturalDrone(200.67, 20500, "Autel", 45);

		AgriculturalDrone AD2 = new AgriculturalDrone(130.56, 30600, "OBX", 60);

		MAV mav = new MAV(101.03, 45000, "PowerVision", 5);

		MAV mav2 = new MAV(104.80, 38000, "PoWoP", 8);

		FlyingObjects[] everyObject = { airplane, airplane2, airplane3, helicopter, helicopter2, quadcopter,
				quadcopter2, multirotor, multirotor2, uav, uav2, AD, AD2, mav, mav2 };
		FlyingObjects[] noUAV = { airplane, airplane2, airplane3, helicopter, helicopter2, quadcopter, quadcopter2,
				multirotor, multirotor2 };

		copyFlyingObject(everyObject);
		copyFlyingObject(noUAV);

		System.out.println("Array 1: ");
		findLeastAndMostExpensiveUAV(everyObject);
		System.out.println();
		System.out.println("Array 2: ");
		findLeastAndMostExpensiveUAV(noUAV);

	}

	public static void findLeastAndMostExpensiveUAV(FlyingObjects[] arrayC) {

		FlyingObjects minPriceU = null;
		FlyingObjects maxPriceU = null;

		for (int i = 0; i < arrayC.length; i++) {

			if (arrayC[i] instanceof UAV) {
				if (maxPriceU == null) {
					minPriceU = arrayC[i];
					maxPriceU = arrayC[i];
				} else if (arrayC[i].getPrice() < minPriceU.getPrice()) {
					minPriceU = arrayC[i];
				}

				else if (arrayC[i].getPrice() > maxPriceU.getPrice()) {
					maxPriceU = arrayC[i];
				}
			}
		}

		if (maxPriceU != null) {
			System.out.println("The most expensive UAV is: " + maxPriceU.toString());
			System.out.println("The least expensive UAv is: " + minPriceU.toString());
		}

		else {
			System.out.println("No UAV objects were found");
		}
	}
}