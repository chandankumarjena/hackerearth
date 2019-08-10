package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * read till 42 comes after that stop reading.
 *
 */
public class LifeUniverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // Write your code here
	        while (true) {
	            int data = Integer.parseInt(br.readLine());
	            if(data == 42) {
	                break;
	            } else {
	                System.out.println(data);
	            }
	      }
	}
}
