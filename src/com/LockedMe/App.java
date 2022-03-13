package com.LockedMe;

import java.util.Scanner;
public class App {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String []args) {
		Option1.setCurrentDirectory("LockedMe"); //set new current directory
		
		Welcome.appInfo();
		
		Welcome.displayMenu();
			
	}

}
