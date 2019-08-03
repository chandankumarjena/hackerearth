package com.chandan.basicprogramming.io;
/* find all the prime number list till an input number N. 
 * input number 9
 * output result 2 3 5 7
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		for (int i = 2; i<= number ; i++) {
			boolean status = checkPrime(i);
			if(status) {
				System.out.print(i + " ");
			}
		}		
		br.close();
	}

	private static boolean checkPrime(int number) {
		// TODO Auto-generated method stub
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i<=Math.sqrt(number); i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}

}
