
public class Game {

	Player player1;
	int player1Score = 0;
	
	Player player2;
	int player2Score = 0;
	
	int draw = 0;

	
	public Game() {
		
	}
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public int playGame() {
		//Generate roshsambo for each player
		Roshambo one = player1.generateRoshambo();
		Roshambo two = player2.generateRoshambo();
		
		System.out.println();

		System.out.println(player1.getName() + ": "+ one);
		System.out.println(player2.getName() + ": "+ two);
		
		//Call result method to handle logic
		int result = getResult(one, two);
		
		printResult(result);
		
		return result;
			
	}
	
	//Compare player one to player two. Returns 1 if one beats two, -1 if one loses to two, 0 if there's a draw
	public int getResult(Roshambo one, Roshambo two) {
		
		int result = 0;
		
		if(one == two){
			result = 0;
		}
		else if(one == Roshambo.ROCK) {
			if(two == Roshambo.PAPER) {
				result = -1;
			}
			if(two == Roshambo.SCISSORS) {
				result = 1;
			}
		}
		else if(one == Roshambo.PAPER) {
			if(two == Roshambo.SCISSORS) {
				result = -1;
			}
			if(two == Roshambo.ROCK) {
				result = 1;
			}
		}
		else if(one == Roshambo.SCISSORS) {
			if(two == Roshambo.ROCK) {
				result = -1;
			}
			if(two == Roshambo.PAPER) {
				result = 1;
			}
		}
		return result;
	}
	
	//Take result(-1,0,1), and output to console result. Increment win counters as well.
	public void printResult(int result) {
		
		if (result > 0) {
			System.out.println(player1.getName() + " wins!");
			player1Score++;
		}
		else if (result < 0) {
			System.out.println(player2.getName() + " wins!");
			player2Score++;
		}
		else {
			System.out.println("Draw!");
			draw++;
		}
	}	
}
