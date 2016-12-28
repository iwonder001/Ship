import java.util.Scanner;

public class ShipDemo {

	public static void main(String[] args) {
		// declare variables
		Ship[] types = new Ship[3];

		types[0] = new CruiseShip(" ", " ");
		types[0].setShip("Norweigen");
		((CruiseShip) types[0]).setMaxPass(1500);

		types[1] = new CargoShip(" ", " ");
		types[1].setShip("FedEx");
		((CargoShip) types[1]).setCargoCap(20000);

		types[2] = new Ship(" ", " ");
		types[2].setShip("USA. ");
		types[2].setYearBuilt("2016");

		for (int i = 0; i < types.length; i++) {
			System.out.println("Ship " + (i + 1) + ": ");
			System.out.println(types[i].toString());
		}

	}
}
