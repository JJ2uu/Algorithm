package 프로그래머스;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		Solution36 sol = new Solution36();
		long result = sol.solution(price, money, count);
		System.out.println(result);
	}
}

class Solution36 {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long all = 0;
		for (int i = 1; i <= count; i++) {
			all += price * i;
		}
        
		if (all > money) {
			answer = all - money;
		} else {
			answer = 0;
		}

		return answer;
    }
}
