package com.fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=100; 
		int n2=1;
		int n3=2;
		System.out.println("Fibonacci series between 1 to 100 is :");
		System.out.println(n2);
		while (n3 <= n1) {
            System.out.println(n3);
            int next = n2 + n3;
            n2 = n3;
            n3 = next;
        }
}
}
