package example3;

public class DBRunnable2 implements Runnable {

	@Override
	public void run() {
		try {
		   Thread.sleep(3000);
		   System.out.println("DB2 querying ended ");
		}catch(InterruptedException ex) {
			
		}

	}

}
