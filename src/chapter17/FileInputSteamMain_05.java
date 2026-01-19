package chapter17;

import java.io.FileInputStream;

public class FileInputSteamMain_05 {
	public static void main(String[] args) {
		// 파일 경로 설정
		String filePath = "outputstream.txt";
		
		//FileInputSteam:데이터 쓰기
		try(FileInputStream fis = new FileInputStream(filePath)) {
			int byteData;
			System.out.println("파일내용");
			
			while((byteData = fis.read()) != -1) {
				System.out.print((char)byteData);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 읽는 도중 오류 발생: " + e.getMessage());
		}
	}
}
