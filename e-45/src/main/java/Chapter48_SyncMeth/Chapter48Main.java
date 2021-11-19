package Chapter48_SyncMeth;

public class Chapter48Main {
	public static void main(String args[]) {
		A a = new A();
		

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i =0 ;i < 100;i++)
				a.test();

			}
		};
		
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i =0 ;i < 100;i++)
				a.test();

			}
		};
		
		
		t1.start();
		t2.start();

	}

}
