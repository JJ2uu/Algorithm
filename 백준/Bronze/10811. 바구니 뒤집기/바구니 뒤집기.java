import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			reverse(arr, x-1, y-1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        i++;
	        j--;
	    }
	}
}