package Chapter_47_volatile.second;

public class MainVolaile {

	public static   boolean c = true;

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Forever();
		t1.start();
		Thread.sleep(10);

		MainVolaile.c= false;
		System.out.println("Stropping thread from Main");
	}

}
