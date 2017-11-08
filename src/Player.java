
public abstract class Player {

	String name;
	Roshambo turnChoice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getTurnChoice() {
		return turnChoice;
	}
	public void setTurnChoice(Roshambo turnChoice) {
		this.turnChoice = turnChoice;
	}
	
	public abstract Roshambo generateRoshambo();
	
}
