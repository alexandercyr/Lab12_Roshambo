
public enum Roshambo {

	ROCK("Rock"), 
	PAPER("Paper"), 
	SCISSORS("Scissors");

	private String string;
	
	Roshambo(String name){
		string = name;
	}
	
	@Override
	public String toString() {
		return string;
	}

}
