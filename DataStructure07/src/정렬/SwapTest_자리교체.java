package 정렬;

import java.util.Arrays;

public class SwapTest_자리교체 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		print(num);
		swap(num, 0, 5);
		print(num);
	}
	
	public static void swap(int[] arr, int x, int y) {
		int temp = arr[y];
		arr[y] = arr[x];
		arr[x] = temp;
	}
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void print(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
