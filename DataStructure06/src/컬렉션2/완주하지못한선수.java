package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}
		
		System.out.println(map);
		
		for (String x : completion) {
			map.put(x, map.getOrDefault(x, 0) - 1);
		}
		
		System.out.println(map);

		for (String y : map.keySet()) {
			if (map.get(y) != 0) {
				System.out.println(y);
			}
		}

	}

}
