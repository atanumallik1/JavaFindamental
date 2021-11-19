package Chapter48_Deadlock;

class Example3 {
	Object m1 = new Object();
	Object m2 = new Object();

	public void a() {
		synchronized (m1) {
			System.out.println(Thread.currentThread().getName() + "Method 1 : 1");
			synchronized (m2) {
				System.out.println(Thread.currentThread().getName() + "Method 1 : 2");

			}

		}

	}

	public void b() {

		synchronized (m2) {
			System.out.println(Thread.currentThread().getName() + "Method 2");
			synchronized (m1) {
				System.out.println(Thread.currentThread().getName() + "Method 2 : 2");

			}
		}

	}

}

public class DeadLockMain {

	public static void main(String[] args) {
		Example3 obj = new Example3();

		Thread t = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 25; i++) {
					obj.a();
				}
			}

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 25; i++) {
					obj.b();
				}
			}

		};
		
		
		
		t2.start();
		t.start();

	}

}
