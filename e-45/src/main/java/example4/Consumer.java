package example4;

public class Consumer implements Runnable {

	@Override
	public void run() {
		while (true) {
			synchronized (Main.bucket)

			{
				if (!Main.bucket.isEmpty()) {
					int i = Main.bucket.remove(0);
					System.out.println(i + " Consumer  by Consumer Thread: " + Thread.currentThread().getName());

				}
			}

		}

	}

}
