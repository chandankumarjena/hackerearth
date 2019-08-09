package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * @author chandankumarjena
 * Objective is to test if two strings are equal when
 * one string any of the permutation will equal two another.
 * Example :- sumit and mitsu - YES
 * abhi and hibb - NO
 */

public class TwoString {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
		int testCases = Integer.parseInt(bufferedReader.readLine());
		//looping till number of test cases.
		while (testCases -- > 0) {
			//reading the multiple data
			String line = bufferedReader.readLine(); 
	        String[] strs = line.trim().split("\\s+");
	        String first = strs[0];
	        String second = strs[1];
	        
	        //converting to character array and sorting ascending order
	        char [] firstSortedArray = first.toCharArray();
	        Arrays.parallelSort(firstSortedArray);
	        char [] secondSortedArray = second.toCharArray();
	        Arrays.parallelSort(secondSortedArray);
	        
	        //converting character array to string again.
	        first = String.copyValueOf(firstSortedArray);
	        second = String.copyValueOf(secondSortedArray);
	        
	        //comparing two string for equality.
	        if(first.equals(second)) {
	        	System.out.println("YES");
	        } else {
	        	System.out.println("NO");
	        }        
		}

	}

}
