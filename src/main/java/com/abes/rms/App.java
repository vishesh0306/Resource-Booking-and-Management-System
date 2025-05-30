package com.abes.rms;

import java.util.*; 
import com.abes.rms.controller.*;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("************************************WELCOME TO RMS*******************************");
		System.out.println("|                              You want to Continue as:                           |");
		System.out.println("|  customer-> Customer      |  manager-> Manager      | admin-> Admin             |");
		System.out.println("|  help-> Show List         |  quit-> Quit            |                           |");
		System.out.println("-----------------------------------------------------------------------------------");
		
		UserController user = new UserController();
		ManagerController manager = new ManagerController();
		AdminController admin = new AdminController();
		
		Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
        	System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            
            String choice = sc.nextLine();
            
            if(choice.equalsIgnoreCase("customer")) {
            	user.entry();
            }
            else if(choice.equalsIgnoreCase("manager")) {
            	manager.entry();
            }
            else if(choice.equalsIgnoreCase("admin")) {
            	admin.entry();
            }
            else if(choice.equalsIgnoreCase("help")) {
            	System.out.println("-----------------------------------------------------------------------------------");
            	System.out.println("|                              You want to Continue as:                           |");
        		System.out.println("|  customer-> Customer      |  manager-> Manager      | admin-> Admin             |");
        		System.out.println("|  help-> Show List         |  quit-> Quit            |                           |");
        		System.out.println("-----------------------------------------------------------------------------------");
            }
            else if(choice.equalsIgnoreCase("quit")) {
            	System.out.println("-----------------------------------------------------------------------------------");
        		System.out.println("Thank you for using application");
        		System.out.println("-----------------------------------------------------------------------------------");
        		System.exit(0);
            }
            else {
            	System.out.println("-----------------------------------------------------------------------------------");
        		System.out.println("Wrong choice");
            }
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("Do you want to continue(y/n)? ");
            String choice2 = sc.next();
            sc.nextLine();
            if(choice2.equalsIgnoreCase("n")) flag = false;
        }
    }
}
