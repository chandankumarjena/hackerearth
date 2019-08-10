package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * find which lift will come for service.
 * two lift in a building A in groud floor and B in 7th floor.
 * A person in N floor looking for a lift which lift will come.
 * condition:-
 * 1 :- the nearer one.
 * 2 :- if equal distance then the lift that is in ground floor.
 *
 */
public class LiftQueries {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		int a = 0, b = 7;
		while (testCase -- > 0) {
			int floorNumber = Integer.parseInt(bufferedReader.readLine());
			int p = Math.abs(a-floorNumber);
			int q = Math.abs(b-floorNumber);
			if (p <= q) {
				System.out.println("A");
				a = floorNumber;
			} else {
				System.out.println("B");
				b = floorNumber;
			}
		}
		

	}

}
