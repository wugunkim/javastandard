
public class check {
		String flag;
		public static void main(String[] args) {
			boolean result= isY("y");
			System.out.println(result);
			}
		
		public static boolean isY(String flag) {
			return flag == null ? false : "Y".equals(flag.toUpperCase().trim());
		}
		
	}

