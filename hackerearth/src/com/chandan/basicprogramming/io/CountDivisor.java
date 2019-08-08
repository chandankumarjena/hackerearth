package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandanjena706@gmail.com
 * find the number of divisor in between and including left and right
 * integer means those divisible by k.
 *	
 */

public class CountDivisor {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = bufferedReader.readLine(); 
        String[] strs = line.trim().split("\\s+");
		 
		int left = Integer.parseInt(strs[0]);
		int right = Integer.parseInt(strs[1]);
		int modulus = Integer.parseInt(strs[2]);
		int count = 0;
		for (int i = left; i <= right; i++) {
			if ( i % modulus == 0) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
