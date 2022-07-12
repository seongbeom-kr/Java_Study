package week03;

import java.util.*;
import java.util.stream.Stream;

public class BJ_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int number = a * b * c;
		int[] digits = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
		int[] arr = new int[10];
		for (int i = 0; i < digits.length; i++) {
			int n = digits[i];
			arr[n] += 1;
		}
		for(int i =0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
	
	}
}
