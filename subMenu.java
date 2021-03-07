package LockerPvtLtd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class subMenu {
	
	static String path = mainMenu.path;  // Calling static variable on Class mainMenu 
	static Scanner sc1 = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static Scanner sc3 = new Scanner(System.in);
	
	public void searchfile()   // Search file  in the directory
	{   
		
		//Scanner sc = new Scanner(System.in);
		 System.out.println(" please enter the file name  ");
		 String filename = sc1.next();
		 File searchfile = new File(path +"/"+filename);
	

	        if(searchfile.exists())
	            System.out.println("    FOUND : File \""+filename+"\" exists at "+ path +"\n");
	        else
	            System.out.println("    File NOT found (FNF)\n");
		//sc1.close();

	}
	@SuppressWarnings("unlikely-arg-type")
	public void addfile()    // add file in the directory
	{
		 //Scanner sc = new Scanner(System.in);
		 System.out.println(" please enter the file name to be added in the directory:" +  " "+ path);
		 String filename =  sc2.next();
		 File addfile = new File(path+"/"+ filename);

      
			try {
				if (addfile.createNewFile())
				    System.out.println("    File \""+filename+"\" added to "+ path +"\n");
				else if(addfile.exists())
				    System.out.println("    File \""+filename+"\" already exists at "+ path +"\n");
				else
				    System.out.println("Something went wrong. File NOT added\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sc1.equals("2")||sc1.equals("3")||sc1.equals("4")) {
				return;
			}
		
       //sc.close();
	}
	public void deletefile()  // delete file in the directory
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println(" please enter the file name to be deleted from the directory:" +  " "+ path);
		String filename = sc3.next();
		File file = new File(path+"/"+filename);

        if (file.delete())
            System.out.println("    File \""+filename+"\" deleted from "+ path +"\n");
        else
            System.out.println("    Delete Operation failed. FILE could not be  found \n");
		
        //sc.close();
	}	
}
