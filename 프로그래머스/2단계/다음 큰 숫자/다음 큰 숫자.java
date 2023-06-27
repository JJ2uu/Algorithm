package 프로그래머스;

public class 다음큰숫자 {

	public static void main(String[] args) {
		int n = 78;
		Solution26 sol = new Solution26();
		int result = sol.solution(n);
		System.out.println(result);
	}

}

class Solution26 {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toString(n, 2);
        int count = toBinaryCount(binary);
        
        while (true) {
        	int num = ++n;
        	String numBinary = Integer.toString(num, 2);
        	if (count == toBinaryCount(numBinary)) {
				answer = num;
				break;
			}
        }
        return answer;
    }
    
    // 2진수 속 1의 개수 찾는 메서드
    public int toBinaryCount(String binary) {
    	int count = 0;
    	for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				count++;
			}
		}
    	return count;
    }
}
