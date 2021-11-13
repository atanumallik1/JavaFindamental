package example3;

public class DBRunnable1 implements Runnable {

	@Override
	public void run() {
		try {
		   Thread.sleep(2000);
		   System.out.println("DB1 querying ended ");
		}catch(InterruptedException ex) {
			
		}

	}

}
