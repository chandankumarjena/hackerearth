package com.chandan.basicprogramming.implemantation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * count number of digit present in a string.
 *
 */
public class CountDigits {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String stringNumber = bufferedReader.readLine();
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < stringNumber.length(); j++) {
				if (i == Character.getNumericValue(stringNumber.charAt(j))) {
					count ++;
				}
			}
			System.out.println(i +" "+count);
		}	
	}
}
