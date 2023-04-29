package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("pongpong");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("pongpong");
		System.out.println(sb3);
		
		System.out.println(sb1 == sb2);
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohoho");
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		
		StringBuilder sb4 = new StringBuilder(sb1);
		sb4.reverse();
		System.out.println(sb4);
		
		String s = "hahahahaha";
		String[] s4 = s.split("");
		List<String> list = Arrays.asList(s4);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);	
	}

}
