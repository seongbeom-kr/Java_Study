package week02_Arrays;
import java.util.*;
public class BJ_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min =0;
		int a,b; // 변수설정
		min += n/5;
		a=n%5;
		min += a/3;
		b=a%3;
		if(b==0) System.out.println(min);
		else System.out.println(-1);
	}

}
