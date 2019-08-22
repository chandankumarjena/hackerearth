package com.chandan.basicprogramming.implemantation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * @author chandankumarjena
 * add and update an array by the following condition
 * 1 x y- update x at location y
 * 2 L R - add from L to R 
 *
 */
public class ArrayInsert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = bufferedReader.readLine();
		String []strs1 = line1.trim().split("\\s+");
		int queryNumber = Integer.parseInt(strs1[1]);
		String line2 = bufferedReader.readLine();
		String []strs2 = line2.trim().split("\\s+");
		int []array = Arrays.stream(strs2).mapToInt(Integer::parseInt).toArray();
		while (queryNumber-- > 0) {
			String line3 = bufferedReader.readLine();
			String []strs3 = line3.trim().split("\\s+");
			if(Integer.parseInt(strs3[0]) == 1) {
				array[Integer.parseInt(strs3[1])] = Integer.parseInt(strs3[2]); 
			} else {
				int sum = 0;
				for (int i = Integer.parseInt(strs3[1]); i<= Integer.parseInt(strs3[2]) ; i++ ) {
					sum = sum + array[i];
				}
				System.out.println(sum);
			}	
		}
	}

}



