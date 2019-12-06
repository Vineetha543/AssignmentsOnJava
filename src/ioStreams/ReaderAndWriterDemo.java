package ioStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {
	public static void main(String[] args) throws IOException 
	{ 
         FileReader fr = null;
         FileWriter fw = null;
         
         fr = new FileReader("C:/Users/VINEETHA PIDUGU/Downloads/Demo/file.txt ");
         fw = new FileWriter("C:/Users/VINEETHA PIDUGU/Downloads/Demo/newFile.txt");
         
         int ch;
         while((ch=fr.read()) != -1)
         {
        	 fw.write(ch);
         }
         
         fr.close();
         fw.close();
        	 
	}
}
