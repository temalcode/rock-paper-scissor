import java.util.Scanner;
import java.util.Random;

class RockPaperScissor{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] options = {"rock", "paper", "scissor"};

		System.out.print("Your Selection: ");
		String userSelection = sc.nextLine();
		String computerSelection = options[new Random().nextInt(options.length)];
		System.out.println("Computer Selected: " + computerSelection);

		if(userSelection.equals("rock")){
			if(computerSelection.equals("rock"))
				System.out.println("Draw");
			else if(computerSelection.equals("paper"))
				System.out.println("Computer Win");
			else if(computerSelection.equals("scissor"))
				System.out.println("You Win");
		}
		else if(userSelection.equals("paper")){
			if(computerSelection.equals("rock"))
				System.out.println("You Wins");
			else if(computerSelection.equals("paper"))
				System.out.println("Draw");
			else if(computerSelection.equals("scissor"))
				System.out.println("Computer Wins");
		}
		else if(userSelection.equals("scissor")){
			if(computerSelection.equals("rock"))
				System.out.println("Computer Win");
			else if(computerSelection.equals("paper"))
				System.out.println("You Win");
			else if(computerSelection.equals("scissor"))
				System.out.println("Draw");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
