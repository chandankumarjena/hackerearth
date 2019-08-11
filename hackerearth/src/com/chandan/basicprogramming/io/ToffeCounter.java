package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * count the number of toffee that Aman earned.
 * Condition is only he will earned the toffe if he can 
 * complete the circle. If he want run 100 * x meter than
 * he have to drink x amount of horlicks.
 *
 */
public class ToffeCounter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(bufferedReader.readLine());
		int count = 0;
		while(testCases-- > 0) {
			String line = bufferedReader.readLine();
			String []strs = line.trim().split("\\s+");
			double radious = Double.parseDouble(strs[0]);
			double x = Double.parseDouble(strs[1]);
			if((44*radious)/7 <= 100 *x)
			count++;
		}
		System.out.println(count);
	}

}
