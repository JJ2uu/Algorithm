package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 2, 2};
		int[] answer = {};
		
		
		// arr.length가 1보다 클 때
		if (arr.length > 1) {
			// list 생성
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < arr.length-1; i++) {
				// arr[i]보다 다음 배열값이 작다면 arr[i]를 list에 추가
				if (arr[i] > arr[i+1]) {
					list.add(arr[i]);
				// arr[i]보다 다음 배열값이 크다면 arr[i+1]를 list에 추가
				} else if (arr[i] < arr[i+1]) {
					list.add(arr[i+1]);
				}
				// 같을 경우엔 추가하지 않음
			}
			// list.size에 맞게 배열 생성
			answer = new int[list.size()];
			
			// for문으로 answer배열에 넣어줌
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}

		// arr.length가 1일 때
		} else if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		}

		System.out.println(Arrays.toString(answer));
	}

}
