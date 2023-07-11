import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		int type = sc.nextInt();
		
		int resultPrice = 0;
		
		for (int i = 0; i < type; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			
			resultPrice += price * count;
		}
		
		if (result == resultPrice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}