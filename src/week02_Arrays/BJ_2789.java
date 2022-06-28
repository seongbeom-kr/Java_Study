package week02_Arrays;
import java.util.*; //전부 호출
public class BJ_2789 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		char []strarr = sc.next().toCharArray();
		//입력받은 값을 char 배열로 바꾸기.
		
		char [] comp = "CAMBRIDGE".toCharArray();
		//combridge를 char 배열로 입
		for(int i =0;i<strarr.length;++i) {
			for(int j =0;j<comp.length;++j) {
				if(strarr[i]==comp[j]) strarr[i]='1'; 
				//strarr와 comp 원소 비교 
			}
		}
		for(int i=0;i<strarr.length;++i) {
			if(strarr[i]=='1') continue; // 출력 안하기
			else {
				System.out.print(strarr[i]+" ");
			}
		}
		
	}

}
