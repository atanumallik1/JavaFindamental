package chapter48;

import java.util.Random;

import chapter47.Main;

public class Consumer extends Thread {

	// @Override
	public void run() {
		int i = 0;
		while (true) {
			synchronized (Main.bucket) {
				if (Main.bucket.size() > 0) {
					i = Main.bucket.remove(0);
					System.out.println(Thread.currentThread().getName() + " Consumed " + i);
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
