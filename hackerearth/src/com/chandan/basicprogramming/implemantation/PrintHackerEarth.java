package com.chandan.basicprogramming.implemantation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintHackerEarth {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length=Integer.parseInt(br.readLine());
		String s=br.readLine();
		//7 unique character in hackerearth 
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0;
		for(int i = 0; i<length; i++) {
			char c = s.charAt(i);
			if(c=='a')
				count1++;
			else if(c=='c')
				count2++;
			else if(c=='e')
				count3++;
			else if(c=='h')
				count4++;
			else if(c=='r')
				count5++;
			else if(c=='k')
				count6++;
			else if(c=='t')
				count7++;
		}
		// duplicates character making half.
		count4=(int)(count4/2);
		count1=(int)(count1/2);
		count5=(int)(count5/2);
		count3=(int)(count3/2);
		
		int counter[]={count1,count2,count3,count4,count5,count6,count7};
		Arrays.sort(counter);
		//minimum counts of a character signifies the number of 
		
		int ans = counter[0];
		System.out.println(ans);
	}
}
