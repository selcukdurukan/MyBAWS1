package com.ba.boost.day13;

import java.util.Scanner;

public class HMRockPaperScissors {
	
	private Scanner sc;
	private static int counter = 0;
	private static int computerScore = 0;
	private static int userScore = 0;
	
	public static void main(String[] args) {
		
		HMRockPaperScissors obj = new HMRockPaperScissors();
		obj.menu();
		System.out.println("Bye...");	
	}

	private void menu() {
		try {
			this.sc = new Scanner(System.in);
			System.out.println("HELLO!!!");
			System.out.println("This game is played by computer and user. The game takes 3 round.");
			System.out.println("Press 1 to play game.");
			System.out.println("Press 2 to quit.");
			int input = this.sc.nextInt();
			this.sc.nextLine();	
			
			if (!this.menuSelection(input)) {
				System.out.println("Please press 1 or 2.");
				menu();
			}
		
		} catch (Exception e) {
			System.out.println("Please press 1 or 2.");
			menu();
			System.out.println();
		}
	}

	private boolean menuSelection(int selection) {
		boolean returnValue = false;
		switch (selection) {
		case 1:
			returnValue = true;
			playGame();
			break;
		case 2:
			System.out.println("Bye...");
			returnValue = true;
			System.exit(0);
			break;
		default:
			returnValue = false;
			break;
		}
		return returnValue;
	}

	private void playGame() {
		
		do {
			this.sc = new Scanner(System.in);
			System.out.print("What is your move? Please write Rock, Paper or Scissors: ");
			String input = sc.nextLine();
			int computerChoosing = computerChoose();
			int userValue = 0;
			
				if (input.equalsIgnoreCase("rock")) {
					userValue = 1;
				} else if (input.equalsIgnoreCase("paper")) {
					userValue = 2;
				} else if (input.equalsIgnoreCase("scissors")) {
					userValue = 3;
				} else {
					System.out.println("You should have written Rock, paper or Scissors.");
				}
				
				if (userValue == computerChoosing) {
					System.out.println("in a draw.");
					counter++;
				} else if (userValue == 1){
					System.out.println("Your choice is rock.");
					counter++;
					if (computerChoosing == 2) {
						System.out.println("Computer choice is paper.");
						System.out.println("Computer wins.");
						computerScore++;
					} else if (computerChoosing == 3){
						System.out.println("Computer choice is scissors.");
						System.out.println("You win.");
						userScore++;
					}
				} else if (userValue == 2){
					System.out.println("Your choice is paper.");
					counter++;
					if (computerChoosing == 1) {
						System.out.println("Computer choice is rock.");
						System.out.println("You win.");
						userScore++;
					} else if (computerChoosing == 3){
						System.out.println("Computer choice is scissors.");
						System.out.println("Computer wins.");
						computerScore++;
					}
				} else if (userValue == 3){
					counter++;
					System.out.println("Your choice is scissors.");
					if (computerChoosing == 1) {
						System.out.println("Computer choice is rock.");
						System.out.println("Computer wins.");
						computerScore++;
					} else if (computerChoosing == 2){
						System.out.println("Computer choice is paper.");
						System.out.println("You win.");
						userScore++;
					}
				}
		} while (counter<3);
		
		whoWin();
		
	}
	private void whoWin() {
		System.out.println("Your score is: " + userScore + "\nComputer score is: " +computerScore);
		if (userScore == computerScore) {
			System.out.println("The match ended in a draw.");
		} else if (userScore > computerScore){
			System.out.println("You have won.");
		} else if (computerScore > userScore) {
			System.out.println("Computer has won.");
		} else {
			System.out.println("Something going wrong...");
		}	
	}

	private int computerChoose() {
		double computerChoice = Math.random();
		computerChoice = computerChoice * 3 + 1;
		return (int) computerChoice;	
	}

}
