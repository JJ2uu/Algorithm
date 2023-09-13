import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = 1;
		int y = s.length();
		int half = y/2;
		
		for (int i = 0; i < half; i++) {
			if (s.charAt(i) != s.charAt(y-1-i)) {
				result = 0;
				break;
			}
		}
		
		System.out.println(result);
	}
}