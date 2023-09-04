package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 시소짝꿍 {

	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] weights = {100, 180, 360, 100, 270};
		System.out.println(sol.solution(weights));
	}

}

class Solution56 {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        
        /* 정확한 소수점 값을 얻기 위해 Double 활용 */
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        
        /* map에 해당하는 배율값이 있다면 answer에 더해준다. */
        /* (1, 1), (4, 2)[2, 1], (3, 2), (4, 3) */
        for (int weight : weights) {
			if (map.containsKey(1.0 * weight)) {
				answer += map.get(1.0 * weight);
			}
			if (map.containsKey((1.0 / 2) * weight)) {
				answer += map.get((1.0 /2) * weight); 
			}
			if (map.containsKey((2.0 / 3) * weight)) {
				answer += map.get((2.0/3) * weight);
			}
			if (map.containsKey((3.0 / 4) * weight)) {
				answer+= map.get((3.0 / 4) * weight);
			}
			/* 배율값이 없다면 value = 1 로 map 에 저장해준다. */
			map.put(1.0 * weight, map.getOrDefault(1.0 * weight, 0) + 1);
		}
        
        return answer;
    }
}
