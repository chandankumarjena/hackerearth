package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * a-1,b-2,c-3 ....... z-26
 * add all characters positions value.  
 * Example aba = 4
 *
 */
public class CharSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		char []charSum = bufferedReader.readLine().toCharArray();
		int sum = 0;
		for(int i = 0; i < charSum.length; i++) {
			sum = sum + charSum[i] - 96;
		}
		System.out.print(sum);
	}
}
