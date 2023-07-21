import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (arr[c - 'a'] == -1) {
				arr[c - 'a'] = i;
			}
		}
		
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}