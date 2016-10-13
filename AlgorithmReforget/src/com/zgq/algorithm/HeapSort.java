/**
 * 堆排序算法
 */
package com.zgq.algorithm;

public class HeapSort {

	/**
	 * 调整每个节点使之满足最大堆的条件
	 * 
	 * @param a
	 * @param i
	 */
	public void maxHeap(int[] a, int i,int size) {
		
		boolean isContinue = true;//非递归实现
		int temp;
		int max = 0;
		while(isContinue){
			int l = 2 * i;// 左孩子节点
			int r = 2 * i + 1;// 右孩子节点

			if (l <= size  && a[i] < a[l]) {
				max = l;
			} else {
				max = i;
			}
			if (r <= size && a[r] > a[l]) {
				max = r;
			}
			if (max != i) {

				temp = a[i];
				a[i] = a[max];
				a[max] = temp;
				i = max;
				isContinue = true;
//				maxHeap(a, max,size);
			}else{
				isContinue = false;
			}
			
		}
		
	}

	/**
	 * 建立最大堆
	 * 
	 * @param a
	 */
	public void buildHeap(int[] a) {

		int j = (a.length - 1) / 2;// j为最后一个非叶子节点
		for (int i = j; i >= 1; i--) {
			maxHeap(a, i,(a.length-1));
		}

	}

	public int[] heapSort(int[] a) {

		int heapSize = a.length - 1;// 堆的size 初始为数组length
		buildHeap(a);
		int temp;
		for (int i = heapSize; i >1; i--) {
			temp = a[heapSize];
			a[heapSize] = a[1];
			a[1] = temp;
			heapSize = heapSize -1;
			maxHeap(a, 1,heapSize);
		}

		return a;

	}

	public static void main(String[] args) {

		int[] arr = new int[] { -1,5,3,17,10,84,19,6,22,9,35,15 };

		HeapSort sort = new HeapSort();

		int[] b = sort.heapSort(arr);

		for (int i = 1; i <= (b.length - 1); i++) {
			System.out.print(b[i]+" ");
		}

	}

}
