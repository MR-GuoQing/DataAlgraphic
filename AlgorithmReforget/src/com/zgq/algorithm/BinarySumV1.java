package com.zgq.algorithm;

public class BinarySumV1 {
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void binaryAdd(int[] a,int[] b,int c[]){
		int flag = 0;
		for(int i =a.length-1;i>=0;i--){
			int sum = a[i]+b[i]+flag;
			if(sum>1){
				sum = sum%2;
				flag = 1;
			}else{
				flag = 0;
			}
			c[i+1]=sum;
		}
		c[0] = flag;
	}
	public static void main(String[] args) {
		
		int[] a = {1,0,1,1,0,1};
		int[] b = {1,1,1,0,1,1};
		int[] c = new int[a.length+1];
		BinarySumV1 binarySumV1 = new BinarySumV1();
		binarySumV1.binaryAdd(a, b, c);
		for(int j=0;j<c.length;j++){
			System.out.print(c[j]+" ");
		}
	}

}
