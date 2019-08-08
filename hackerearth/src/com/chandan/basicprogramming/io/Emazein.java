package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * finding the final co-ordinate.
 * an incoming string LLRUD (left,right,up,down)
 * (x,y) x-LR, y-UD
 *
 */
public class Emazein {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = bufferedReader.readLine();
		int x = 0, y = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char choice = inputString.charAt(i);
			switch (choice) {
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			default:
				break;
			}
		}
		System.out.println(x +" "+y);

	}

}
