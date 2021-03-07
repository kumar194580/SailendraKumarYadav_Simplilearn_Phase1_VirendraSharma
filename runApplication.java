
package LockerPvtLtd;

//import java.util.Scanner;

public class runApplication {

	//static String path = "C:\\Users\\ikumm\\OneDrive\\Dokumente\\Simplilearn\\project1\\testfilenameforproject1";  // directory name 
	static manageMainMenu obj = new manageMainMenu();
	public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::LockedMe.com :::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::Application created by: Sailendra Kumar Yadav:::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("please select from the below options: ");
		System.out.println("  ");
		System.out.println("Enter 1. to get the file name in the directory ");
		System.out.println("Enter 2. to search, add or delete files in the directory");
		System.out.println("Enter 3. to Exit the Application");
		 
				
	      do {
	        	
			    obj.managingMainMenu();
	 
	       
	      }
	      while(true);
	

	}

}
