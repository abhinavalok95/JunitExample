package com.mslc;

public class HelloWorld {
	 private String name = "";

	   public String getName() 
	   {
	      return name;
	   }

	   public String getMessage() 
	   {
	      if (name == "") 
	      {
		      System.out.print("Commit changes test");
	         return "Hello!";
		      
	      }
	      else 
	      {
		      System.out.print("Commit changes test");
	         return "Hello " + name + "!";
		      
	      }
	   }

	   public void setName(String name) 
	   {
	      this.name = name;
	   }
	

}
