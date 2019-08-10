package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * find the resolution of photo.
 * with given height and weight and a prefixed resolution has been given.
 * the out comes will come with 
 * either CROP IT or ACCEPTED or UPLOAD ANOTHER
 * 
 * input L W H
 */
public class profilePicture {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(bufferedReader.readLine());
		int testCases = Integer.parseInt(bufferedReader.readLine());
		while (testCases -- > 0) {
			String line = bufferedReader.readLine();
			String []strs = line.trim().split("\\s+");
			int height = Integer.parseInt(strs[0]) ;
			int width = Integer.parseInt(strs[1]);
			
			if(height >= length && width >= length) {
				if (height == width) {
					System.out.println("ACCEPTED");
				} else {
					System.out.println("CROP IT");
				}
			}else {
				System.out.println("UPLOAD ANOTHER");
			}
			
			
		}
	}
}
