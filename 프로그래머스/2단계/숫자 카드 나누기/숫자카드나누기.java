package 프로그래머스;

public class 숫자카드나누기 {

	public static void main(String[] args) {
		int[] arrayA = {10, 20};
		int[] arrayB = {5, 17};
		Solution28 sol = new Solution28();
		int result = sol.solution(arrayA, arrayB);
		System.out.println(result);
	}

}

class Solution28 {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int a = arrayA[0];
        int b = arrayB[0];
        
        // 1. 각 배열의 최대공약수를 먼저 구한다.
        for (int i = 1; i < arrayA.length; i++) {
			a = gcd(a, arrayA[i]);
			b = gcd(b, arrayB[i]);
		}
        
        // 2. 각자 배열이 안나뉘는지 확인한다.
        boolean arrA = notDivide(arrayA, b);
        boolean arrB = notDivide(arrayB, a);
        
        // 3. 둘다 나뉘지 않는다면 두 최대공약수 중에 큰 수를 answer에 넣는다.
        if (arrA && arrB) {
			if (a < b) {
				answer = b;
			} else {
				answer = a;
			}
		// 4. A배열, B배열 중 하나라도 다른 배열의 최대공약수로 자신의 배열이 나뉜다면 나뉘지 않는 값을 answer에 넣는다.
		} else if (arrA && !arrB) {
			answer = b;
		} else if (!arrA && arrB) {
			answer = a;
		}
        return answer;
    }
    
    // 최대 공약수 유클리드 호제법  
    public int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
    
    // 배열이 안나뉘는지 확인하는 메서드
    public boolean notDivide(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % num == 0) {
				return false;
			}
		}
		return true;
	}
}
