import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 8};
		Scanner sc = new Scanner(System.in);
		int[] get = new int[arr.length];
		for (int i = 0; i < get.length; i++) {
			int x = sc.nextInt();
			get[i] = arr[i] - x;
		}
		for (int i = 0; i < get.length; i++) {
			System.out.print(get[i] + " ");
		}
	}
}