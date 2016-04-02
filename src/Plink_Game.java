import java.util.Scanner;
import java.util.Arrays;

public class Plink_Game {

	// Creating Variables
	public static Scanner input = new Scanner(System.in);
	public static int[] ballDropPoint = {0, 1, 2, 3, 4, 5 };
	public static int[] slots = {5, 10, 25, 25, 10, 5};
	// Variables for user 1
	public static String user1;
	public static int user1Points;
	public static int user1drop;
	public static int firstTry;
	public static int secondTry;
	public static int thirdTry;
	public static int fourthTry;
	public static int fifthTry;
	public static int[] user1Tries = {firstTry, secondTry, thirdTry, fourthTry, fifthTry};
	// Variables for user 2
	public static String user2;
	public static int user2Points;
	public static int user2drop;
	public static int firstTry2;
	public static int secondTry2;
	public static int thirdTry2;
	public static int fourthTry2;
	public static int fifthTry2;
	public static int[] user2Tries = {firstTry2, secondTry2, thirdTry2, fourthTry2, fifthTry2};

	public static void main(String[] args) { // <--- Main Method

		// Making sure my code will run
		//System.out.println("Doctor Who?");

		/* This is a program that simulates a plinko machine
		 * where you will drop 5 balls somewhere from the top 
		 * then the ball will fall down to one of the bins 
		 * at the bottom. This will be a two person game
		 * Each bin will be worth a certain number
		 * of points. The player with the most
		 * number of points win. 
		 */

		/*           ---------- OUTLINE ----------
		 *  1.Create external variables for all methods 
		 *  2.Print statements to ask users for names
		 *  3.Ask user 1 to pick a spot to drop ball from
		 *  4.Simulate the ball being dropped  -- This will be its own Method
		 *  5.Print out user 1's score
		 *  6.Repeat steps 3-5 for user 2
		 *  7.Decide who is the winner based on score -- This will be its own Method
		 */


		// Ask user to start game
		System.out.println("Press S to start game!");
		String startGame = input.nextLine();

		// Check if user pressed start
		if (startGame.equalsIgnoreCase("S")) {

			// Call getUsersNames Method
			getUsersNames();

			// Call user1turn Method
			user1turn();
			
			// Call user2turn Method
			user2turn();
			
			// Call determineWinner Method
			determineWinner();

		} else {
			System.out.println("Maybe next time");
		}

	}

	public static void getUsersNames() { // <--- 2nd Method
		// Get first users name
		System.out.println("Please enter first users name:");
		user1 = input.nextLine();
		if (user1.equalsIgnoreCase("")) {
			System.out.println("Please enter a valid name");
			user1 = input.nextLine();
		}

		// Get second users name
		System.out.println("Please enter second users name:");
		user2 = input.nextLine();
		if (user2.equalsIgnoreCase("")) {
			System.out.println("Please enter a valid name");
			user2 = input.nextLine();
		}
	}

	public static void user1turn() { // <--- 3rd Method

		System.out.println("Where do you want to drop the ball?"
				+ " \nSlot 1, 2, 3, 4, or 5");
		user1drop = input.nextInt();

		System.out.println(Arrays.binarySearch(ballDropPoint, user1drop));
		// Check where user 1 placed ball
		//if () {}


	}
	
	public static void user2turn() { // <--- 4th Method
		
		// Copy code from user1turn then change variable name
		// for user2
		
	}

	public static void dropBall() { // <--- 5th Method
		// This is where I will put the loop for the ball to drop
		// This method will go inside both user methods




	}
	
	public static void determineWinner() { // <--- 6th Method
		// This is where I will determine the winner
		if (user1Points > user2Points) {
			System.out.println(user1 + " wins with a total of "
							+ user1Points + " points!!!");
		} else {
			System.out.println(user2 + " wins with a total of "
							+ user2Points + " points!!!");
		}
		
	}

}
