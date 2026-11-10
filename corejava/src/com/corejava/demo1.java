package com.corejava;

public class demo1 {
	demo1 d1 = new demo1();
	static {
 	   System.out.println("static block called");
    }
  {
 	 System.out.println("instance method called");	
 }
  public static void main(String[] args) {
	   System.out.println("main mathod started");
	   System.out.println("main mathod ended");
  }
    static {
   	   System.out.println("static block called1");

    }

  }



