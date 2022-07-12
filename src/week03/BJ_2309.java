package week03;

import java.util.*;

public class BJ_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] high = new int[9];
		int sum = 0;
		int a = 0, b = 0; // 가짜 두개 찾기
		for (int i = 0; i < high.length; i++) {
			high[i] = sc.nextInt();
			sum += high[i];
		}
		Arrays.sort(high);

		for (int i = 0; i < high.length - 1; i++) {
			for (int j = i + 1; j < high.length; j++) {
				if (sum - high[a] - high[b] == 100) {
					a = i;
					b = j;
					break;
				}
			}
		}

		for (int j = 0; j < high.length; j++) {
			if (j == a || j == b)
				continue;
			System.out.println(high[j]);
		}

	}

}
