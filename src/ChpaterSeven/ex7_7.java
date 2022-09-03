package ChpaterSeven;

public class ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car = new Car();
		//FireEngine fireEngine= (FireEngine) car;	//	형변환 실행 에러 java.lang.CalsscastException 
		//fireEngine.water();					//컴파일은된다 
		
		FireEngine f = new FireEngine();
		f.drive();
		f.stop();
		f.water();
		
		
		
	}

}
class Car {
	String color;
	int door;
	
	void drive () {
		System.out.println("액셀");
	}
	void stop () {
		System.out.println("브레이크");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("물대포");
	}
}