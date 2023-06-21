package 프로그래머스;

import java.util.PriorityQueue;

public class 더맵게 {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		Solution20 sol = new Solution20();
		int answer = sol.solution(scoville, K);
		System.out.println(answer);
	}
}

class Solution20 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // 우선순위 큐에 음식의 스코빌 지수 추가, 오름차순으로 정렬
        for(int s : scoville){
            pq.offer(s);
        }
        // 가장 낮은 스코빌 지수가 K 이상일때까지 반복
        while(pq.peek() < K){
            
            int first = pq.poll();
            int second = pq.poll();
            
            // 두 음식 섞기
            int mix = first + second * 2;
            pq.offer(mix); // 섞은 음식 스코빌 지수 추가
            answer++; // 카운팅
            
            // K 이상으로 만들 수 없는 경우
            if(pq.size() <= 1) {
            	return -1;
            }
        }
        return answer;
    }
}
