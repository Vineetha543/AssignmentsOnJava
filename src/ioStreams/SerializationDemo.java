package ioStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("C:/Users/VINEETHA PIDUGU/Downloads/Demo/Emp.ser");
			oos = new ObjectOutputStream(fos);

			Employee emp = new Employee(1, "tom", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee object Serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
