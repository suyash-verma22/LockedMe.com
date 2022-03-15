package com.LockedMe;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class Option2 {
	
	static Scanner scan = new Scanner(System.in);
	//search file in the directory
	public static Boolean searchFile(String fileName) {
		File directoryPath = new File(Option1.directory_name);
		String files[] = directoryPath.list();
		Arrays.sort(files);
		/*for(int i=0;i<files.length;i++) {
			System.out.println(files[i]);
		}*/
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
		//System.out.println(file_name);
		File newFile  = new File(file_name);
		if(newFile.exists()) {
			System.out.println("File already exists");
		}
		else {
			try {
				if(newFile.createNewFile()) {
					addContentInFile(file_name);
					System.out.println("New file created with filename: " + fileName);
				}
			}catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
		}
	}
	//delete a file in the directory
	public static void deleteFile(String fileName) {
		String file_name =  Option1.directory_name + "\\" + fileName;
		//System.out.println(file_name);
		File myObj = new File(file_name); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("No such file exixts.");
	    }
	}
	//add content in the file
	public static void addContentInFile(String file_name) {
		try {
			System.out.print("Enter number of lines: ");
			int count = Integer.parseInt(scan.nextLine());
			
			File curr_working_file = new File(file_name);
			if(curr_working_file.canWrite()) {
				try {
					FileWriter myWriter = new FileWriter(file_name);
					for(int i=1;i<=count;i++) {
						System.out.println("Enter line: ");
						myWriter.write(scan.nextLine() + "\n");
				    }
					myWriter.close();
				}catch(IOException e) {
					System.out.println(e);
				}
				
			}
			else 
			{
				System.out.println("Do not have write access to the file.");
			}
		}catch(Exception e) {
			System.out.println(e);;
		}
	}
}
