import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			String[] arr = s.split("");
			String result = "";
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < r; j2++) {
					result += arr[j];
				}
			}
			System.out.println(result);
		}
	}
}