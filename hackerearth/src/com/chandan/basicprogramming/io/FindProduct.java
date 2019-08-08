package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * find the product of all elements in an array with modulo of 10^9 + 7
 * Example 1 2 3 4 5  = 120 (by multiplying all)
 * Here we are doing a modulus operation only to avoid the overflow or wrong 
 * result of big multiplication result.
 */
public class FindProduct {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int []array = new int[length];
		 String line = br.readLine(); 
         String[] strs = line.trim().split("\\s+");
		 for(int j = 0; j < length; j++){
		        int num=Integer.parseInt(strs[j]); 
		        array[j] = num;
		 }
		 long result = 1;
		 for(int i = 0; i<length; i++) {
			 result = ( result * array[i])%1000000007;
		 }
		 
		 System.out.print(result);

	}

}
