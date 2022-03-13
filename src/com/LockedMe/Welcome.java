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
	
	public static void displayMenu() {
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
				menuForOperationsOnFile();
				break; 
			case 3:
				System.out.println("                                *******************************");
				System.out.println("                                ********* XXX END XXX *********");
				System.out.println("                                *******************************");
				System.exit(0);
				break;
			default:
				System.out.println(Option1.getCurrentDirectoryPath()); 
				System.out.println("Choose from the Menu");
				System.out.print("<-- Main menu");
		}
		}
	}
	
	public static void menuForOperationsOnFile() {
		System.out.println("Menu : Select ");
		System.out.println("********************************");
		System.out.println("1 -> Search File");
		System.out.println("2 -> Add a File");
		System.out.println("3 -> Delete a File");
		System.out.println("4 -> Back to Main menu");
		System.out.println("********************************");
		System.out.println("Enter option number: ");
		while(true) {
			int option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Search File is selected. Enter file name: ");
				String fileName = scan.next();
				Option2.searchFile(fileName);
				break;
			case 2:
				System.out.println("Add File is selected. Enter file name: ");
				String fileName1 = scan.next();
				Option2.addFile(fileName1);
				break; 
			case 3:
				System.out.println("Delete File is selected. Enter file name: ");
				String fileName2 = scan.next();
				Option2.deleteFile(fileName2);
				break;
			case 4:
				System.out.println("Back to main menu: ");
				displayMenu();
		}
	}
}
}
