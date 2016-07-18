package ch1;

public class ex5 {

	public static void main(String[] args) { 
		
       // No lambda
	   Thread t1 = new Thread(new MyRunnable(true));
	   t1.start();
	
	   // With lambda
	   Runnable r = () -> { System.out.println( "I am Lambda" ); };
	   Thread t2 = new Thread(r);
	   t2.start();
	   
	   // With lambda existing runnable
	   boolean doWork = false;
	   Thread t3 = new Thread(  () -> { 
		   		System.out.println(( doWork ? "Lambda TRUE" : "Lambda FALSE" )); 
		   }
	   );
	   t3.start();
	   
	   // With lambda and method reference
	   MyRunnable rInstance = new MyRunnable(false);
	   Thread t4 = new Thread(rInstance::run);
	   t4.start();
		
	}
	
	static class MyRunnable implements Runnable { 
		
		private boolean doWork; 
		
		MyRunnable(Boolean doWork) { 
			this.doWork = doWork;
		}                                                      
		
		public void run() { 
			if(doWork) { 
			   System.out.println("I am not Labmda");	
			}
		}
	}
	
}
