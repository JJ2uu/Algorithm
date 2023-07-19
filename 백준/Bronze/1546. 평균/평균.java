import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]/arr[arr.length-1] * 100;
			sum += arr[i];
		}
		System.out.println(sum / n);
	}
}