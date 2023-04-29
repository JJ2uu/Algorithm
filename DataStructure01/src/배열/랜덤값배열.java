package 배열;

import java.util.Random;

public class 랜덤값배열 {

	public static void main(String[] args) {
		Random r = new Random(100);
		
		int[] numbers = new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(101);
			System.out.println(i + " : " + numbers[i]);
		}
	}

}
