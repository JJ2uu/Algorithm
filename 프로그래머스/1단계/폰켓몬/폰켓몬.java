package 프로그래머스;

import java.util.HashSet;

public class 폰켓몬 {

	public static void main(String[] args) {
		int[] nums = {3, 3, 3, 2, 2, 4};
		Solution45 sol = new Solution45();
		int result = sol.solution(nums);
		System.out.println(result);
	}

}

class Solution45 {
	public int solution(int[] nums) {
		int answer = 0;
        
		HashSet<Integer> set = new HashSet<>();
		/* 중복 제거 */
    for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
        
    /* 종류의 수가 n/2보다 큰 경우 n/2를, 적은 경우 set.size를 리턴 */
    if (set.size() < nums.length/2) {
			answer = set.size();
		} else {
			answer = nums.length/2;
		}
    return answer;
  }
}
