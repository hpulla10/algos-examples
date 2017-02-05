package com.harish.algos.examples;

import java.util.List;
/**
 * 
 * @author Harishwar Reddy Pulla
 *
 */

public class LongestCommonSubstring {
	
	private static String getLCSUsingSubsets(List<String> result1 , List<String> result2) {
		String lcsValue = "";
		for(String result1Value: result1) {
			int lcsLength = 0;
			for(String result2Value: result2) {
				if(result1Value.equals(result2Value) && result1Value.length() > lcsLength) {
					lcsValue = result1Value;
				}
			}
		}
		return lcsValue;
	}
	
	public static void main(String args[]) {
		 String input1 = "ABABC";
		 String input2 = "BABCA";
		 List<String> result1 = Subsets.getSubsets(input1);
		 List<String> result2 = Subsets.getSubsets(input2);
		 System.out.println(getLCSUsingSubsets(result1, result2));
	}

}
