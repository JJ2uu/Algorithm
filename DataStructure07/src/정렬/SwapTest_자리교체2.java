package 정렬;

import java.util.Arrays;

public class SwapTest_자리교체2 {

	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		print(str);
		swap(str, 0, 1);
		print(str);
	}
	
	public static void swap(String[] arr, int x, int y) {
		String temp = arr[y];
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
