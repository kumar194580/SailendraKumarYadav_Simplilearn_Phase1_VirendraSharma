package LockerPvtLtd;

import java.io.File;
import java.util.Scanner;

//This class contain the methode for the main menu for example 
//getfilename-> code for get file names in the directory on press "1".
//managefile-> code for entering in the subMenu( for example 1 to search file name in the directory, 2. to add file in the directory,,etc
// exitApplication-> code to exit the Application on pressing "3"

public class mainMenu{
	
	
	static String path = "C:\\Users\\ikumm\\OneDrive\\Dokumente\\Simplilearn\\project1\\testfilenameforproject1"; 
	//static String path = runApplication.path;
	static manageMainMenu obj = new manageMainMenu();
	
	public void getFilesNames()  //Retrieve the file names in the directory in an ascending order


	{
		
		System.out.println("The directoy contain following files:");
		File dir = new File(path);
		File[] listOfFiles = dir.listFiles();
		String[] flist = dir.list(); 
       // int flag = 0; 
        if (flist == null) { 
            System.out.println("the  directory is empty");
        }

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());  // Retrieve File names
		    }
		}
		
		
	}
	
	public void exitApplication()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you sure you want to exit the Application?");
		System.out.println("\n Enter (Y/y)->YES    To exit the Application?");
		System.out.println("\n Enter (N/n)-> NO    To return Main Menu ");
		String exit = sc.next();	
		
		
		if(exit.equals("y") ||exit.equals("Y")){
			System.out.println("thank you for using the Application");	
			System.exit(0);
		}
		else if (exit.equals("n")||exit.equals("N"))
		{
			System.out.println("1. to search the file name");
			System.out.println("1. to get the file name in the directory ");
			System.out.println("2. to search, add or add files in the directory");
			System.out.println("3. to Exit the Application");
			obj.managingMainMenu();
		}
		else if (!(((exit.equals("n")||exit.equals("N"))||(exit.equals("y")||exit.equals("Y")))))
		{
			System.out.println("Please enter valid input");
			
			
		}
		sc.close();
		
	}
	
	
	
	
	

}
