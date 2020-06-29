package com.chandan.basicprogramming.operators;

import java.util.Scanner;

public class UnderstandComputer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long testCase = sc.nextLong();
		while (testCase > 0) {
			long number = sc.nextLong();
			long i = 1;
			for (i = 1; i <= number; i++) {
				long remainder = number / i;
				if (countBit(remainder) <= countBit(i)) {
					break;
				}
			}
			System.out.print(number-i+1);
		}
		sc.close();
	}

	private static long countBit(long remainder) {
		// TODO Auto-generated method stub
		long count = 0;
		while(remainder>0) {
			remainder = remainder>>1;
			count++;			
		}
		return count;
	}
}
