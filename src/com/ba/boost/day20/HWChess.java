package com.ba.boost.day20;

import java.util.Scanner;

public class HWChess {
	private static Scanner sc = new Scanner(System.in);
	private static String[][] chessAreas;

	public static void main(String[] args) {

		String[][] chessAreasTemp = { { "h", "g", "f", "e", "d", "c", "b", "a" },
				{ "h", "g", "f", "e", "d", "c", "b", "a" }, { "h", "g", "f", "e", "d", "c", "b", "a" },
				{ "h", "g", "f", "e", "d", "c", "b", "a" }, { "h", "g", "f", "e", "d", "c", "b", "a" },
				{ "h", "g", "f", "e", "d", "c", "b", "a" }, { "h", "g", "f", "e", "d", "c", "b", "a" },
				{ "h", "g", "f", "e", "d", "c", "b", "a" } };
		HWChess.chessAreas = chessAreasTemp;

		menu();

		goForwardLeft();
		goForwardRight();
		goBackwardLeft();
		gobackwardRigt();
		goLeftUp();
		goLeftDown();
		goRightUp();
		goRightDown();

		for (int i = 0; i < chessAreas.length; i++) {
			System.out.print((i + 1) + ". ");
			for (int j = 0; j < chessAreas.length; j++) {
				System.out.print(chessAreas[i][j]);
			}
			System.out.println();
		}

	}

	private static void menu() {
		for (int i = 0; i < chessAreas.length; i++) {
			System.out.print((i + 1) + ". ");

			for (int j = 0; j < chessAreas.length; j++) {
				System.out.print(chessAreas[i][j]);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("Which row do you wanna put horse? ");

		int inputRow = sc.nextInt();
		sc.nextLine();

		System.out.println("Which column do you wanna put horse?");
		String inputColumn = sc.nextLine();

		if (inputRow == 8) {
			int rowCounter = 7;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 7) {
			int rowCounter = 6;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 6) {
			int rowCounter = 5;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 5) {
			int rowCounter = 4;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 4) {
			int rowCounter = 3;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 3) {
			int rowCounter = 2;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 2) {
			int rowCounter = 1;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		} else if (inputRow == 1) {
			int rowCounter = 0;
			int columnCounter = 0;
			if (inputColumn.equalsIgnoreCase("h")) {
				chessAreas[rowCounter][columnCounter] = "^";
			} else if (inputColumn.equalsIgnoreCase("g")) {
				chessAreas[rowCounter][columnCounter + 1] = "^";
			} else if (inputColumn.equalsIgnoreCase("f")) {
				chessAreas[rowCounter][columnCounter + 2] = "^";
			} else if (inputColumn.equalsIgnoreCase("e")) {
				chessAreas[rowCounter][columnCounter + 3] = "^";
			} else if (inputColumn.equalsIgnoreCase("d")) {
				chessAreas[rowCounter][columnCounter + 4] = "^";
			} else if (inputColumn.equalsIgnoreCase("c")) {
				chessAreas[rowCounter][columnCounter + 5] = "^";
			} else if (inputColumn.equalsIgnoreCase("b")) {
				chessAreas[rowCounter][columnCounter + 6] = "^";
			} else if (inputColumn.equalsIgnoreCase("a")) {
				chessAreas[rowCounter][columnCounter + 7] = "^";
			}
		}

	}

	private static void goRightDown() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i + 1][j + 2] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void goRightUp() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i - 1][j + 2] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void goLeftDown() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i + 1][j - 2] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void goLeftUp() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i - 1][j - 2] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void gobackwardRigt() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i + 2][j + 1] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void goBackwardLeft() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i + 2][j - 1] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void goForwardRight() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i - 2][j + 1] = "*";
					}
				}
			}
		} catch (Exception e) {
		}

	}

	private static void goForwardLeft() {
		try {
			for (int i = 0; i < chessAreas.length; i++) {
				for (int j = 0; j < chessAreas.length; j++) {
					if (chessAreas[i][j].equalsIgnoreCase("^")) {
						chessAreas[i - 2][j - 1] = "*";
					}
				}
			}
		} catch (Exception e) {

		}
	}

}
