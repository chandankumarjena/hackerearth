package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * help Ali to check the valid pattern DDXDDD-DD
 * and checking the vowel A E I O U Y.
 * here we need to check the pattern and vowel and consecutive number
 * addition that should be even.
 */

public class HelpAli {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		char []array = bufferedReader.readLine().toCharArray();
		if (((array[0] + array[1]) % 2 ==0)
				&& ((array[3] + array[4]) % 2 ==0)
				&& ((array[4] + array[5]) % 2 ==0)
				&& ((array[7] + array[8]) % 2 ==0)) {
			if ((array[2] == 'A')
					|| (array[2] == 'E')
					|| (array[2] == 'I')
					|| (array[2] == 'O')
					|| (array[2] == 'U')
					|| (array[2] == 'Y')) {
				System.out.println("INVALID");
			} else {
				System.out.println("VALID");
			}
			
		} else {
			System.out.print("INVALID");
		}
		

	}

}
