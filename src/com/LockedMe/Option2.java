package com.LockedMe;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileWriter;

public class Option2 {
	
	static Scanner scan = new Scanner(System.in);
	public static void performOption2() {
		
	}
	//search file in the directory
	public static Boolean searchFile(String fileName) {
		File directoryPath = new File(Option1.directory_name);
		String files[] = directoryPath.list();
		Arrays.sort(files);
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i]);
		}
		for(int i=0;i<files.length;i++) {
			if(files[i].equals(fileName)) {
				System.out.println(fileName + " exists in the folder");
				return true;
			}
		}
		System.out.println(fileName + " doesn't exists in folder");
		return false;
	}
	//add file in the directory
	public static void addFile(String fileName) {
		String file_name =  Option1.directory_name + "\\" + fileName;
		System.out.println(file_name);
		File newFile  = new File(file_name);
		if(newFile.exists()) {
			System.out.println("File already exists");
		}
		else {
			try {
				if(newFile.createNewFile()) {
					System.out.println("New file created with filename: " + fileName);
				}
			}catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		System.out.print("Add content to the file? (y|Y for Yes and n|N for No : ");
		String choose = scan.next();
		if(choose.equalsIgnoreCase("y")) {
			addContentInFile(file_name);
		}else {
			
		}
	}
	//delete a file in the directory
	public static void deleteFile(String fileName) {
		String file_name =  Option1.directory_name + "\\" + fileName;
		System.out.println(file_name);
		File myObj = new File(file_name); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the folder: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the folder.");
	    }
	}
	//add content in the file
	public static void addContentInFile(String file_name) {
		System.out.print("Enter number of lines: ");
		String line_count = scan.next();
		int count = Integer.parseInt(line_count);
		System.out.println();
		String []lines = new String[count];
		for(int i=0;i<count;i++) {
			System.out.println("Enter line " + (i+1) + " : ");
			lines[i] = scan.nextLine();
			System.out.println();
		}
		File curr_working_file = new File(file_name);
		if(curr_working_file.canWrite()) {
			try {
				FileWriter myWriter = new FileWriter(file_name);
				for(int i=0;i<count;i++) {
					myWriter.write(lines[i]);
				}
				myWriter.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
