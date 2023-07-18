import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int remain = arr[0] % 42;
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(remain);
		for (int i = 1; i < arr.length; i++) {
			if (remain != arr[i] % 42) {
				set.add(arr[i]%42);
			}
		}
		System.out.println(set.size());
	}
}