package Chapter_47_volatile.second;

public class Forever extends Thread {
	
	
	@Override
	public void run() {
		
		while( MainVolaile.c) {
			System.out.println(Thread.currentThread() .getName() + "Running ...");
		}
		
		System.out.println("Stopping in thread");
		
	}

}
