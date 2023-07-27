package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기 {

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		Solution41 sol = new Solution41();
		int result = sol.solution(k, tangerine);
		System.out.println(result);
	}
}

class Solution41 {
	public int solution(int k, int[] tangerine) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int answer = 0;
      
			/* 이미 존재하는 key의 value를 변경할 때에는 getOrDefault를 활용 */  
			for (int t : tangerine) {
				map.put(t, map.getOrDefault(t, 0)+1);
			}
      
			/* map을 value값을 기준으로 key값을 내림차순 정렬하는 방법 */
			/* 1. key를 List에 저장 */
			/* 람다식을 활용해 2개의 값을 가져와 value2가 value1보다 큰지, 작은지, */
			/* 같은지를 판단하여 양수, 음수, 0인지를 확인 후 내림차순으로 정렬됨 */  
			List<Integer> list = new ArrayList<>(map.keySet());
			Collections.sort(list, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
       
			/* k가 0이 되기 전까지 값이 큰 것(갯수가 많은 것)부터 빼면서 answer를 증감 */
			int index = 0;
			while(k > 0) {
				k -= map.get(list.get(index));
				answer++;
				index++;
			}
			return answer;
    }
}
