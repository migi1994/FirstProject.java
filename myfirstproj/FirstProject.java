package myfirstproj;

import java.io.File;

import java.util.Arrays;

public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    
		
	String[]stArray = {"fjp.txt","javaFile.txt"};

		System.out.println("list of the file names in Ascending order =" + Arrays.toString(stArray));
	
	    try {
			
			File file=new File("First proj.txt"); //this is where I createthe file
		     if(file.createNewFile()) {
		    	 System.out.println("New File is added! ");
		    	  System.out.println("file located:" +file.getAbsolutePath());   /// I use getAbsolutePath to search the file
		 }
		  else 
	 	if(file.exists()) {
	      System.out.println("file exists");
	   }
	     System.out.println("Exit");
		     
		     /*  // deleleting the file////
	   	  
       boolean  f=file.delete();
	      if (f==true ) {
	    	   {System.out.println("File successfully  DELETED");
	    	   }
	      }
	     else
	     {System.out.println("THIS FILE IS  DELETED");
	     }
	     boolean F=file.delete();
	     if (F=false) {
	    System.out.println(" File Not Found");
	     }
	   	{
	  }
	  */
	}
		catch (Exception e) {
	    
	    System.out.println("Error");
	   
		
		}
	     } 
	     }	   	



