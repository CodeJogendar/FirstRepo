package com.app;

public class Swap2 {
	public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping, a = " + a
                           + " and b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping, a = " + a
                           + " and b = " + b);
    }

}
