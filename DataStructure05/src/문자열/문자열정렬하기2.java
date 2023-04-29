package 문자열;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String s = "Bcad";
		String s2 = s.toLowerCase();
		
		char[] str = s2.toCharArray();
		Arrays.sort(str);
		String s3 = new String(str);
		System.out.println(s3);
		
	}

}
