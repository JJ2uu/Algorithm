import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 전부 다를 경우
		if (a != b && b != c && a != c) {
			int max = 0;
			if (a > b) {
				if (c > a) {
					max = c;
				} else {
					max = a;
				}
			} else {
				if (c > b) {
					max = c;
				} else {
					max = b;
				}
			}
			System.out.println(max * 100);
		// 하나라도 같을 경우
		} else {
			// 전부 다 같을 경우
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// 하나만 다를 경우
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				} else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}