package example2;

public class MainClass {

	public static void main(String[] args) {

		OddNumbersRunnable odd = new OddNumbersRunnable();

		Thread t = new Thread(odd, "T1"); // Thread is in NEw Thread
		t.start(); // NEW --> RUNNABLE, RUNNING
		
		
		
		

		Thread t2 = new Thread(odd, "T2"); // Thread is in NEw Thread
		t2.start(); // NEW --> RUNNABLE, RUNNING
		
		
		// Thread DEAD	
		System.out.println("End !"+Thread.currentThread().getName());

	}

}
