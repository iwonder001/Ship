
public class CargoShip extends Ship {

	  private int cargoCap;
	  
	public CargoShip(String s, String yearB) {
		super(s, yearB);
		
	}

	public int getCargoCap() {
		return cargoCap;
	}

	public void setCargoCap(int cargoCap) {
		this.cargoCap = cargoCap;
	}
	@Override
	public String toString(){
		return("The name of the ship is " + getShip() +".\nThe cargo capacity in tonnage is " + cargoCap);
	}
	
}
