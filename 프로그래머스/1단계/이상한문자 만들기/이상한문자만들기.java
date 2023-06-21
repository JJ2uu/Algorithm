package 프로그래머스;

import java.util.Arrays;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String answer = "";
		String s = "  try  hello world  ";
		
		// s를 한 글자씩 분리
		String[] arr = s.split("");
		
		// 문자 index를 따로 구분
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// 공백일 때
			if (arr[i].equals(" ")) {
				// 문자 index값 초기화
				index = 0;
				arr[i] = " ";
			}
			// 문자일 때
			else {
				if (index%2 == 0) {
					arr[i] = arr[i].toUpperCase();
				} else if (index%2 != 0) {
					arr[i] = arr[i].toLowerCase();
				}
				index++;
			}
			answer += arr[i];
		}
		
		// 문자 index를 따로 빼는 이유
		// - 따로 빼지 않고 for문의 i로만 한다면 공백을 기준으로한 단어별 index를 판단할 수 없음.
		// - 공백을 만나면 문자 index를 초기화하는 방식으로 단어별 index를 판단.
		// - 계속 문자라면 index값을 더해주며 홀수,짝수를 판단.
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(answer);

	}

}
