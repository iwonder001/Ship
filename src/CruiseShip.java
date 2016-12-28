
public class CruiseShip extends Ship {
		private int maxPass;
		
	public CruiseShip(String s, String yearB, int max) {
		super(s, yearB);
		maxPass = max;		
	}

	public int getMaxPass() {
		return maxPass;
	}

	public void setMaxPass(int maxPass) {
		this.maxPass = maxPass;
	}
  
	@Override
	public String toString(){
		return("The name of the ship is " + super.getShip() + ".\nThe year built is " + 
	super.getYearBuilt() + ".\nThe max number of passengers is " + getMaxPass());
	}
	
	
}
