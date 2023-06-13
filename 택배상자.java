package 프로그래머스;

import java.util.Stack;
public class 택배상자 {

	public static void main(String[] args) {
		int[] wantOrder = {4, 3, 1, 2, 5};
		택배 sol = new 택배();
		int result = sol.solution(wantOrder);
		System.out.println(result);
	}

}

class 택배 {
    public int solution(int[] wantOrder) {
        int answer = 0;

        // 저장 가능한 택배
        Stack<Integer> saveOrder = new Stack<Integer>();

        int defaultOrder = 1;
        int wantOrderIdx = 0;

        while (true) {
            if (!saveOrder.isEmpty() && wantOrder[wantOrderIdx] == saveOrder.peek()) {
                answer++;

                wantOrderIdx++;
                saveOrder.pop();

                continue;
            }

            if (defaultOrder > wantOrder.length)
                break;

            if (wantOrder[wantOrderIdx] == defaultOrder) {
                answer++;

                wantOrderIdx++;
                defaultOrder++;

                continue;
            }

            saveOrder.push(defaultOrder);
            defaultOrder++;
        }

        return answer;
    }
}
