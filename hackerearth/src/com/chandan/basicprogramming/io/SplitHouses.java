package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitHouses {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());
        int i;
        String str=br.readLine();
        for(i=0;i<number-1;i++)
        {
        	if(str.charAt(i)=='H' && str.charAt(i+1)=='H')
        		break;
        }
        if(i==number-1)
        {
        	    System.out.println("YES");
                System.out.print(str.replace('.','B'));
        }
        else {
            System.out.println("NO");
        }
	}

}
