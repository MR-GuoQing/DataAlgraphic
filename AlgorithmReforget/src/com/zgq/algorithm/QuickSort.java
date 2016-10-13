package com.zgq.algorithm;

import java.util.Scanner;

/**
 * 快速排序
 * 
 * @author zgq
 * 
 */
public class QuickSort {
	public static int num = 0;
	public static int num1 = 0;

	/**
	 * 快速排序主函数
	 * 
	 * @param a
	 * @param p
	 * @param r
	 */
	private static void qucikSort(int a[], int p, int r) {
		if (p < r) {
			int q = QuickSort.partition(a, p, r);
			qucikSort(a, p, q - 1);
			qucikSort(a, q + 1, r);
		}
	}

	/**
	 * 获得数组下标q使p-q小于a[r],q+1到r大于a[r]
	 * 
	 * @param a
	 *            数组
	 * @param p
	 *            数组起点下标
	 * @param r
	 *            数组终点下标
	 * @return
	 */
	private static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;// 数组小标指向已排好序的最后一个值
		for (int j = p; j <= r - 1; j++) {
			// 当前数值小于目标值时i,j数据交换
			if (a[j] < x) {
				++i;
				if (i != j) {
					exchangeData(a, i, j);
				}
			}

		}
		// 最终将目标数据A【r】放入正确的位置
		exchangeData(a, i + 1, r);

		return i + 1;
	}

	/**
	 * 交换数据
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void exchangeData(int a[], int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		num++;
	}

	public static void main(String[] args) {
		int a[] = { -1, 2, 8, 7, 1, 3, 5, 6, 4 };

		System.out.println("please input arr:");
		Scanner sc = new Scanner(System.in);
		// while (sc.hasNext()) {
		// int a[] = new int[9];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = sc.nextInt();
		// }
		// System.out.print("the input arr is: ");
		// for (int i = 0; i < a.length; i++) {
		// if (i != a.length - 1) {
		// System.out.print(a[i] + ",");
		// } else {
		// System.out.println(a[i]);
		// }
		// }
		//
		qucikSort(a, 1, a.length - 1);
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// System.out.println("the num:" + num);
		// num = 0;
		// }
	}

}
