package com.ba.boost.day18;

public class MatrixTranspose {

	public static void main(String[] args) {

//		String[][] arrays = new String[2][2];
//		arrays[0][0] = "1";
//		arrays[0][1] = "2";
//		arrays[1][0] = "3";
//		arrays[1][1] = "4";
//		
//		for (int i = 0; i < arrays.length; i++) {
//			for (int j = 0; j < arrays[i].length; j++) {
//				System.out.print(arrays[i][j] + " ");
//			}
//			System.out.println();
//		}

		String[][] matrix = { { "a1", "b1", "c1", "d1" }, { "a2", "b2", "c2", "d2" }, { "a3", "b3", "c3", "d3" } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		String[][] transposed = new String[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transposed[j][i] = matrix[i][j];
			}
		}

		System.out.println("==============================");

		for (int i = 0; i < transposed.length; i++) {
			for (int j = 0; j < transposed[i].length; j++) {
				System.out.print(transposed[i][j] + " ");
			}
			System.out.println();
		}

		String[][] nArrays = new String[4][5];

		for (int i = 0; i < nArrays.length; i++) {
			for (int j = 0; j < nArrays[i].length; j++) {
				nArrays[i][j] = Character.toString(97 + i) + (j + 1);
			}
		}

		for (int i = 0; i < nArrays.length; i++) {
			for (int j = 0; j < nArrays[i].length; j++) {
				System.out.print(nArrays[i][j] + " ");
			}

			System.out.println();
		}

	}

}
