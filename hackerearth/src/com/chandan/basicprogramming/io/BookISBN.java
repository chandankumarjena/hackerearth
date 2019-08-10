package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookISBN {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		char []array = bufferedReader.readLine().toCharArray();
		//10 digit
		if(array.length == 10) {
			int total = 0;
			for(int i = 0; i < 10; i++) {
				int j = i + 1;
				total = total + (j*Character.getNumericValue(array[i]));
			}
			if(total % 11 == 0) {
				System.out.println("Legal ISBN");
			} else {
				System.out.println("Illegal ISBN");
			}	
		} else {
			System.out.println("Illegal ISBN");
		}
 }
}
