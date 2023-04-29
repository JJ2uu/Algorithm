package 프로그래머스기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		int[] answer = sol.solution(arr, divisor);
		System.out.println(Arrays.toString(answer));
	}

}
class Solution11 {
    public int[] solution(int[] arr, int divisor) {
    	int[] answer = {};
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	
    	// answer의 index 값을 알 수 없으니 일단 arraylist에 새로 넣는다.
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i]%divisor == 0) {
				arrList.add(arr[i]);
			}
		}
    	// arrList 사이즈에 따라서 answer의 index를 결정한다.
    	if (arrList.size() != 0) {
			answer = new int[arrList.size()];
			for (int i = 0; i < arrList.size(); i++) {
				answer[i] = arrList.get(i);
			} 
		} else {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
    }
}
