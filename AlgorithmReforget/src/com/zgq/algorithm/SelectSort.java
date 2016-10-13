package com.zgq.algorithm;

public class SelectSort {
	public static int[] selectSort(int arr[]){
		int tem = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++){
//			int key = arr[i];
			int k = i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[j]<arr[k]){
					k = j;
				}
			}
			tem = arr[k];
			arr[k] = arr[i];
			arr[i] = tem;
			
			
//			arr[position] = arr[i];
//			arr[i] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 54, 6, 3, 78, 34, 12, 45, 56, 100 };
		SelectSort.selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


}
