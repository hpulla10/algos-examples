package com.harish.algos.examples;

import java.util.List;
import java.util.ArrayList;
/**
 * 
 * @author Harishwar Reddy Pulla
 *
 */
public class Subsets {
	
	public static List<String> getSubsets(String input) {
		List<String> results = new ArrayList<String>();
		for(int i=0; i< (1 << input.length()) ; i++) {
			int maskBit = 1;
			String prefix = "";
			for(int j=0;j<input.length();j++) {
				if((maskBit & i)!=0) {
					prefix = prefix+ input.charAt(j);
				}
				maskBit = maskBit << 1;
			}
			results.add(prefix);
		}
		return results;
	}
	
	public static void main(String args[]) {
		List<String> results = getSubsets("ABC");
		for(String result: results) {
			System.out.println(result);
		}
	}
}