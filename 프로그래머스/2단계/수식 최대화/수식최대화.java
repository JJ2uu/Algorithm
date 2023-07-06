package 프로그래머스;

import java.util.ArrayList;

public class 수식최대화 {

	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		Solution31 sol = new Solution31();
		long result = sol.solution(expression);
		System.out.println(result);
	}
}

class Solution31 {
	public long solution(String expression) {
		long answer = 0;
		// 1. 연산자로 가능한 경우의 수 배열을 만든다.
		String[][] option = {{"+", "-", "*"}, {"+", "*", "-"},
												 {"-", "+", "*"}, {"-", "*", "+"},
												 {"*", "-", "+"}, {"*", "+", "-"}};
        
		// 2. 연산자와 숫자를 분리하여 리스트에 넣는다.
		ArrayList<String> exList = new ArrayList<String>();
		int index = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
				exList.add(expression.substring(index, i));
				exList.add(expression.charAt(i)+"");
				index = i+1;
			}
		}
		exList.add(expression.substring(index));
        
		// 3. 경우의 수 별로 계산해서 절대값을 갱신한다.
		for (int i = 0; i < option.length; i++) {
			// 3-1. 하나의 경우의 수 꺼냄
			String[] cases = option[i];
			ArrayList<String> temp = new ArrayList<>(exList); // 임시 리스트
			
			for (int j = 0; j < cases.length; j++) {
				// 3-2. 꺼낸 경우의 수에서 각각의 연산자를 꺼냄
				String operator = cases[j];
				
				// 3-3. 해당 연산자가 포함되어있다면
				while (temp.contains(operator)) {
					int opIndex = temp.indexOf(operator); // 3-4. 그 연산자의 인덱스값
					// 3-5. 그 연산자 왼쪽 인덱스 숫자
					long leftNum = Long.parseLong(temp.get(opIndex-1));
					// 3-6. 그 연산자의 오른쪽 인덱스 숫자
					long rightNum = Long.parseLong(temp.get(opIndex+1));
					long resultNum = 0;
					
					// 3-7. 연산자에 따라서 결과값 resultNum에 저장
					if (operator.equals("+")) {
						resultNum = leftNum + rightNum;
					} else if (operator.equals("-")) {
						resultNum = leftNum - rightNum;
					} else if (operator.equals("*")) {
						resultNum = leftNum * rightNum;
					}
					
					// 3-8. 해당 인덱스값을 차례로 지운 후
					temp.remove(opIndex - 1);
					temp.remove(opIndex - 1);
					temp.remove(opIndex - 1);
					temp.add(opIndex-1, String.valueOf(resultNum)); // 3-9. 해당 결과갑 add
				}
			}
			// 4. 최종 결과값을 절대값으로 바꾼다.
			//    결과값 배열(temp)의 값이 한 개이기 때문에 get(0) 사용
			long tempResult = Math.abs(Long.parseLong(temp.get(0)));
			// 5. 최대값을 answer 에 넣는다.
			answer = Math.max(answer, tempResult);
		}  
		return answer;
	}
}
