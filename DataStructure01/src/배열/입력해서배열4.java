package 배열;

import java.util.Scanner;

public class 입력해서배열4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] n = new double[5];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextDouble();
		}
		
		sc.close();
		for (double x : n) {
			System.out.println(x);
		}
		
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 22.2) {
				count++;
			}
		}
		System.out.println("22.2의 개수: " + count);
	}

}
