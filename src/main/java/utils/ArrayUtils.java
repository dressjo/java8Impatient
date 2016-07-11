package utils;

import java.io.File;

public class ArrayUtils {
	
	public static void printFiles(File[] files) {
	
	  for(File file : files) { 
	     System.out.println((file.isDirectory() ? "Dir: " : "File: ") + "\t\t" + file.getAbsolutePath());
	  }
	
	}
}

