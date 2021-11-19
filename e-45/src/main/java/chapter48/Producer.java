package chapter48;

import java.util.Random;

import chapter47.Main;

public class Producer extends Thread {
	// @Override
	public void run() {

		Random rr = new Random();
		int i = 0;

		while (true) {
			synchronized (Main.bucket) {

				if (Main.bucket.size() < 100) {
					i = rr.nextInt(999);
					System.out.println(Thread.currentThread().getName() + " Produced " + i);
					Main.bucket.add(i);
					Main.bucket.notify();
				}else {
					try {
						Main.bucket.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
