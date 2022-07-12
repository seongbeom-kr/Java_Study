package week03;
import java.util.*;
public class BJ_1919 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str1 =sc.next();
		String str2 =sc.next();
		int cnt = 0;
		int[] alp =new int['z'-'a'+1];
		
		for(int i =0; i< str1.length();++i) {
			alp[str1.charAt(i)-'a']++;
		}
		for(int i =0; i< str2.length();++i) {
			alp[str2.charAt(i)-'a']--;
		}
		for(int i =0;i<alp.length;++i) {
			cnt+=Math.abs(alp[i]);
		}
		
		System.out.println(cnt);
	}

}
