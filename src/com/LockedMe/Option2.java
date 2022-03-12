package com.LockedMe;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class Option2 {
	
	public static void performOption2() {
		
	}
	//search file in the directory
	public static Boolean searchFile(String fileName) {
		File directoryPath = new File(Option1.directory_path);
		String files[] = directoryPath.list();
		Arrays.sort(files);
		for(int i=0;i<files.length;i++) {
			if(files[i] == fileName) {
				System.out.println(fileName + " exists in the folder");
				return true;
			}
		}
		System.out.println(fileName + " doesn't exists in folder");
		return false;
	}
	//add file in the directory
	public static void addFile(String fileName) {
		if(!searchFile(fileName)) {
			String file_name = Option1.directory_path + "fileName";
			File newFile  = new File(file_name);
			try {
				if(newFile.createNewFile()) {
					System.out.println("New file created with filename: " + fileName);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
