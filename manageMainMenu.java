package LockerPvtLtd;

import java.util.Scanner;

public class manageMainMenu {
	

	static String path = mainMenu.path; 
	static  Scanner sc = new Scanner(System.in);
	static mainMenu obj1 = new mainMenu();
	static subMenu obj2 = new subMenu();
	static manageSubMenu obj3 = new manageSubMenu();
	
	
	public void managingMainMenu(){  
	do {	
    String  user_input = sc.next();
  
	switch(user_input) {

	// case1 to retrieve file name from the directory( press1)
	case "1":
     obj1.getFilesNames();
			 
	break;
	
	case "2":     // manage directory
	obj3.managingSubMenu();
			
	break;
		
	case "3": // Exit Application
	obj1.exitApplication();
					
	break;
		
	default: 

			
		    System.out.println(" Invalid input, please Enter from the following options: ");
			System.out.println("Enter 1. to get the file name in the directory ");
			System.out.println("Enter 2. to search, add or add files in the directory");
			System.out.println("Enter 3. to Exit the Application");		
			
   }
	}
			
   while(true);
			
			
			
	}
	
	
	
	
	
	
	
	
}
	
	
	
	



