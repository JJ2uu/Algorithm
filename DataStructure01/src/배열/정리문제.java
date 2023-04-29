package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int[] n = new int[5];
//		
//		for (int i = 0; i < n.length; i++) {
//			n[i] = sc.nextInt();
//		}
//		
//		Arrays.sort(n);
//		
//		System.out.println("최소값: " + n[0]);
//		System.out.println("--------------------------");
//		
//		Random r = new Random(100);
//		
//		int[] n2 = new int[20];
//		
//		for (int i = 0; i < n2.length; i++) {
//			n2[i] = r.nextInt(900);
//		}
//		
//		Arrays.sort(n2);
//		
//		System.out.println("최대값: " + n2[19]);
//		System.out.println("--------------------------");
//		
//		String s1 = "참좋다";
//		String s2 = "진짜좋다";
//		
//		System.out.println(s1.equals(s2));
//		
//		if (s1.length() > s2.length()) {
//			System.out.println("s1이 더 크다");
//		} else if (s1.length() < s2.length()) {
//			System.out.println("s2가 더 크다");
//		} else {
//			System.out.println("같다");
//		}
//		System.out.println("--------------------------");
//
//		String s3 = "나는 진짜 java programmer가 되었어";
//		String s33 = s3.substring(11, 21);
//		System.out.println(s33.toUpperCase());
//		
//		String s4 = "2056521";
//		char s44 = s4.charAt(0);
//		if (s44 == '2') {
//			System.out.println("여자");
//		} else if (s44 == '1') {
//			System.out.println("남자");
//		}
//		
//		System.out.println("--------------------------");
		
		String s5 = "[ 10, 20, 30, 40, 50]";
		
		System.out.println(s5.length());
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5.length());
		s5 = s5.trim();
		System.out.println(s5.length());
		
		System.out.println(s5);
		
		String[] s6 = s5.split(", ");
		
		int sum = 0;
		for (String x : s6) {
			int x2 = Integer.parseInt(x);
			sum += x2;
		}
		System.out.println("-----");
		System.out.println("합한값: " + sum);
		System.out.println("-----");
		
		int[] n = new int[5];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(s6[i]);
		}

		Arrays.sort(n);
		
		for (int x : n) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(n));
	}

}
