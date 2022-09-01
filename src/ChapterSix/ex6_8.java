package ChapterSix;

public class ex6_8 {
	public static void main(String[] args) {
		Data3 d = new Data3();					// 메모리에 메인메소드 영역 안에 d 객체 주소 형성 
		d.x = 10;
		
		Data3 d2 = copy(d);						//copy(d)의 d는 메인메서드의 d    메인메소드 영역 메모리에d2 생성 
		
		
		System.out.println("d.x=" + d.x);
		System.out.println("d2.x =" + d2.x);
	}
	static Data3 copy (Data3 d) {				//d 는copy의 지역 변수  
		Data3 temp = new Data3();
		temp.x = d.x;
		return temp;
		
	}
}
class Data3 { int x;} 