import java.util.Scanner;

public class User extends Player {

	public User() {
		
	}
	
	public User(String name) {
		setName(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);
		String choice = Validator.getChoice(scnr, "Rock, paper, or scissors? (R/P/S): ","rps");
		if (choice.equalsIgnoreCase("r")) {
			setTurnChoice(Roshambo.ROCK);
		}
		else if (choice.equalsIgnoreCase("p")) {
			setTurnChoice(Roshambo.PAPER);
		}
		else if(choice.equalsIgnoreCase("s")){
			setTurnChoice(Roshambo.SCISSORS);
		}
		//scnr.close();
		return getTurnChoice();
	}

}
