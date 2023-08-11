package 프로그래머스;

public class 푸드파이트대회 {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		Solution49 sol = new Solution49();
		String result = sol.solution(food);
		System.out.println(result);
	}

}

class Solution49 {
	public String solution(int[] food) {
		String answer = "";
        
		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < food.length; i++) {
			if (food[i] != 0) {
				for (int j = 0; j < food[i]/2; j++) {
					sb.append(Integer.toString(i));
				}
			}
		}
		String basic = sb.toString();
		String reverse = sb.reverse().toString();
        
		answer = basic + "0" + reverse;
        
		return answer;
	}
}
