package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 두수의차 {

	public static void main(String[] args) {
		int price = 246820;
		Solution sol = new Solution();
		sol.solution(price);
	}
	
}

class Solution {
    public int solution(int price) {
        int answer = 0;
        int dis1 = 100000;
        int dis2 = 300000;
        int dis3 = 500000;
        if (price >= dis3) {
            answer = price * 80 / 100;
        } else if (price >= dis2 && price < dis3) {
            answer = price * 90 / 100;
        } else if (price >= dis1 && price < dis2) {
            answer = price * 95 / 100;
        }
        return answer;
    }
}