import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			list.add(sc.nextInt());
		}
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println(max);
		System.out.println(list.indexOf(max) + 1);
	}
}