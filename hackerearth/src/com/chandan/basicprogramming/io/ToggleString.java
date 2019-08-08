package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author chandankumarjena
 * change upper to lower and to upper case of character o a  string
 * Example:- ABCDe->abcdE
 */

public class ToggleString {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String originalString = bufferedReader.readLine();
		String toggleString = "";
		for (int i = 0; i < originalString.length(); i++) {
			int position = originalString.charAt(i);
			if(position >= 65 && position <= 90) {		
				position = position + 32;
				toggleString = toggleString + (char)position;
			} else {
				position = position - 32;
				toggleString = toggleString + (char)position;
			}
		}
		System.out.print(toggleString);
	}

}
