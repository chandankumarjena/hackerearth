package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SevenSegmentDisplay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<=t-1;i++)
		{
			int j;
			int sum=0;
			String str=br.readLine();
			int b=str.length();
			for(j=0;j<=b-1;j++)
			{
				//char c=str.charAt
				if(str.charAt(j)=='0' || str.charAt(j)=='6' || str.charAt(j)=='9')
				{
					sum+=6;
				}
				else if(str.charAt(j)=='1')
				{
					sum+=2;
				}
				else if(str.charAt(j)=='2' || str.charAt(j)=='3' || str.charAt(j)=='5')
				{
					sum+=5;
				}
				else if(str.charAt(j)=='4')
				{
					sum+=4;
				}
				else if(str.charAt(j)=='7')
				{
					sum+=3;
				}
				else if(str.charAt(j)=='8')
				{
					sum+=7;
				}
		   }
			if(sum%2==0)
			{
				for(j=1;j<=sum/2;j++)
				{
					System.out.print("1");
				}
			}
			else
			{
				System.out.print("7");
				sum=sum-3;
				for(j=1;j<=sum/2;j++)
				{
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
	}

}
