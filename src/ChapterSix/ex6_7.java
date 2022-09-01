package ChapterSix;

public class ex6_7 {
	public static void main(String[] args) {							//메모리에 메인 메서드 먼저 할당 . 그 안에  data2 객체 d  주소 생성  
		Data2 d = new Data2();
		d.x = 19;
		System.out.println("Main() : x =" + d.x );
		
		change(d);														//메인은 대기상태 ,체인지 메모리에 실행/ 호출  
		System.out.println("After change(d)" );
		System.out.println("Main() : x = " + d.x);				
	}
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("chage()  : x = " + d.x);
	}
}
class Data2 { int x;}
