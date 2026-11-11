package com.operators;
//bitwise operator....{ &&(AND),  (0R)||, ! }
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
	System.out.println(x);
	int x4=-2;
	int y4=-5;
	int s = x4*x4 + (--y4*--y4 )- (x4++*x4++ ) - y4++ + x4-- + y4--;
	System.out.println(s);
	
    System.out.println(x>y && x<y);
    System.out.println(x>y && y<x);
    System.out.println(x>y && y>x);
    System.out.println(y>x&& x<y);
    System.out.println(x>y &y<x);

    System.out.println(x>y || x<y);
    System.out.println(x>y && y>x);
    System.out.println(y>x&& x<y);
    System.out.println(x>y && y>x);
   

	}

}

