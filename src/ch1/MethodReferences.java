package ch1;

public class MethodReferences {
	
	public static void main(String[] args) { 
		new MethodReferences().printSomething(System.out::println);
		MethodReferences.printSomethingStatic(System.out::println);
	}
	
	@FunctionalInterface
	private interface MyInterface { 
		void print(String printString);
	}
	
	
	private void printSomething(MyInterface my) { 
		my.print("test");
	}
	
	private static void printSomethingStatic(MyInterface my) { 
		my.print("static_test");
	}
	
}
