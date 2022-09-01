package ChapterSix;

public class referenceDemo {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		
		System.out.println("runValue() = " + a );
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		
		System.out.println("runReference() =" + a.id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();
		runReference();
	}

}
class A { ㅉ
	public int id;
	A(int id){
		this.id =id;
	}
}
