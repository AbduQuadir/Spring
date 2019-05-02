package com.test;

public class Test33 {
	public static void main(String []args){
		 String a = "abd";
		 String b = "0";
        if(b.equalsIgnoreCase("0")){
        	System.out.println("abdul");
        	if(a.equalsIgnoreCase("abd")){
        		System.out.println("quaidr");
        	}else{
        		System.out.println("else part");
        	}
        }else if(b.equalsIgnoreCase("0")){
        	System.out.println("else if condition");
        	if(b.equalsIgnoreCase("abd")){
        		System.out.println("inside else if condition to if");
        	}else{
        		System.out.println("inside else if condition to else");
        	}
        }else if(b.equalsIgnoreCase("0")){
        	System.out.println("else if 2condition");
        	if(b.equalsIgnoreCase("abd")){
        		System.out.println("inside else if 2condition to if");
        	}else{
        		System.out.println("inside else if 2condition to else");
        	}
        }else{
        	System.out.println("last else fuction to directly considiration");
        }
	}
}
