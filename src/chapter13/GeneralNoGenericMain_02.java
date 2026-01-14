package chapter13;

public class GeneralNoGenericMain_02 {
	public static void main(String[] args) {
		General general = new General();
		
		// 정수형 배열(오토박싱)
		Integer[] Arr = { 10, 20, 30, 40, 50 };
		general.printArr(Arr);

		Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.3 };
		general.printArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printArr(cArr);
	}
}
