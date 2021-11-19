package chapter47;

public class Consumer extends Thread {
	@Override
	public void run() {
		int i = 0;

		while (true) {
			synchronized (Main.bucket) {

				if (Main.bucket.size() > 0) {
					i = Main.bucket.remove(0);
					System.out.println(Thread.currentThread().getName() + " consumed " + i);
					Main.bucket.notifyAll();

				}else {
					try {
						Main.bucket.wait();
						System.out.println(Thread.currentThread().getName() + " entering Wait Mode");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}

	}

}
