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
	         return "Hello!";
		      System.out.print("Commit changes test");
	      }
	      else 
	      {
	         return "Hello " + name + "!";
		      System.out.print("Commit changes test");
	      }
	   }

	   public void setName(String name) 
	   {
	      this.name = name;
	   }
	

}
