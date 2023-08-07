package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] year = {5, 10, 1, 3};
		String[][] photo = {
				{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"},
				{"kon", "kain", "may", "coni"}
		};
		
		Solution9 sol = new Solution9();
		int[] result = sol.solution(name, year, photo);
		System.out.println(Arrays.toString(result));
	}

}


class Solution9 {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		HashMap<String, Integer> map = new HashMap<>();
        
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
        
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				if (map.containsKey(photo[i][j])) {
					answer[i] = answer[i] + map.get(photo[i][j]);
				}
			}
		}
        
		return answer;
  }
}
