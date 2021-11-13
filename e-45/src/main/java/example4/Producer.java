package example4;

import java.util.Random;

public class Producer implements Runnable {

	@Override
	public void run() {

		Random r = new Random(9999);

		while (true) {
			synchronized (Main.bucket) {
				if (Main.bucket.size() < 100) {
					int i = r.nextInt(1000);
					Main.bucket.add(i);
					System.out.println(i + " addred by Producer Thread: " + Thread.currentThread().getName());

				}
			}

		}

	}

}
