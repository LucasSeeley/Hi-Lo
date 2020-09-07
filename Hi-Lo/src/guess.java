import java.util.Random;
import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		System.out.println("Welcome to Hi-Lo" + '\n' + "The highest possible score is 100");
		System.out.println("Guess a number 0 to 100!");
		
		
		Scanner user = new Scanner(System.in);
		String y = user.nextLine();
		int z = Integer.parseInt(y);
		
		
		Random rand = new Random();
		int x = rand.nextInt(101);
		
		int a = 0;
		
		int score = 100;
		
		
		while (a < 11) {
			if (score == 0) {
				System.out.println("You have incorrectly guessed too many times");
				System.out.println("Game Over" + '\n' + "Your Score is " + score);
				break;
			}
			else if (x > z) {
				System.out.println("Guess higher");
				y = user.nextLine();
				z = Integer.parseInt(y);
				score = score - 10;
				++a;
				continue;
			}
			else if (x < z) {
				System.out.println("Guess lower");
				y = user.nextLine();
				z = Integer.parseInt(y);
				score = score - 10;
				++a;
				continue;
			} 
			else if (x == z) {
				System.out.println("Great Job!" + '\n' + "Game Over" + '\n' + "Your score is " + score);
				break;
			}
				
		}
		
	}

}
