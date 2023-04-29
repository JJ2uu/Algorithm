package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		
		/* 1. 일단 문자열을 하나씩 구분
		 * 2. 어떤 문자들이 있는지 목록 만들기
		 * 중복을 없애면 목록이 구해짐
		 * HashSet 활용
		*/
		
		HashSet<String> set = new HashSet<String>();
		String[] str = s.split("");

		System.out.println(Arrays.toString(str));
		
		for (String x : str) {
			set.add(x); // 중복된 것은 안들어감
		}
		System.out.println(set.size());
		System.out.println(set);
		
		/* 배열 안에 set에 들어있는 요소가 1인 것만 */
		Object[] set2 = set.toArray();
		List<String> list = Arrays.asList(str);
		
		String answer = "";
		
		for (Object x : set2) {
			if (Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
		
		System.out.println(answer);
	}

}
