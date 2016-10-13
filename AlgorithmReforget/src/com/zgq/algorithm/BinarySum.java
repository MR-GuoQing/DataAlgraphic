package com.zgq.algorithm;

public class BinarySum {

		public int lastflow = 0;
		public int addBinary(int a,int b) {
			int sum ;
			sum = a + b + lastflow;
			if(sum > 1) {
				lastflow = 1;
				return sum%2;
			}
			else {
				lastflow = 0;
				return sum;
			}
		}

	
	public static void main(String[] args) {
		
		int[] a = {1,0,1,1,1,1};
		int[] b = {0,1,1,1,1,1};
		int[] c = new int[a.length+1];         //Ä¬ÈÏÊÇ0
		BinarySum binaryAdd = new BinarySum(); 
		for(int i = a.length - 1; i >= 0; i--) {
			c[i+1] = binaryAdd.addBinary(a[i],b[i]);
		}
		c[0] = binaryAdd.lastflow;
		for(int j = 0; j < c.length; j++)
			System.out.print(c[j] + " ");
	}

}
