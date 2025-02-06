package com.ktdsuniversity.edu.array;

public class MatrixExam {

	/**
	 * 가변 이차원 배열 5 X n
	 */

	public static void variableMatrix() {
		int[][] matrix = new int[5][];

		// 배열 크기 랜덤 할당
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = new int[(int) (Math.random() * 10) + 1]; // 1~10 크기의 배열
		}

		// 데이터 채우기
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) { // ✅ j++로 수정
				matrix[i][j] = j + 1;
			}
		}

		// 데이터 출력하기
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(i + "번째 배열 정보입니다."); // ✅ 출력 수정
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); // ✅ 개행 조정
		}
	}

	/**
	 * 고정 이차원 배열 5 X 5
	 */
	public static void matrix() {
		int[][] matrix = new int[5][5];

		// 데이터 채우기
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = j + 1;
			}
		}

		// 데이터 출력하기
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(i + " 번째 배열 정보 입니다.");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		variableMatrix();

	}
}
