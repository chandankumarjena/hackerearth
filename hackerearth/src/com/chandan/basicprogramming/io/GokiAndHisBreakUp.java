package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * help goki to find a perfact friend 
 * according to his constraints mark
 * example:-
 * inputs
 * 5 - number of friends
 * 100 - asking skill total
 * 110 - first friend
 * 130 - second friend
 * 90 - third friend
 * 100 - fourth friend
 * 45 - fifth friend
 * outputs - YES YES NO YES NO
 *
 */
public class GokiAndHisBreakUp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int noOffriends = Integer.parseInt(bufferedReader.readLine());
		int askingSkillRate = Integer.parseInt(bufferedReader.readLine());
		while(noOffriends -- > 0) {
			int eachFriendRate = Integer.parseInt(bufferedReader.readLine());
			if(eachFriendRate >= askingSkillRate) {
				System.out.print("YES");
			} else {
				System.out.print("NO");
			}
		}
	}

}
