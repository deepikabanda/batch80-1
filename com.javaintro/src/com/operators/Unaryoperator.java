package com.operators;
//Unary operator....{ ++, --, }
public class Unaryoperator {

	public static void main(String[] args) {
		System.out.println("main method started");              //post, pre increment,decrement
		int a=10;
		int b=4;
		System.out.println(a++);  //10---11  writtens 10 but executes 11(shows 10 but)
		System.out.println(++a);  //12
		System.out.println(a--);  //12---11
		System.out.println(--a);  //10
		System.out.println(b++);  //4---5
		System.out.println(++b);  //6
		System.out.println(+a);
		System.out.println(-b);



	}

}
