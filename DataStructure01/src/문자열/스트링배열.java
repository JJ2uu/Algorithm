package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링배열 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		
		String[] all2 = all.split(",");
		
		//공백을 없애려면 아래 방법처럼 trim을 따로 해주거나 공백까지 포함된 split(", ")을 사요

		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		
		System.out.println(Arrays.toString(all2));
		System.out.println("과목수는 " + all2.length + "과목");
		
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치 인덱스>> " + i);
			}
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명이 3글자 미만인 과목수>> " + count);
		
		List<String> list = Arrays.asList(all2);
		System.out.println(list.indexOf("컴퓨터"));
	}

}
