package 프로그래머스;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {
				{2,5,3},
				{4,4,1},
				{1,7,3}
		};
		
		int[] result = sol.solution(array, commands);
		System.out.println(Arrays.toString(result));
	}

}

class Solution3 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        
        for (int i = 0; i < commands.length; i++) {
			n1 = commands[i][0];
			n2 = commands[i][1];
			n3 = commands[i][2];
		}
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        return answer;
    }
}
