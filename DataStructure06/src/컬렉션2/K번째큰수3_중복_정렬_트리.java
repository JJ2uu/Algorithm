package 컬렉션2;

import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복_정렬_트리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		
		// 중복제거와 정렬을 동시에
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length-k]);
	}

}
