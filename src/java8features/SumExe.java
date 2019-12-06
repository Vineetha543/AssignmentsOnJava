package java8features;

public class SumExe {

	public static void main(String[] args) {
        Sum s = (x,y)-> System.out.println("Sum is: " + (x+y));
        s.add(10, 20);
	}

}
