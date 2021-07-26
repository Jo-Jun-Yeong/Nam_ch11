import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Ex11_3 {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		if(args[0].length()!=0) {
//			System.out.println("입력된 값이 없습니다.");
//		}
//		else {
//		}//else
			
			String input = "((2+3)*1)+3"; //args[0];
			Stack st = new Stack();
			
//				System.out.println(st.size());
			try {
				
				for(int i=0; i<input.length(); i++) {
					char ch = input.charAt(i);
					
					if(ch =='(')  {st.push('(');
					}
					else if(ch ==')') st.pop();
					
				}
				
				
				if(st.size()==0) {
					System.out.println("괄호가 일치합니다.");
				}
				else System.out.println("괄호가 일치하지 않습니다..");
				
				
			}catch(Exception e) {
				System.out.println("괄호가 일치하지 않습니다.");
			}//try-catch
		
	}//main()
}//class
