package chapter13;

public class GeneralNoGenericMain_01 {
	public static void main(String[] args) {
		GeneralNoGeneric general = new GeneralNoGeneric();
		
		//정수형 배열(오토박싱)
		Integer[] Arr = {10,20,30,40,50};
		general.printIntArr(Arr);
		
		Double[] dArr = {10.1, 20.1, 30.1, 40.1, 50.3};
		general.printDoubleArr(dArr);
		
		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printCharArr(cArr);
	}
}
