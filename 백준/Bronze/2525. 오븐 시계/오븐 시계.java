import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		if (m+c >= 60) {
			h += (m+c)/60;
			m = (m+c)%60;
			if (h > 23) {
				h = h % 24;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m+c));
		}
	}
}