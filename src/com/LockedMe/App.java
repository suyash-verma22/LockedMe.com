package com.LockedMe;

import java.util.Scanner;
public class App {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String []args) {
		
		System.out.println("                                        |*********************|");
		System.out.println("                                        |*Welcome to LockedMe*|");
		System.out.println("                                        |*********************|");
		
		System.out.println("Application Name : LockedMe.com");
		System.out.println("Developer Name   : Suyash verma");
		
		System.out.println("*******************************");
		
		System.out.println("Menu : Select ");
		System.out.println("*************");
		System.out.println("1 -> View Files in the directory");
		System.out.println("2 -> Operations on File");
		System.out.println("3 -> Close Application");
		
		System.out.println("*******************************");
		
		Option1.setCurrentDirectory("LockedMe"); //set new current directory
		
		System.out.println("Enter option number: ");
		while(true) {
			int option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Option 1 is selected");
				Option1.showFiles();
				break;
			case 2:
				System.out.println("Option 2 is selected");
				break; 
			case 3:
				System.out.println("*******************************");
				System.out.println("********** Bye Bye ************");
				System.out.println("*******************************");
				System.exit(0);
				break;
			default:
				System.out.println(Option1.setCurrentDirectory("LockedMe")); 
				System.out.println("Value entered is out of option");
				System.out.print("Returning back to main menu");
		}
		}
			
	}

}
