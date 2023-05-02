package 프로그래머스;


public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String answer = "";
		String phone_number = "01033334444";
		
		// String을 변경하기 위한 StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder(phone_number);
		
		// for문만 돌린다면 9번째 테스트가 오류가 남
		// => 번호가 4자리일 경우엔 * 처리하지않고 출력해야 하므로 if문 추가
		if (phone_number.length() > 4) {
			// 전화번호 뒷자리 4글자는 남겨야 하기 때문에 범위를 0부터 sb.length()-4 까지로 지정
			for (int i = 0; i < sb.length() - 4; i++) {
				// for문을 돌면서 sb 값을 *으로 변경
				sb.setCharAt(i, '*');
				// answer에 sb출력값 저장
				answer = sb.toString();
			}
		} else {
			answer = phone_number;
		}

		System.out.println(answer);
		
		
		/* 다른 사람 풀이
		 * char[] ch = phone_number.toCharArray();
     		for(int i = 0; i < ch.length - 4; i ++){
         		ch[i] = '*';
     		}
     		return String.valueOf(ch);
		 */
	}

}
