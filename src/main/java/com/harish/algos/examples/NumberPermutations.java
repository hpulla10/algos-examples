package com.harish.algos.examples;

import java.util.Arrays;

/**
 * 
 * @author Harishwar Reddy pulla
 * This example basically arranges 'n' digits in 'p' places
 *
 */

public class NumberPermutations {
	
	private static int places = 3;
	
	private static void auxPrint(int[] a, int[] out, int d) {
		if(d == places) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for(int i=0;i<a.length;i++) {
			out[d] = i;
			auxPrint(a, out , d+1);
		}
		
	}
	
	private static void print(int[] a) {
		int[] out = new int[places];
		auxPrint(a,out,0);
	}
	
	
	public static void main(String args[]) {
		int a[] = {0,1};
		print(a);
	}

}
