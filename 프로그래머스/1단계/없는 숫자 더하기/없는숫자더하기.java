package 프로그래머스;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
		Solution52 sol = new Solution52();
		System.out.println(sol.solution(numbers));
	}

}

class Solution52 {
	public int solution(int[] numbers) {
	  int answer = 0;
        
    for (int i = 0; i < 10; i++) {
			answer += i;
		}
        
    for (int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
		}
        
    return answer;
  }
}
