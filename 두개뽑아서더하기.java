package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] answer = {};
		int[] numbers = {5, 0, 2, 7};

		// 중복값 제거
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			// 같은 index의 값을 더하지 않도록 j = i+1로 설정
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);

		Collections.sort(list);
		
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
