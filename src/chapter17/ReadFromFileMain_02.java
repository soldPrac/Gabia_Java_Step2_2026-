package chapter17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFromFileMain_02 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
			String line;
			System.out.println("파일 내용");
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
	
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
