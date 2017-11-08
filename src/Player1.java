
public class Player1 extends Player {
	
	public Player1() {
		
	}
	
	public Player1(String name) {
		setTurnChoice(Roshambo.ROCK);
		setName(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		setTurnChoice(Roshambo.ROCK);
		return getTurnChoice();
	}

}
