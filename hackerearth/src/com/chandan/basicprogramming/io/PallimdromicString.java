package com.chandan.basicprogramming.io;
/* Simple Program to check String is pallindrome or not. 
 * Example aba- YES, abc-NO
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallimdromicString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String originalString = br.readLine();
		String reverseString = "";
		for(int i = originalString.length() -1; i >= 0; i--) {
			reverseString = reverseString + originalString.charAt(i);
		}
		if(originalString.equals(reverseString)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		br.close();
	}

}
