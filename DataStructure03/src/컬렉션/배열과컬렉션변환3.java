package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열과컬렉션변환3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		strPrint(s2);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
		
		System.out.println(list.contains("aaa"));
		list.add("fff");
		System.out.println(list);
		list.add(1, "ggg");
		System.out.println(list);
		list.remove("ccc");
		System.out.println(list);
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void strPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
