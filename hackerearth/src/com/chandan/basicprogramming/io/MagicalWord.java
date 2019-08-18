package com.chandan.basicprogramming.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicalWord {
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int p[] = {67,71,73,79,83,89,97,101,103,107,109,113};
		int testCases = Integer.parseInt(bufferedReader.readLine());
        int length = 0;
        String st ;
        String res;
        int it = 0;
        int pd = 0;
        int nd = 0;
        
        while(testCases -- >0)
        {
            res = "";
            length = Integer.parseInt(bufferedReader.readLine());
            st = bufferedReader.readLine();
            for(int i=0;i<length;i++)
            {
            	
                 it = 0;
                 pd = 0;
                 nd = 0;
                if(st.charAt(i)<=67){
                    res += (char)67;
                }
                else if(st.charAt(i) >= 113) {
                    res += (char)113;
                }
                else {
                    while(st.charAt(i) >= p[it])
                        it++;
                   pd = st.charAt(i)- p[it-1] ;
                   nd = p[it] - st.charAt(i) ;
                   if(pd<=nd) {
                       res += (char)p[it-1];
                    }
                    else {
                       res += (char)p[it];
                    }
                }
            }
            System.out.println(res);
        } 
	}
}
