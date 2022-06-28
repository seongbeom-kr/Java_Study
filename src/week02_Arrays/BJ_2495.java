package week02_Arrays;

import java.util.*;

public class BJ_2495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; ++i) {
			String str = sc.next();
			int cnt = 1, max = 1;
			char prev = str.charAt(0);

			for (int j = 1; j < 8; ++j) {
				char now = str.charAt(j);
				if (now == prev) {
					cnt++;

				} else {
					max = Math.max(max, cnt);
					cnt = 1;
					prev = now;
				}

				max = Math.max(max, cnt);
			}
			System.out.println(max);
		}

	}

}
