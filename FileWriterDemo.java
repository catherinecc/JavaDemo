package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("OutputFile.txt");
			BufferedWriter w = new BufferedWriter(fileWriter);		
			w.append("Hai");
			w.append("Cathy");
			w.close(); //closing flushes the buffer and writes everything to op file. If we dont close, nothing will be written
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
