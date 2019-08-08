package com.chandan.basicprogramming.io;
/*
 * find the factorial of a number from 1 - 10.
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int fact = getFactorial(number);
		System.out.print(fact);

	}

	private static int getFactorial(int number) {
		// TODO Auto-generated method stub
		int result = 1;
		if (number >= 1 && number <=10) {
			for (int i = 1; i<=number; i++) {
				result = result * i;
			}
		}
		return result;
	}

}
