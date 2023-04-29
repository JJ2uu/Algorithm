package 프로그래머스기본;

import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] s = {5, 2, 1, 9, 11, 15, 17, 21};
		
		Arrays.sort(s); // 파괴형 함수
		System.out.println(Arrays.toString(s));
		
		int center = s.length / 2;
		int answer = s[center] + s[center - 1];
		
		System.out.println(answer);
	}

}
