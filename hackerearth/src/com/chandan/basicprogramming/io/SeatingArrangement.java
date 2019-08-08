package com.chandan.basicprogramming.io;
/* In a railway coach there are 108 number of seat with 9 block.
 * Every block consists of 12 seats And each seat status like 
 * WS - Window Seat.
 * MS - Middle Seat.
 * AS - Arriel Seat.
 * You are given a seat number and you have to find the opposite seat
 * number with its status. 
 * 
 * Example:- 
 * 1 2 3 4 5 6 
 * 12 11 10 9 8 7
 * 
 * input 3 
 * output 11 MS
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SeatingArrangement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int seatNumber = Integer.parseInt(br.readLine());
			int remender = seatNumber % 6;
			int compartment =  (int) Math.floor((seatNumber-1)/12);
			int compartmentFirstSeatNumber = (compartment*12) + 1;
			int compartmentLastSeatNumber = compartmentFirstSeatNumber + 11;
			int distance = compartmentLastSeatNumber - seatNumber;
			int oppositeSeatNumber = compartmentFirstSeatNumber + distance;
			String seatStatus = "";
			if(remender == 0 || remender == 1) {
				seatStatus = "WS";
			} else if(remender == 2 || remender == 5){
				seatStatus = "MS";
			} else {
				seatStatus = "AS";
			}			
			System.out.println(oppositeSeatNumber +" "+seatStatus);		
		}
	}

}
