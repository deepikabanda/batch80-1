package com.corejava;

public class Demo2 {
       static {
    	   System.out.println("static block called");
       }
     {
    	 System.out.println("instance method called");	
    }
     public static void main(String[] args) {
  	   System.out.println("main mathod started");
  	 Demo2 D2 = new Demo2();
	   System.out.println("main mathod ended");
     }
       static {
      	   System.out.println("static block called1");

       }

     }
