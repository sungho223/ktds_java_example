package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 56, 12, 58, 80, 1 };
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("Sorted array:");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
