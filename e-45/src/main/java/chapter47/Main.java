package chapter47;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static List<Integer> bucket = new ArrayList<>();

	public static void main(String[] args) {

		Thread p1 = new Producer() ;
		
		Thread p2 = new Producer() ;

		Thread c1 = new Consumer() ;

		Thread c2 = new Consumer() ;
		
		
		
		p1.start();
		p2.start();
		c1.start();
		c2.start();

		
		
	}

}
