package 문자열;


public class 문자열계산하기 {

	public static void main(String[] args) {
		String my_string = "3 + 4 - 3";
		String[] str = my_string.split(" ");
		int answer = Integer.parseInt(str[0]); // 첫번째값 저장
		
		for (int i = 1; i < str.length; i+=2) { // 1, 3, 5, ... 번 인덱스에 사칙연산
			if (str[i].equals("+")) {
				answer += Integer.parseInt(str[i+1]);
			} else {
				answer -= Integer.parseInt(str[i+1]);
			}
		}

		System.out.println(answer);
	}

}
