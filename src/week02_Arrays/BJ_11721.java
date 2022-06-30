package week02_Arrays;
import java.util.*;
public class BJ_11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int strLen = str.length();
		int numL = strLen/10;
		System.out.println(numL);
		int start = 0, end =10;
		for(int i = 0;i<numL;i++) {
			System.out.println(str.substring(start,end));
			start +=10;
			end +=10;
			
		}
		System.out.println(str.substring(numL*10));
	}

}
