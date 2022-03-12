package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class Option1 {
	
	static String directory_name = "C:\\Users\\verma\\OneDrive\\Desktop\\Simplilearn\\Projects\\LockedMe.com\\File_Storage\\LockedMe";
	
	public static Boolean setCurrentDirectory(String new_directory_name)
    {
        boolean result = false;  // Boolean indicating whether directory was set
        File    directory;       // Desired current working directory
        directory_name = "C:\\Users\\verma\\OneDrive\\Desktop\\Simplilearn\\Projects\\LockedMe.com\\File_Storage\\" + new_directory_name;
        directory = new File(directory_name).getAbsoluteFile();
        if (directory.exists() || directory.mkdirs())
        {
            result = (System.setProperty("user.dir", directory.getAbsolutePath()) != null);
        }

        return result;
    }
	
	public static String getCurrentDirectoryPath() {
		return directory_name;
	}
	
	public static void showFiles() {
		File directoryPath = new File(directory_name);
		String files[] = directoryPath.list();
		Arrays.sort(files);
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i]);
		}
	}
}
