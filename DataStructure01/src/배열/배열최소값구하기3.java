package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최소값구하기3 {

	public static void main(String[] args) {
		Random r = new Random(100);
		
		int[] n = new int[1000];
		int[] n2 = new int[1000];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000);
			n2[i] = r.nextInt(1000);
		}
		
		// 오름차순으로 정렬한 다음 맨 앞(최소값), 맨 끝(최대값)
		Arrays.sort(n); // 원본을 바꿔버림 (파괴형함수)
		
		System.out.println("최소값: " + n[0]);
		System.out.println("최대값: " + n[999]);
		
		if (Arrays.equals(n, n2)) {
			System.out.println("같당");
		} else {
			System.out.println("다르당");
		}
		
		String result = Arrays.toString(n);
		System.out.println(result);
		
		System.out.println("스트링의 글자수: " + result.length());
		System.out.println("배열의 개수 " + n.length);
		
	}

}
