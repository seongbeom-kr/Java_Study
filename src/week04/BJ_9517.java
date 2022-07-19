package week04;
import java.util.Scanner;
public class BJ_9517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = 210;
		int N = sc.nextInt();
		int cnt = sc.nextInt();
		int result = 0;
		for(int i=0;i<cnt;++i) {
			int C = sc.nextInt();
			char P = sc.next().charAt(0);
			
			time -=C;
			if(time<=0) {
				result=N;
				break;
			}
			
			if(P=='T') {
				if(N==8) N=1;
				else N+=1;
			}
			else continue;
		}
		System.out.println(result);
	}

}
