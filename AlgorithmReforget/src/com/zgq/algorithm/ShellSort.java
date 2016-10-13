package com.zgq.algorithm;

/**
 * Ï£¶ûÅÅÐò
 * 
 * @author zgq
 * 
 */
public class ShellSort {
	public static int[] shellSort(int[] arr) {
		int arrLength = arr.length;
		int distance = arrLength;//ÔöÁ¿
		int temp = 0;
		while (distance != 1) {
			distance = distance / 2;
			for (int k = 0, i = distance; i > 0; i--, k++) {
				for (int j = k + distance; j < arr.length; j += distance) {
					System.out.println(distance + "*");
					temp = arr[j];
					int m = j - distance;
					while (m > 0 && temp < arr[m]) {
						arr[m + distance] = arr[m];
						m -= distance;
					}
					arr[m + distance] = temp;

				}
				System.out.println(distance + "-");

			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 54, 6, 3, 78, 34, 12, 45, 56, 100 };
		ShellSort.shellSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
