package example1;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i += 2) {

			System.out.println(i + Thread.currentThread().getName());

		}

	}
}
