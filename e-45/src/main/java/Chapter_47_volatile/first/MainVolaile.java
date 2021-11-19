package Chapter_47_volatile.first;

public class MainVolaile {

	public static volatile int c;

	public static void main(String[] args) {

		Thread t1 = new IncrementingThread();
		Thread t2 = new PrintingThread();
		
		
		t1.start();
		t2.start();
	}

}
