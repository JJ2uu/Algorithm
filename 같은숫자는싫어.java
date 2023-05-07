package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = {};
		
		int num = arr[0];
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num);
		
		for (int i = 1; i < arr.length; i++) {
			if (num != arr[i]) {
				list.add(arr[i]);
				num = arr[i];
			}
		}
		
		answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        System.out.println(Arrays.toString(answer));
		
	}

}
