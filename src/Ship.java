
public class Ship {
	private String ship;
	private String yearBuilt;
	
	public Ship(String s, String yearB){
		ship = s;
		yearBuilt = yearB;
	}

	public String getShip() {
		return ship;
	}

	public void setShip(String s) {
		ship = s;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

 void setYearBuilt(String yearB) {
		yearBuilt = yearB;
	}
	@Override
	public String toString(){
		return("The name of the ship is " + getShip() + "The year it was built is " + getYearBuilt());
	}

}
