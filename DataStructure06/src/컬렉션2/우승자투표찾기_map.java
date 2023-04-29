package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		//String[] find = {"홍길동", "김길동", "정길동"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		//map.put("홍길동", 10); // 같은 key로 다시 put하면 덮어씀
		System.out.println(map);
		for (String x : all) {
			//System.out.println(map.get(x));
			map.put(x, map.getOrDefault(x, 0) + 1); // x의 값에 1을 더한 후 x에 다시 넣어주는
		}
		System.out.println(map);
		int max = 0;
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				System.out.println(key);
			}
		}
	}

}
