package Chapter48_SyncMeth;

public class A {
	
	public synchronized void test()   {
		System.out.println(Thread.currentThread().getName() + " in A");
		
		/*
		 * try { this.wait(100); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
 
		
		System.out.println(Thread.currentThread().getName() + " Exiting A");

		
		
	}
	

	

}
