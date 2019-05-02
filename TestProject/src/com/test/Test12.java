package com.test;

import java.util.ArrayList;

public class Test12 {

	public static void main(String[] args) {
		
     ArrayList<String> me = new ArrayList<String>();
     me.add("abdul");
     me.add("quadir");
     String[] un = new String[me.size()];
     un = (String[]) me.toArray(un);
     for(int i=0;i<un.length;i++){
         sys = sys.substring(1, 3);
         ArrayList<String> con = new ArrayList<>();
         con.add(sys);
         String[] due = new String[con.size()];
         due = (String[]) con.toArray(due);
          String qudir = un[i];
          String sys = qudir.substring(1,3);
          System.out.println(sys);
     }
   }
}
