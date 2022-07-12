package week03;

import java.util.*;

public class BJ_9226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		while (true) {
			String input = sc.next();
			String res = "";
			boolean check = false;
			if (input.equals("#"))
				break;
			for (int i = 0; i < input.length(); ++i) {
				for (int j = 0; j < vowels.length; ++j) {
					if (input.charAt(i) == vowels[j]) {
						check = true;
						break;
					}

				}

				if (check) {
					res = input.substring(i, input.length()) + input.substring(0, i);
					break;
				}
			}
			System.out.println(res + "ay");
		}
	}

}
