package week03;
class Data{int x;}
public class example01 {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x=10;
		System.out.println("main(): x = "+d.x);
		
		Data d2 = new Data();
		
		System.out.println(d.x);
		
		
	}
	public static void change(Data d) {
		d.x =1000;
		System.out.println(d.x);
	}
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}
