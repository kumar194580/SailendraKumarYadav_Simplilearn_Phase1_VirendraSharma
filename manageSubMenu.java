package LockerPvtLtd;

import java.util.Scanner;
//import java.math.*;

public class manageSubMenu {
	
	static mainMenu obj1 = new mainMenu();
	static subMenu obj2 = new subMenu();
	static manageMainMenu obj3 = new manageMainMenu();
	static Scanner sc= new Scanner(System.in);
	
	public void managingSubMenu() {
	System.out.println("Enter 1. to search the file name");
	System.out.println("Enter 2. to add the file  ");
	System.out.println("Enter 3. to delete the file");
	System.out.println("Enter 4. to go Back to the Main menu");
	do {
	String  user_input = sc.next();

	switch(user_input){
	
	
	case "1":      // Search file name in the directory
	
		obj2.searchfile();	
		
          break;
		
	case "2":     //add file  in the directory
	
    obj2.addfile() ;
    
	break;
	
	case "3": // delete file in directory
	
		obj2.deletefile();
		
	
		
	break;
	case "4":
		
		System.out.println("Enter 1. to get the file name in the directory ");
		System.out.println("Enter 2. to search, add or delete files in the directory");
		System.out.println("Enter 3. to Exit the Application");
		obj3.managingMainMenu();
		
		break;
	default: 
		System.out.println(" Invalid input, please Enter: ");
		System.out.println("Enter 1. to search the file name");
		System.out.println("Enter 2. to add the file  ");
		System.out.println("Enter 3. to delete the file");
		System.out.println("Enter 4. to go Back to the Main menu");
		break;
	}
	}
	 while(true);
	
	
	}
}


	




