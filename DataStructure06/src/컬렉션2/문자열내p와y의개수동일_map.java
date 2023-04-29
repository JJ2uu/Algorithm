package 컬렉션2;

import java.util.HashMap;

public class 문자열내p와y의개수동일_map {

	public static void main(String[] args) {
		String s = "pPoooyY";
		
		String s2 = s.toLowerCase();
		
		String[] str = s2.split("");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String x : str) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		System.out.println(map);
		System.out.println(map.get("p") == map.get("y"));
	}

}
