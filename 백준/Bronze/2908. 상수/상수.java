import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String strA = String.valueOf(A);
		String strB = String.valueOf(B);
		String s = "";
		String s2 = "";
		for (int i = strA.length()-1; i >= 0; i--) {
			s += strA.charAt(i);
		}
		for (int i = strB.length()-1; i >= 0; i--) {
			s2 += strB.charAt(i);
		}
		if (Integer.parseInt(s) > Integer.parseInt(s2)) {
			System.out.println(s);
		} else {
			System.out.println(s2);
		}
	}
}