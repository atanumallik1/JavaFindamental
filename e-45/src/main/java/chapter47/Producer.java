package chapter47;

import java.util.Random;

public class Producer extends Thread {
	@Override
	public void run() {
		Random r = new Random(999);
		int i = 0;

		while (true) {
			synchronized (Main.bucket) {
				if (Main.bucket.size() <= 100) {
					i = r.nextInt();
					Main.bucket.add(i);
					System.out.println(Thread.currentThread().getName() + " produced " + i);
					Main.bucket.notifyAll();
				}
				else {
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
