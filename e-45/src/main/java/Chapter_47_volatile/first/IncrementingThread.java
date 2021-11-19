package Chapter_47_volatile.first;

public class IncrementingThread extends Thread {
	@Override
	public void run() {
		try {
		while(true) {
			MainVolaile.c++;
			Thread.sleep(500);
		}
		}catch(InterruptedException e) {
			
		}
		
	}

}
