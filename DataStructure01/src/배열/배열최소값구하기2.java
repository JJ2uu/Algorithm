package 배열;

import java.util.Random;

public class 배열최소값구하기2 {

	public static void main(String[] args) {
		Random r = new Random(100);
		
		int[] n = new int[1000];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000);
		}
		
		int max = n[0];
		
		for (int x : n) {
			if (x > max) max = x;
		}
		
		System.out.println("최대값 : " + max);
	}

}
