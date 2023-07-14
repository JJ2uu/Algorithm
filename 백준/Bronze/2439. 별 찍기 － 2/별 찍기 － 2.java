import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= len; i++) {
			for (int j = len-i; j >= 1; j--) {
				sb.append(" ");
			}
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}