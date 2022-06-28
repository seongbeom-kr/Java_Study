package week02_Arrays;

import java.util.*;

public class BJ_2495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = sc.next().toCharArray();
		int max = 0, cnt = 0;
		for(int i=1; i<8;++i) {
			if(arr[i-1]==arr[i]) {
				cnt+=1;
				max=cnt;
			}
			else {
				cnt=0;
			}
			max =Math.max(max, cnt);
		}
		System.out.println(max);
	}

}
