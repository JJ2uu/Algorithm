package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열확인문제 {
	
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String sno = "2056521";
		
		char last = sno.charAt(sno.length()-1);
		
		if (last == '1') {
			System.out.println("서대문구 출생");
		} else {
			System.out.println("다른 구에서 출생");
		}
		
		char[] array = new char[2];
		sno.getChars(4, 6, array, 0);
		
		System.out.println(Arrays.toString(array));
		
		int n = Character.getNumericValue(array[0]);
		int n2 = Character.getNumericValue(array[1]);
		
		System.out.println(n + n2);

		int count = 0;
		String[] array2 = new String[sno.length()];
		array2 = sno.split("");
		
		/*
		 * for (int i = 0; i < array2.length; i++) {
		 * if (array2[i].equals("5")) {
		 *		 count++; } }
		 */
		
		for (String s : array2) {
			if (s.equals("5")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		int count2 =0;
		for (int i = 0; i < array2.length; i++) {
			char c = sno.charAt(i);
			if (c == '5') {
				count2++;
			}
		}
		
		System.out.println(count2);
		
		// 인덱스를 빨리 찾는 방법(함수활용)
		System.out.println(Arrays.binarySearch(array2, "5"));
		
		// 배열에 특정한 값을 한 번에 변경할 수 있는 함수
		Arrays.fill(array2, 0, 3, "hoho");
		print(array2);
		
		// 배열의 순서를 뒤집어라.
		Arrays.sort(array2);
		print(array2);
		
		List<String> list = Arrays.asList(array2);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		// 배열안에 데이터의 빈도수(횟수)구할 때 사용
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
		
	}

}
