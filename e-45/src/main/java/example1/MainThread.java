
package example1;
public class MainThread {
	public static void main(String args[]) {
		
		
		MyThread th = new MyThread();
		th.start();
		// th.run();
		
		System.out.println("End !" +Thread.currentThread().getName());
		

	}

}
