import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int count = 0;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}