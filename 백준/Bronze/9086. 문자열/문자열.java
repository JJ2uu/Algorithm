import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			String s = sc.next();
			String s2 = "";
			s2 += s.charAt(0);
			s2 += s.charAt(s.length()-1);
			System.out.println(s2);
		}
	}
}