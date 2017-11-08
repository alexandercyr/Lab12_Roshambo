import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();

		//Initialize user player with user input
		User user1 = new User(Validator.getString(scnr, "Enter your name: "));

		//Initialize game object, set player 1
		Game roshambo = new Game();
		roshambo.setPlayer1(user1);

		String teamChoice = Validator.getChoice(scnr, "Would you like to play against TheJets or TheSharks? (j/s): ", "js");
		
		//Set player2 based on user input
		if (teamChoice.equalsIgnoreCase("j")) {
			Player player2 = new Player1("TheJets");
			roshambo.setPlayer2(player2);

		} else if (teamChoice.equalsIgnoreCase("s")) {
			Player player2 = new Player2("TheSharks");
			roshambo.setPlayer2(player2);
		}

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println();

			roshambo.playGame();
			System.out.println();

			choice = Validator.getChoice(scnr, "Play again? (y/n): ", "yn");
		}

		System.out.println();
		System.out.println("Final Results");
		System.out.println("=============");

		System.out.println("Wins: " + roshambo.player1Score);
		System.out.println("Losses: " + roshambo.player2Score);
		System.out.println("Draws: " + roshambo.draw);

		scnr.close();

	}

}
