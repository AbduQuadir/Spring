package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Test11 {

	static String driver1 = "com.mysql.jdbc.Driver";
	static String url1 = "jdbc:mysql://108.170.52.58:3306/genset_electricalss";
	static String url2 = "jdbc:mysql://108.170.52.58:3306/smssend";
	static String usr1 = "root";
	static String pswd1 = "N5S$*zDb!%p";
	public static void main(String[] args) {
		try{
			String method = null, imei=null;
			String rqs = "";
			String abdul = "imei_0867273026242672, imei_0864713034562861, imei_0865472033017133, imei_0867273021023069, imei_0867273021023067";
			String ab = abdul.replace(",", "");
	          ab = ab.replaceAll("\\s+","");
	          System.out.println(ab.length());
	          for (int i=0;i<=ab.length()-1;i +=21)
	          {
	        	System.out.println(i);
	        	String quadir = ab.substring(i,i+21);
	        	Class.forName(driver1);
	  			Connection con = DriverManager.getConnection(url1,usr1,pswd1);
	  			String sql = "select * from "+quadir+"";
	  			PreparedStatement ps = con.prepareStatement(sql);
	  			ResultSet rs = ps.executeQuery();
	  			
	       	    while(rs.next()){
	       	    	//method = rs.getString("Distance");
	       	        imei = rs.getString("imei");
	       	    }
	       	 }
	          System.out.println("The Imei:" + imei);  
	   	   
         }catch(Exception exception){
        	      System.out.println(exception);
        	 }
         }
}


