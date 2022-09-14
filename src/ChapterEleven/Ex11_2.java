package ChapterEleven;
import java.util.*;

public class Ex11_2 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("A");
		st.push("B");
		st.push("C");
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println("= Staack =");
		while(!st.empty()) {
			System.out.println(st.pop());//	스택에서 요소를 하나씩 꺼낸다 
		}
		System.out.println("= QUEUE= ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
