package 배열;

import java.util.Arrays;

public class 배열뒤집기 {
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] answer = sol.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}
}

		//1. 10 => 1~10까지 중에서 홀수만 구해야함.
		//  반복문을 돌면서
		//  숫자하나씩을 꺼내어
		//  if문으로 홀수인지판단
		//  2로 나누어서 나머지가 0이 아니면!로 판단
		//2. answer배열 0번 인덱스부터 차례대로 넣어준다.
		//  answer배열 0번 인덱스를 카운트할 변수가 필요
		//  j = 0시작, 반복문돌때마다 j--;해주어야함.
		//==> 순서도 그려보자.!!!!

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = num_list.length-1;
        for (int i=0; i < num_list.length; i++) {
            answer[i] = num_list[j];
            j--;
        }
        return answer;
    }
}
