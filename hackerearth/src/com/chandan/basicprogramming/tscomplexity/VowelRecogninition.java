package com.chandan.basicprogramming.tscomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * there are n number of test cases.
 * each test case contains a string.
 * find the total vowel present in the substring
 * and return total vowel present in each combination.
 * example - baceb
 * substrings----no of vowel
 * b---0
 * ba--1
 * bac---1
 * bace---2
 * baceb--2
 * a---1
 * ac---0
 * ace--2
 * aceb--2
 * c---0
 * ce--1
 * ceb---1
 * e---1
 * eb--1
 * 
 *total - 16
 * 
 *
 */
public class VowelRecogninition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(bufferedReader.readLine());
		while(testCases-- > 0) {
            String st = bufferedReader.readLine();
            long count = 0;
            for (long i = 0; i < st.length(); i++) {
                if(Character.toLowerCase(st.charAt((int)i))=='a'
                		||Character.toLowerCase(st.charAt((int)i))=='e'
                		||Character.toLowerCase(st.charAt((int)i))=='i'
                		||Character.toLowerCase(st.charAt((int)i))=='o'
                		||Character.toLowerCase(st.charAt((int)i))=='u') {
                    count+=(st.length()-i)*(i+1);
                }
            }
            System.out.println(count);
        }
	}
}


