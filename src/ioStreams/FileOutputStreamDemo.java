package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:/Users/VINEETHA PIDUGU/Downloads/Demo/Dream.jpg");
			fos = new FileOutputStream("C:/Users/VINEETHA PIDUGU/Downloads/Demo/newImage.jpg");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
