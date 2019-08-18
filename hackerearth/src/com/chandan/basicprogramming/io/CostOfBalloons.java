package com.chandan.basicprogramming.io;

import java.util.Scanner;

public class CostOfBalloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int g,p,n,a,b;
		
		
		for(int i = 1;i<=t; i++){
			g = sc.nextInt();
			p = sc.nextInt();
		    n = sc.nextInt();
		    int suma =0;
			int sumb =0;
			for(int j=1; j<=n;j++){
			a = sc.nextInt();
			if(a==1){
				suma++;
			}
		    b = sc.nextInt();
			if(b==1){
				sumb++;
			}
			}
			int cost1; int cost2;
			cost1= (g*suma)+(p*sumb);
			cost2 =(p*suma)+(g*sumb);
			
			System.out.println((cost1>cost2) ? cost2 : cost1);
		}
	}

}
