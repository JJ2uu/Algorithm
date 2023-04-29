package 배열;

import java.util.Scanner;

public class 입력해서배열 {

	public static void main(String[] args) {
		// 자바 프로그램과 콘솔(키보드)을 연결하는 스트림(강물)오픈
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt(); // 입력받아서 int로 바꾼 후 배열에 넣는다.
		}
		
		for (int x : numbers) {
			System.out.println(x);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 3) {
				System.out.println(i + " : " + numbers[i]);
			}
		}
		
		sc.close();
	}

}
