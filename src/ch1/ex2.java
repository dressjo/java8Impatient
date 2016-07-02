package ch1;

import java.io.File;
import java.io.FileFilter;

public class ex2 {

	public static void main(String[] args) { 

		System.out.println("*************** Non Lambda*******************\n");
		int noOccur = 0;
		
		File[] dirs = new File("c:/").listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.isDirectory();
			}
		});
		
		for(File file : dirs) { 
			System.out.println(file);
			noOccur++;
		}
		System.out.println("\nTotal directorys: " + noOccur);
		
		System.out.println("\n\n*****************Lambda********************\n");
		File[] dirsLambda = new File("c:/").listFiles((File file) -> { 
			return file.isDirectory();
		});
		
		noOccur = 0;
		for(File file : dirsLambda) { 
			System.out.println(file);
			noOccur++;
		}
		System.out.println("\nTotal directorys: " + noOccur);
	}
	
}
