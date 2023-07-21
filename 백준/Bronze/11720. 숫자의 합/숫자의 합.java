import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		String s = sc.next();
		
		int num = 0;
		
		for (int i = 0; i < len; i++) {
			num += s.charAt(i)-'0';
		}
		
		System.out.println(num);
	}
}