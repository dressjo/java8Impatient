package ch1;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import utils.ArrayUtils;

public class ex4 {

	public static void main(String[] args) {

		 File root = new File("c:\\");
		 
		 File[] rootFiles = root.listFiles();
		 ArrayUtils.printFiles(rootFiles);
		 
		 System.out.println("\n************ Sorted List *************\n");
		 
		 Arrays.sort(rootFiles, (File file1, File file2) -> { return file1.getName().toLowerCase().compareTo(file2.getName().toLowerCase()); });
	     ArrayUtils.printFiles(rootFiles);
	     
	     System.out.println("\n************ Sorted List2 *************\n");
	     
	     Arrays.sort(rootFiles, (File file1, File file2) -> { return Boolean.compare(file1.isDirectory(), file2.isDirectory()); });
	     ArrayUtils.printFiles(rootFiles);
	     
	}

}
