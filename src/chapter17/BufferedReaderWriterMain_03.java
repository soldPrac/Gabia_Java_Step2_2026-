package chapter17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterMain_03 {
	public static void main(String[] args) {
		String filePath = "buffered_output.txt";
		String[] data = { "Hello, world!", "This is a test.", "Java I/O is interesting!" };
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			for(String line : data) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("내용이 파일에 저장되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 쓰는 도중 오류 발생" + e.getMessage());
		}
		
		/*===================================================================*/
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
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
