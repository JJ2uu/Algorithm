package 프로그래머스;

public class N개의최소공배수 {

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		Solution21 sol = new Solution21();
		int result = sol.solution(arr);
		System.out.println(result);
	}

}

class Solution21 {
    public int solution(int[] arr) {
        int answer = arr[0]; // 첫 번째 값을 고정하여

	// for문을 통해 최소공배수를 업데이트 해주며 다음 N번 째 값과의 최소공배수를 구함
        for (int i = 1; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    // 최대공약수
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    // 최소공배수
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
