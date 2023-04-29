package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		intPrint(s);
		Arrays.sort(s);
		intPrint(s);
		
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		strPrint(s2);
		
		// -> List로 변형하면, 조금 더 다양한 처리들을 for문을 사용하지 않고 가능
		// asList로 할 경우 index를 변형시키는 add/remove를 제외한 나머지 작업만 가능
		List<String> list = Arrays.asList(s2);
		System.out.println(list); // toString이 오버라이드 되어있어 출력하기 편함
		System.out.println(list.contains("aaa"));

		//1. ccc가 들어있는 위치를 찾아보세요.
		System.out.println(list.indexOf("ccc"));
		
		//2. aaa가 들어있는 마지막 위치를 찾아보세요.
		System.out.println(list.lastIndexOf("aaa"));
		
		//3. 전체 내용 프린트 
		System.out.println(list);

		//4. 인덱스2번의 내용을 ggg로 변경
		list.set(2, "ggg");
		
		//5. 전체 내용 프린트 
		System.out.println(list);
		
		// 제약 없는 ArrayList 다시 만들기
		List<String> list2 = new ArrayList<String>(Arrays.asList(s2));
		list2.add("hhh");
		list2.remove("bbb");
		System.out.println(list2);
		
		// 배열에 한계가 있어서 List로 변환하여 처리
		// 하지만 코딩테스트에서는 반환을 거의 배열로 하게 되어있음
		// asList로 만든 list만 가능
		String[] s3 = (String[])list.toArray();
		strPrint(s3);
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void strPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
