package ch1;

import java.io.File;
import java.io.FilenameFilter;

public class ex3 {

	public static void main(String[] args) { 

		String[] dirs = new File("c:/").list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return dir.isDirectory();
			}
		});
		
		for(String file : dirs) { 
			System.out.println(file);
		}
		
		
		String[] dirsLambda = new File("c:/").list((File file, String name) -> { return file.isDirectory();});
		
		for(String file : dirs) { 
			System.out.println(file);
		}
		
	}
	
}
