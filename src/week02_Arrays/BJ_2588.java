package week02_Arrays;

import java.util.*;


public class BJ_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String B = sc.next();
		char[] b = B.toCharArray();
		
		System.out.println(a*(b[2]-'0'));
		System.out.println(a*(b[1]-'0'));
		System.out.println(a*(b[0]-'0'));
		System.out.println(a* (Integer.parseInt(B)));
		
		
		
	}
}