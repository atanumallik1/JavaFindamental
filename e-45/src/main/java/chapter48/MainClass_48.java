package chapter48;

import java.util.ArrayList;
import java.util.List;

public class MainClass_48 {
	
	
	public static List<Integer> bucket = new ArrayList<>(); //<-- shared resource

	public static void main(String[] args) {
		Producer p1= new Producer();
		
		Producer p2= new Producer();

		Consumer c1= new Consumer();
		Consumer c2= new Consumer();
		
		
		
		p1.start();
		p2.start();
		c1.start();
		c2.start();
		
		
		

	}

}
