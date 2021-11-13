package example4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Integer> bucket = new ArrayList<>();

	public static void main(String[] args) {

		Producer P1 = new Producer();
		Producer P2 = new Producer();

		Consumer C1 = new Consumer();
		Consumer C2 = new Consumer();

		Thread tP1 = new Thread(P1);
		Thread tP2 = new Thread(P2);
		Thread tC1 = new Thread(C1);
		Thread tC2 = new Thread(C1);
		
		tP1.start();
		tP2.start();

		tC1.start();
		tC2.start();

	

	}

}
