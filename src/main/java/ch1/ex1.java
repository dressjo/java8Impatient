package ch1;

import java.util.Arrays;
import java.util.Comparator;

public class ex1 {
	
	public static void main(String[] args) { 
		
		String[] words = new String[] { "Adam", "bosse", "Bertil", "Cesar" };
		
		// Functional, use lambda expression
		Comparator<String> comp = (string1, string2) -> {
			System.out.println("Comparator " + Thread.currentThread().toString());
			return string1.compareTo(string2);
		};
		Arrays.sort(words, comp);
		System.out.println("Main " + Thread.currentThread().toString());
	}
	

}
