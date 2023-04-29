package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 컬렉션정렬 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(600);
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(200);
		list.add(500);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		int[] list2 = new int[list.size()];
		
		for (int i = 0; i < list2.length; i++) {
			list2[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(list2));
		
		list2[0] = 1000;
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		for (int i = 0; i < list2.length; i++) {
			list3.add(list2[i]);
		}
		
		System.out.println(list3);
	}

}
