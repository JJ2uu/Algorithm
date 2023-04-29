package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		// 방법 1. 컬렉션 활용
		String[] str = s.split("");
		List<String> list = Arrays.asList(str);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		for (String x : list) {
			answer += x;
		}
		System.out.println(answer);
		
		// 방법 2. StringBuilder 활용
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String s2 = new String(c);
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		answer = sb.toString();
		
		System.out.println(answer);
				
	}

}
