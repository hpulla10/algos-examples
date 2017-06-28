package com.harish.algos.examples;

/**
 * 
 * @author Harishwar Reddy Pulla
 *
 */

public class StringPermutations {

	
	private static void print(char[] input,char[] out,int d, int numPlaces) {
		
		if(d == numPlaces) {
			System.out.println(String.valueOf(out));
			return;
		}
		
		for(int i=0;i<input.length;i++) {
			if(!checkIfAlreadyExists(input[i], out, d, input)){
				out[d] = input[i];
				print(input, out, d+1, numPlaces);
			}		
		}
	}
	
	private static boolean checkIfAlreadyExists(char c, char[] out, int d, char[] input) {
		for(int j=0 ;j<d; j++) {
			if(c == out[j]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		String input ="ABCD";
		char[] output = new char[input.length()];
		print(input.toCharArray(), output, 0 , 4);
	}
}
