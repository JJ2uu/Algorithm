import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num += i;
		}
		System.out.println(num);
		
	}
}