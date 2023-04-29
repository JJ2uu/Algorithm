package 컬렉션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수4_확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int data = sc.nextInt();
			if (data == 0) {
				 break;
			} else {
				list.add(data);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("첫 번째 작은 수: " + list.get(0));
		System.out.println("두 번째 작은 수: " + list.get(1));
		System.out.println("K 번째 작은 수: " + list.get(k-1));
		
		System.out.println("---------------------------------------");
		
		int k2 = sc.nextInt();
		int size2 = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < size2; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(k2 + " 번째 작은 수: " + result[k2-1]);
		
	}

}
