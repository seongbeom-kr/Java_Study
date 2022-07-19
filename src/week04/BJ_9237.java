package week04;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class BJ_9237 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 2;
		int res = 0;
		Integer[] tree = new Integer[N];
		
		for (int i = 0; i < N; ++i) {
			tree[i] = sc.nextInt();
		}
		Arrays.sort(tree,Collections.reverseOrder());
		
		for(int i = 0;i<N;i++) {
			res = Math.max(res, cnt+tree[i]);
			cnt++;
		}
		System.out.println(res);
	}

}
