package Chapter_47_volatile.first;

public class PrintingThread extends Thread {
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("Print : "+MainVolaile.c);
			Thread.sleep(500);
		}
		}catch(InterruptedException e) {
			
		}
		
	}

}
