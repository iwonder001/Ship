
public class CruiseShip extends Ship {
		private int maxPass;
		
	public CruiseShip(String s, String yearB) {
		super(s, yearB);
				
	}

	public int getMaxPass() {
		return maxPass;
	}

	public void setMaxPass(int maxPass) {
		this.maxPass = maxPass;
	}
  
	@Override
	public String toString(){
		return("The name of the ship is " + getShip() +".\nThe max number of passengers is " + maxPass);
	}
	
	
}
