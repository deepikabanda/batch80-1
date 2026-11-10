package com.corejava;

public class batch80 {
    static {
    	System.out.println("static block called");
    }
    {
    	 System.out.println("instance method called");	
    	 batch80 B2 = new batch80();
    }
	public static void main(String[] args) {
    	System.out.println("main method started");
    	System.out.println("main method ended");
	}
	static {
    	System.out.println("static method called1");
	}
	{
   	 System.out.println("instance method called1");	
	}


    	
    	

	

	}


