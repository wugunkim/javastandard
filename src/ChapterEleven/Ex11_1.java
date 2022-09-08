package ChapterEleven;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		//Arraylist에는 객체만 저장이 가능하다. 컴파일러가 오토박싱 알아서 해준다 원래는 new integer autoboxing에 의해 기본형이 참조형으로 자동 변환 
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));

		
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //sublist 읽기 전용 1~4 새로 리스트 생성 4는 포함되지않음 
		print(list1,list2);
		
		
		//Collection =  interface , Collections = util classs 
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); //3번째 인덱스에 A 추가 ~
		print(list1, list2);
		
		list2.set(3,"AA");			//수
		print(list1, list2);
		
		list1.add(0, "1");
		//indexof는 원하는 객체의 위치 를 알려준다 . 
		System.out.println("indedx="+list1.indexOf(1));
		list1.remove(0);
		list1.remove(new Integer(1)); //1을삭제    삭제 과정 - 삭제할 데이터 아래의 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어 씌운다.  
														//-> 데이터가 이동했으므로 마지막 데이터는 null -> 데이터가 개수가 감소했으므로 size 값을 감소시킨다. 
		
		print(list1, list2);
		System.out.println("list1.retainAll(list2):" +list1.retainAll(list2) );
		print(list1,list2);
		
		for(int i = list2.size()-1; i>=0 ; i--) {
			if(list1.contains(list2.get(0)))  // list2.get(0)을 가져와list1에 포함되는지 - > 포함되면 true , 아니면 false . . .  
				list2.remove(i); 
		}
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
