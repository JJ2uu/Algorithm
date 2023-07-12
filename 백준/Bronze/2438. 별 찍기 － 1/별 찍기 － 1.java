import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		String s = "";
		for (int i = 1; i <= len; i++) {
			s += "*";
			System.out.println(s);
		}
	}
}