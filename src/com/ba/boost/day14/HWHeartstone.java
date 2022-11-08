package com.ba.boost.day14;

import java.util.Scanner;

public class HWHeartstone {

	private Scanner sc;
	private int input;
	private String firstNick;
	private String secondNick;
	private int count = 0;
	private String firstHero;
	private String secondHero;
	private String firstWarrior;
	private String secondWarriror;

	public static void main(String[] args) {

		HWHeartstone obj = new HWHeartstone();
		obj.menu();
		obj.chooseHero();
		obj.chooseWarrior();
		obj.output();
	}

	private void output() {
		System.out.println(this.firstNick + " hero: " + this.firstHero + "| warrior: " + this.firstWarrior + " VS "
				+ secondNick + " hero: " + this.secondHero + "| warrior: " + this.secondWarriror);
	}

	private void menu() {
		System.out.println("Welcome to heartstone game!!!");
		System.out.print("Please write nickname for first player: ");
		this.sc = new Scanner(System.in);
		this.firstNick = sc.nextLine();
		boolean checkNickname = true;
		while (checkNickname) {
			if (this.firstNick.isBlank()) {
				System.out.print("Please write nickname for first player: ");
				this.firstNick = sc.nextLine();
			}
			if (this.firstNick.isEmpty()) {
				System.out.print("Please write nickname for first player: ");
				this.firstNick = sc.nextLine();
			}
			if (!this.firstNick.isBlank() && !this.firstNick.isEmpty()) {
				break;
			}
		}

		System.out.print("Please write nickname for second player: ");
		this.secondNick = sc.nextLine();
		while (checkNickname) {
			if (this.secondNick.isBlank()) {
				System.out.print("Please write nickname for second player: ");
				this.secondNick = sc.nextLine();
			}
			if (this.secondNick.isEmpty()) {
				System.out.print("Please write nickname for second player: ");
				this.secondNick = sc.nextLine();
			}
			if (!this.secondNick.isBlank() && !this.secondNick.isEmpty()) {
				break;
			}
		}
	}

	private int chooseWarrior() {

		if (this.count == 2) {
			try {
				this.input = 0;
				System.out.println("Which warrior do you wanna choose for " + this.firstNick
						+ "?\n\t1)Press 1 to choose Alexstraza \n\t2)Press 2 to choose Ysera "
						+ "\n\t3)Press 3 to choose Dr. Boom \n\t4)Press 4 to choose Onyxia \n\t5)Press 5 to choose Anomalus \n\t6)Press 6 to choose KingCrush");
				this.sc = new Scanner(System.in);
				this.input = sc.nextInt();
				if (!this.selectWarior(this.input)) {
					System.out.println("Please write 1, 2, 3, 4, 5 or 6.");
					chooseWarrior();
				}
			} catch (Exception e) {
				System.out.println("Please write 1, 2, 3, 4, 5 or 6.");
			}
			if (this.input == 0) {
				chooseWarrior();
			}
			if (this.input == 1 || this.input == 2 || this.input == 3) {
				this.count = 2;
				this.count++;
			}
		}
		if (this.count == 3) {
			try {
				this.input = 0;
				System.out.println("Which warrior do you wanna choose for " + this.secondNick
						+ "?\n\t1)Press 1 to choose Alexstraza \n\t2)Press 2 to choose Ysera "
						+ "\n\t3)Press 3 to choose Dr. Boom \n\t4)Press 4 to choose Onyxia \n\t5)Press 5 to choose Anomalus \n\t6)Press 6 to choose KingCrush");
				this.sc = new Scanner(System.in);
				this.input = sc.nextInt();
				if (!this.selectWarior(this.input)) {
					System.out.println("Please write 1, 2, 3, 4, 5 or 6.");
					chooseWarrior();
				}
			} catch (Exception e) {
				System.out.println("Please write 1, 2, 3, 4, 5 or 6.");
			}
			if (this.input == 0) {
				chooseWarrior();
			}
			if (this.input == 1 || this.input == 2 || this.input == 3) {
				this.count = 3;
				this.count++;
			}
		}

		return input;
	}

	private boolean selectWarior(int input) {
		boolean returnValue = false;
		if (this.count == 2) {
			switch (input) {
			case 1:
				System.out.println(this.firstNick + " choose Alexstraza.");
				this.firstWarrior = "Alexstraza";
				returnValue = true;
				break;
			case 2:
				System.out.println(this.firstNick + " choose Ysera.");
				this.firstWarrior = "Ysera";
				returnValue = true;
				break;
			case 3:
				System.out.println(this.firstNick + " choose Dr Boom.");
				this.firstWarrior = "Dr Boom";
				returnValue = true;
				break;
			case 4:
				System.out.println(this.firstNick + " choose Onyxia.");
				this.firstWarrior = "Onyxia";
				returnValue = true;
				break;
			case 5:
				System.out.println(this.firstNick + " choose Anomalus.");
				this.firstWarrior = "Anomalus";
				returnValue = true;
				break;
			case 6:
				System.out.println(this.firstNick + " choose KingCrush.");
				this.firstWarrior = "KingCrush";
				returnValue = true;
				break;
			default:
				returnValue = false;
				break;
			}
		}

		if (this.count == 3) {
			switch (input) {
			case 1:
				System.out.println(this.secondNick + " choose Alexstraza.");
				this.secondWarriror = "Alexstraza";
				returnValue = true;
				break;
			case 2:
				System.out.println(this.secondNick + " choose Ysera.");
				this.secondWarriror = "Ysera";
				returnValue = true;
				break;
			case 3:
				System.out.println(this.secondNick + " choose Dr Boom.");
				this.secondWarriror = "Dr Boom";
				returnValue = true;
				break;
			case 4:
				System.out.println(this.secondNick + " choose Onyxia.");
				this.secondWarriror = "Onyxia";
				returnValue = true;
				break;
			case 5:
				System.out.println(this.secondNick + " choose Anomalus.");
				this.secondWarriror = "Anomalus";
				returnValue = true;
				break;
			case 6:
				System.out.println(this.secondNick + " choose KingCrush.");
				this.secondWarriror = "KingCrush";
				returnValue = true;
				break;
			default:
				returnValue = false;
				break;
			}
		}
		return returnValue;
	}

	private void chooseHero() {
		if (this.count == 0) {
			try {
				this.input = 0;
				System.out.println("Which hero do you wanna choose for " + this.firstNick
						+ "? \n\t1)Press 1 to choose Mage \n\t2)Press 2 to choose Warlock \n\t3)Press 3 to choose Hunter");
				this.sc = new Scanner(System.in);
				this.input = this.sc.nextInt();
				this.sc.nextLine();
				if (!this.selectHero(this.input)) {
					System.out.println("Please write 1, 2 or 3.");
					chooseHero();

				}
			} catch (Exception e) {
				System.out.println("Please write 1, 2 or 3.");
			}
			if (this.input == 0) {
				chooseHero();
			}
			if (this.input == 1 || this.input == 2 || this.input == 3) {
				this.count = 1;
				
			}
		}
		if (this.count == 1) {
			try {
				this.input = 0;
				System.out.println("Which hero do you wanna choose for " + this.secondNick
						+ "? \n\t1)Press 1 to choose Mage \n\t2)Press 2 to choose Warlock \n\t3)Press 3 to choose Hunter");
				this.sc = new Scanner(System.in);
				this.input = this.sc.nextInt();
				this.sc.nextLine();
				if (!this.selectHero(this.input)) {
					System.out.println("Please write 1, 2 or 3.");
					chooseHero();

				}
			} catch (Exception e) {
				System.out.println("Please write 1, 2 or 3.");
			}
			if (this.input == 0) {
				chooseHero();
			}
			if (this.input == 1 || this.input == 2 || this.input == 3) {
				this.count = 2;
				
			}
		}
	}

	private boolean selectHero(int input) {
		boolean returnValue = false;
		if (count == 0) {
			switch (input) {
			case 1:
				System.out.println(this.firstNick + " chose Mage.");
				this.firstHero = "Mage";
				returnValue = true;
				break;
			case 2:
				System.out.println(this.firstNick + " chose Warlock.");
				this.firstHero = "Warlock";
				returnValue = true;
				break;
			case 3:
				System.out.println(this.firstNick + " chose Hunter.");
				this.firstHero = "Hunter";
				returnValue = true;
				break;
			default:
				returnValue = false;
				break;
			}
		}
		if (count == 1) {
			switch (input) {
			case 1:
				System.out.println(this.secondNick + " chose Mage.");
				this.secondHero = "Mage";
				returnValue = true;
				break;
			case 2:
				System.out.println(this.secondNick + " chose Warlock.");
				this.secondHero = "Warlock";
				returnValue = true;
				break;
			case 3:
				System.out.println(this.secondNick + " chose Hunter.");
				this.secondHero = "Hunter";
				returnValue = true;
				break;
			default:
				returnValue = false;
				break;
			}
		}
		return returnValue;
	}
}
