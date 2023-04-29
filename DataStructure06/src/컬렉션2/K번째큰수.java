package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = {3, 4, 5, 7, 1, 6, 8, 2};
		int k = 2; // 2번째 큰 수
		Arrays.sort(num);
		System.out.println(num[num.length-k]);
	}

}
