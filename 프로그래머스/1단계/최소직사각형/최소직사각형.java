package 프로그래머스;

public class 최소직사각형 {

	public static void main(String[] args) {
		Solution57 sol = new Solution57();
		int[][] sizes = {
				{60, 50},
				{30, 70},
				{60, 30},
				{80, 40}
		};
		System.out.println(sol.solution(sizes));

	}

}

class Solution57 {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int row = 0;
        int column = 0;
        
        for (int i = 0; i < sizes.length; i++) {
			int x = Math.max(sizes[i][0], sizes[i][1]);
			int y = Math.min(sizes[i][0], sizes[i][1]);
			
			row = Math.max(row, x);
			column = Math.max(column, y);
		}
        
        answer = row * column;
        
        return answer;
    }
}
