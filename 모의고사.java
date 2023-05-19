package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		Solution17 sol = new Solution17();
		int[] result = sol.solution(answers);
		System.out.println(Arrays.toString(result));
	}
}

class Solution17 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3]; //정답수 체크
        
        for (int i = 0; i < answers.length; i++) {
			if (answers[i] == arr1[i%5]) { //반복되기 때문에 나머지 연산자를 활용
				count[0]++;
			}
			if (answers[i] == arr2[i%8]) {
				count[1]++;
			}
			if (answers[i] == arr3[i%10]) {
				count[2]++;
			}
		}
        
        int max = count[0]; // 최대 정답 수
        
        for (int i = 0; i < 3; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
        
        int result = 0; //최대 정답 수와 같은 답을 맞춘 사람 체크
        
        for (int i = 0; i < 3; i++) {
			if (count[i] == max) {
				result++;
			}
		}
        
        answer = new int[result]; //배열 생성
        result = 0; //초기화 시키고
        for (int i = 0; i < 3; i++) {
			if (count[i] == max) {
				answer[result] = i+1; //최대 정답 수와 동일하게 맞췄다면 answer에 수포자 번호를 넣어줌
				result++;
			}
		}
        
        return answer;
    }
}
