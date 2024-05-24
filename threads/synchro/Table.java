package com.mkpits.threads.synchro;

public class Table { 
	
	     //synchronized method 
		 synchronized void printTable(int n){ 
		   System.out.println("Table Of "+n);
//		   synchronized (this) {
//			
//		}
		   for(int i=1;i<=10;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(1000);  
		     }catch(Exception e){
		    	 System.out.println(e);
		    }  
		   }  
	}  

}
