package ch1;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalArraySort {

	public static void main(String[] args) {

		String[] words = new String[] { "Adam", "bosse", "Bertil", "Cesar" };

		// Non functional
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
			     return o2.compareTo(o1);
			}
		});
		
		printStringArray(Arrays.asList(words));
		
		// Functional, use lambda expression
		Comparator<String> comp = (string1, string2) -> { 
			return string1.compareTo(string2);
		};
		Arrays.sort(words, comp);
		
		// Functional, use lambda expression withoug declaring assigning it to a class
		Arrays.sort(words, (string1, string2) -> { 
			return string1.compareTo(string2);});
		
		Arrays.asList(words);
		
		MagicalFunctionaInterface magical = (String magicThingsToDo) -> { System.out.println(magicThingsToDo);};
		new MagicalThings().magician("Fuck me", magical);
		
		// Use existing
		Arrays.sort(words, String::compareToIgnoreCase);
		
		printStringArray(Arrays.asList(words));
		
		// Use my own comparator
		MyString[] wordsm = new MyString[] { new MyString("Adam"), new MyString("bosse"), new MyString("Bertil"), new MyString("Cesar") };
	    Arrays.sort(wordsm, MyString::compareToIgnoreCase);
		
	    printStringArray(Arrays.asList(wordsm));
	    
	    // Convert to stream to an array of MyString
	    List<String> labels = Arrays.asList("Pelle", "Kalle"); ; 
	    Stream<MyString> stream = labels.stream().map(MyString::new);
	    MyString[] array = stream.toArray(MyString[]::new);
	    for(MyString ms : array) {
	    	out.println(ms);
	    }
	    
	    Comparator<String> compFromStaticComparing = Comparator.comparing(String::length);
	    Arrays.sort(words, compFromStaticComparing);
	    printStringArray(Arrays.asList(words));
	    
	}

	public static class MagicalThings {
		public void magician(String thingToDo, MagicalFunctionaInterface magicalFunctionalInterface) { 
			magicalFunctionalInterface.doMagic(thingToDo);
		}
	}
	
	public static class MyString {

		String value;
		
		public MyString(String value) { 
			this.value = value;
		}
		
		public int compareToIgnoreCase(MyString otherString) {
		      return otherString.value.compareToIgnoreCase(value);	
		}
		
		public String toString() { 
			return value;
		}
		
	}
	
	private static <T> void printStringArray(List<T> arrayToPrint) {
		for(T t : arrayToPrint) { 
			System.out.println(t.toString());
		}
	}

	private static void printStrings(String[] strings) { 
		out.println(strings[0]);
	}
	
	
}
