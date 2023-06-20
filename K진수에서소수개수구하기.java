package 프로그래머스;

public class K진수에서소수개수구하기 {

	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		Solution23 sol = new Solution23();
		int answer = sol.solution(n, k);
		System.out.println(answer);
	}

}

class Solution23 {
    public int solution(int n, int k) {
        int answer = 0;
        String res = kNum(n, k);
        String[] arr = res.split("0");
        for (int i = 0; i < arr.length; i++) {
			if (!arr[i].isEmpty()) {
				if (isPrime(Long.parseLong(arr[i]))) {
					answer++;
				}
			}
		}
        return answer;
    }
    
    // K진수 변환 메서드
    public String kNum(int n, int k) {
		String s = "";
		while (n > 0) {
			s = n%k +s;
			n /= k;
		}
		return s;
	}
    
    // 소수 확인 메서드
    public boolean isPrime(long n) {
    	boolean check = true;
    	if (n == 1) {
			check = false;
		}
    	if (n == 2) {
    		check = true;
    	}
    	for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				check = false;
			}
		}
    	return check;
	}
}
