package week04;

import java.util.*;

public class BJ_3986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			Stack<Character> stack = new Stack();
			for (int j = 0; j < str.length(); j++) {
				if (!stack.isEmpty() && stack.peek() == str.charAt(j)) {
					stack.pop();
				} else {
					stack.push(str.charAt(j));
				}
			}
			if(stack.isEmpty()) cnt++;
		}
		System.out.println(cnt);
	}

}
