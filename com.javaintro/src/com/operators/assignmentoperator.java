package com.operators;
//assignment operators....{ +=, -+, *=, /=, %= }
public class assignmentoperator {

	public static void main(String[] args) {
		System.out.println("main method started");
     int a=14;
     int b=6;
     int c=3;
     a+=2;
		System.out.println(a);  //16 from now the onwards the value of a=16
		a-=3;
		System.out.println(a);  //13  from now the onwards the value of a=13
		b-=2;
		System.out.println(b);  //4 same as a
//the above are single values
		a+=b;
		System.out.println(a);  //17
		a-=b;
		System.out.println(a);  //13
		a*=b;
		System.out.println(a);  
		a/=b;
		System.out.println(a);  
		a%=b;
		System.out.println(a);  //1
		b+=a;
		System.out.println(b);  //5
		a+=b+=c;
		System.out.println(a);  //9
			

	}

}
