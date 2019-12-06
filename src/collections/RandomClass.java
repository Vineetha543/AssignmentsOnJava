package collections;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random r  = new Random();
		 int x= r.nextInt();
		 System.out.println("X : " + x);
		 int y = r.nextInt(100);
		 System.out.println("Y : " + y);
		 int z = r.nextInt(1000);
		 System.out.println("Z : " + z);

	}

}
