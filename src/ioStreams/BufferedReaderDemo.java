package ioStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		int count = 0;

		try {
			fr = new FileReader("C:/Users/VINEETHA PIDUGU/Downloads/Demo/file.txt");
			br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreElements()) {
					System.out.println(st.nextToken());
					count ++;
				}
			}
			
			System.out.println("number of words in the file : " + count);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
