package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		Solution18 sol = new Solution18();
		int[] result = sol.solution(progresses, speeds);
		System.out.println(Arrays.toString(result));
	}

}

class Solution18 {
    public int[] solution(int[] progresses, int[] speeds) {
    	int[] answer = {};
    	
    	Queue<Integer> day = new LinkedList<Integer>();
        
    	// 남은 작업 기간을 queue에 저장
        for (int i = 0; i < progresses.length; i++) {
        	if ((100 - progresses[i])%speeds[i] == 0 ) {
        		day.add((100 - progresses[i])/speeds[i]);
			} else {
				day.add((100 - progresses[i])/speeds[i] + 1);
			}
		}
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int count = 1;
        int first = day.poll(); // 첫번째 값 꺼냄
        
        while (!day.isEmpty()) {
			int next = day.poll(); // 다음 값 꺼내서
			if (next > first) { // 다음 값이 더 크다면
				result.add(count); // 지금까지의 count를 추가
				count = 1; // 다시 초기화
				first = next; // 다음 값부터 시작
				continue;
			} else {
				count++; // 작거나 같다면 count++;
			}
		}
        
        result.add(count);
        
        answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
        
        return answer;
    }
}
