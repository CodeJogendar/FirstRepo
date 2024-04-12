package com.app;

public class reverse {
	public static void main(String[] args) {

		int n = 123, r, rn = 0;

		r = n % 10; // r=123%10 = 3
		rn = rn + r; // rn=0*10+3= 3
		n = n / 10; // n=123/10 = 12

		r = n % 10; // r=12%10 = 2
		rn = rn  + r; // rn=3*10+2= 32
		n = n / 10; // n=12/10 = 1

		r = n % 10; // r=1%10 = 1
		rn = rn * 10 + r; // rn=32*10+1= 321
		n = n / 10; // n=1/10 = 0
		r = n % 10; // r=1%10 = 1
		rn = rn  + r; // rn=32*10+1= 321
		n = n / 10;

		System.out.println("Reverse Numer is " + rn);
	
}
}	

