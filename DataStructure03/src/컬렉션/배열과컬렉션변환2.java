package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		List<String> s = Arrays.asList(냉장고음식);
		
		//1. 감자가 들어있는 마지막 위치를 구해보세요. 전체 출력
		System.out.println(s.lastIndexOf("감자"));
		
		//2. 양파를 포함하고 있으면 "양파는 안사도 된다",
		// 포함하고 있지 않으면 없으면 "양파사서 냉장고에 넣어야 한다."
		if (s.contains("양파")) {
			System.out.println("양파는 안사도 돼");
		} else {
			System.out.println("양파 사와");
		}
		//	전체 출력
		System.out.println(s);
		
		//3. 우유를 "춘식이 우유"로 수정해보자. 전체출력
		s.set(s.indexOf("우유"), "춘식이 우유");
		System.out.println(s);
		
		//4. 양파를 찾아서 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정하자.
		int index = s.indexOf("양파");
		s.set(index, "양파즙");
		System.out.println(s);
		
		//   전체출력
		
		//5. 다시 배열로 변환하여 전체 내용을 출력
		String[] 냉장고음식2 = (String[])s.toArray();
		System.out.println(Arrays.toString(냉장고음식2));
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void strPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
