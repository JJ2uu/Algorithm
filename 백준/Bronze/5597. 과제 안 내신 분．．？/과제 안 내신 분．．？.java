import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			list.add(i+1);
		}
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			if (list.contains(num)) {
				list.remove(Integer.valueOf(num));
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}