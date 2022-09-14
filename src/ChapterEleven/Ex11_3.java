package ChapterEleven;
import java.util.*;
public class Ex11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length !=1) {
//			System.out.println("Usage: java Ex11_3 \"EXPRESSION\"");
//			System.out.println("Example: java Ex11_3 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		Stack st = new Stack();
		String expression = "((3+5+)*3)/2";
		System.out.println("Expression : " + expression);
		
		try {
			for ( int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {
					st.push(ch+"");
				}else if ( ch== ')') {
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다");
				
			}else {
				System.out.println("괄호가 일치하지않습니다");
			}
		}
			catch (EmptyStackException e){
				System.out.println("괄호가 일치하지않습니다");
			}
		}
	}

