package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		FileInputStream fis;
		ObjectInputStream ois;

		try {
			fis = new FileInputStream("C:/Users/VINEETHA PIDUGU/Downloads/Demo/Emp.ser");
			ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();
			Employee emp = (Employee) obj;

			System.out.println("Employee id : " + emp.id);
			System.out.println("Employee name : " + emp.name);
			System.out.println("Employee salary : " + emp.salary);
			System.out.println("Employee ssn : " + emp.ssn);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
