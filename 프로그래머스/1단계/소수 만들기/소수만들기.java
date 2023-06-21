package 프로그래머스;

public class 소수만들기 {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] nums = {1, 2, 7, 6, 4};
		int result = sol.solution(nums);
		System.out.println(result);
	}

}

class Solution14 {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (number(sum)) {
						answer++;
					}
				}
			}
		}

        return answer;
    }
    
    public boolean number(int sum) {
    	boolean check = true;
    	for (int l = 2; l < sum; l++) {
			if (sum % l == 0) {
				check = false;
			}
		}
    	return check;
	}
}
