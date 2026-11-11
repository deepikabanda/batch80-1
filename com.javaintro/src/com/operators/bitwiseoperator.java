package com.operators;

public class bitwiseoperator {

	public static void main(String[] args) {
		System.out.println("...birwise operators...");
		int x=5;
		int y=4;
        int z= x^2+ (--y)^2 - (x++)^2  - y++ + x-- + y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
 int a=-2;
 int b=-5;
 x = (x++ * 2) - (y - 2) + ((x--)- 4) + (y++ * 4);
 System.out.println(a);
	System.out.println(b);

	}

}
