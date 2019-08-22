package com.chandan.basicprogramming.implemantation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * Given two integer x and k.
 * change the k integer position 
 * to make it the largest number.
 *
 */
public class DigitProblem {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = bufferedReader.readLine();
		String []strs = line.trim().split("\\s+");
		char []charArray = strs[0].toCharArray();
		int k = Integer.parseInt(strs[1]);
		int i = 0;
		while ((i < charArray.length) && (k > 0)) {
			if (charArray[i] != '9') {
				charArray[i] = '9';
				k--;
			}
			i++;
		}
		System.out.println(charArray);
	}
}
