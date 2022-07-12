package week03;

import java.util.*;

public class BJ_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int total = 0;
		int[] cnt = new int[N];
		int[] price = new int[N];
		for (int i = 0; i < N; ++i) {
			price[i] = sc.nextInt();
			cnt[i] = sc.nextInt();

			total += price[i] * cnt[i];
		}
		if (X == total)
			System.out.print("Yes");
		else
			System.out.print("NO");

	}

}
