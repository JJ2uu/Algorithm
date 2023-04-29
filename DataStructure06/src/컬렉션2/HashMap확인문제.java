package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] fruit = {"apple", "banana", "apple", "banana", "melon", "apple"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String x : fruit) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		System.out.println(map);
		int max = 0;
		String one = "";
		for (String x : map.keySet()) {
			if (max < map.get(x)) {
				one = x;
				max = map.get(x);
			}
		}
		System.out.println(one + ": " + max);
		for (String x : map.keySet()) {
			System.out.println(x);
		}
	}

}
