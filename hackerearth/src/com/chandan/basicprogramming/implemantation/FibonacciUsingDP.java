package com.chandan.basicprogramming.implemantation;

public class FibonacciUsingDP {
	static int fib(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100; 
        System.out.println(fib(n));
	}

}
