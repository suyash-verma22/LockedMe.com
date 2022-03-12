package com.LockedMe;
import java.util.Scanner;

public class Welcome {
	static Scanner scan = new Scanner(System.in);
	public static void appInfo() {
		System.out.println("                                        |*********************|");
		System.out.println("                                        |*Welcome to LockedMe*|");
		System.out.println("                                        |*********************|");
		
		System.out.println("Application Name : LockedMe.com");
		System.out.println("Developer Name   : Suyash verma");
		
		System.out.println("*******************************");
	}
	
	public static void chooseOption() {
		System.out.println("Menu : Select ");
		System.out.println("*************");
		System.out.println("1 -> View Files in the directory");
		System.out.println("2 -> Operations on File");
		System.out.println("3 -> Close Application");
		System.out.println("*******************************");
		
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
				inOption2();
				break; 
			case 3:
				System.out.println("*******************************");
				System.out.println("********** Bye Bye ************");
				System.out.println("*******************************");
				System.exit(0);
				break;
			default:
				System.out.println(Option1.getCurrentDirectoryPath()); 
				System.out.println("Value entered is out of option");
				System.out.print("Returning back to main menu");
		}
		}
	}
	
	public static void inOption2() {
		System.out.println("Menu : Select ");
		System.out.println("*************");
		System.out.println("1 -> Search File");
		System.out.println("2 -> Add a File");
		System.out.println("3 -> Delete a File");
		System.out.println("4 -> Back to Main menu");

		System.out.println("Enter option number: ");
		while(true) {
			int option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Search File is selected. Enter file name: ");
				String fileName = scan.nextLine();
				Option2.searchFile(fileName);
				break;
			case 2:
				System.out.println("Add File is selected. Enter file name: ");
				
				break; 
			case 3:
				System.out.println("Delete File is selected. Enter file name: ");
				break;
			case 4:
				System.out.println("Back to main menu: ");
				System.out.println();
				System.out.println();
				chooseOption();
		}
	}
}
}
