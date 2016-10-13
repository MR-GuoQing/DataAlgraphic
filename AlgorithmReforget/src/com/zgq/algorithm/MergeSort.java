package com.zgq.algorithm;
/**
 * 
 * @author zgq
 *
 */
public class MergeSort {
	public void merge(int[] a, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int a1[] = new int[n1 + 2];// 左半数组
		int a2[] = new int[n2 + 2];// 右半数组
		a1[a1.length - 1] = Integer.MAX_VALUE;
		a2[a2.length - 1] = Integer.MAX_VALUE;
		for (int i = 1; i <= n1; i++) {
			a1[i] = a[p + i - 1];
		}
		for (int i = 1; i <= n2; i++) {
			a2[i] = a[q + i];

		}
		for (int i = p, j = 1, k = 1; i <= r; i++) {
			if (a2[k] <= a1[j]) {
				a[i] = a2[k];
				k++;
			} else {
				a[i] = a1[j];
				j++;
			}

		}

	}

	public void mergeSort(int[] a, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(a, p, q);
			mergeSort(a, q + 1, r);
			merge(a, p, q, r);
		}

	}

	public static void main(String[] args) {
		int[] a = { -1, 5, 2, 4, 7, 1, 3, 2, 6 };
		MergeSort m = new MergeSort();
		m.mergeSort(a, 1, a.length - 1);
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
