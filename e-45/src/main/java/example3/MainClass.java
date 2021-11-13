package example3;

public class MainClass {
	public static void main(String args[]) {
		Runnable dbrunnable1 = new DBRunnable1() ;
		Runnable dbrunnable2 = new DBRunnable2() ;
		
		
		Thread t1 = new Thread(dbrunnable1, "DB1") ;
		Thread t2 = new Thread(dbrunnable2, "DB2");
		
		t1.start();
		t2.start();
		
		try {
		t1.join(1000);
		t2.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Main ended");
		

	}

}
