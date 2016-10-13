package com.zgq.algorithm;
/**
 * ≤Â»Î≈≈–Ú
 * @author zgq
 *
 */
public class InsertSort {
	/**
	 * ≤Â»Î≈≈–Ú
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		
		for (int i = 2; i <= arr.length - 1; i++) {
			int key = arr[i];
			int j = i - 1;
		/*	while (j >= 1 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j--;

			}*/
			for(;arr[j]>key;j--){
				arr[j+1] = arr[j];
				
			}

			arr[j + 1] = key;
		}

	}

	public static void main(String[] args) {
		int arr[] = { -1, 21, 12, 5, 58, 64, 2, 9, 78, 18, 32, 45 };
		insertSort(arr);
		for (int i = 1; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
