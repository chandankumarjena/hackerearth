package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * who will put the last Bricks, if there are two people
 * and rule is if first person will put i then second person will
 * put i*2
 * Example there are 13 bricks.
 * first second	total
 * 1      2		3
 * 2	  4		9
 * 3      1		13
 * so here the second person is putting the last bricks.
 */
public class BrickGames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfBricks = Integer.parseInt(bufferedReader.readLine());
		int i = 1;
		while (numberOfBricks > 0) {
			numberOfBricks -= i;
			if(numberOfBricks<=0) {
				System.out.println("Patlu");
				break;
			}
			numberOfBricks -= i*2;
			if(numberOfBricks <= 0) {
				System.out.println("Motu");
				break;
			}
			i++;
		}
	}
}
