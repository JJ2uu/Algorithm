package 문자열;

import java.util.Arrays;

public class String에서Char배열에옮기기2 {

	public static void main(String[] args) {
		String s = "s205621";
		
		char c1 = s.charAt(3);
		char c2 = s.charAt(4);
		
		System.out.println(c1 + ", " + c2);
		
		String s2 = String.valueOf(c1) + String.valueOf(c2);
		System.out.println(s2);
		
		System.out.println(s.substring(3, 5));
		
		char[] result = new char[2];
		s.getChars(3, 5, result, 0); // 시작 인덱스, 마지막 인덱스 + 1, 넣을 배열 변수명, 넣을 배열 변수 시작 인덱스
		System.out.println(Arrays.toString(result));
		
		String[] all = s.split("");
		System.out.println(all[0]+all[all.length-1]);
		
	}

}
