package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * print ladder as per the input steps.
 * input :- 1 
 * output :-
 *  *	*
 *  *	*
 *  *****
 *  *	*	
 *  *	*
 * 
 *
 */
public class LadderoPhilia {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfSteps = Integer.parseInt(bufferedReader.readLine());
		while(numberOfSteps-- > 0) {
			System.out.println("*   *");
			System.out.println("*   *");
			System.out.println("*****");
		}
		System.out.println("*   *");
		System.out.println("*   *");
		
	}

}






