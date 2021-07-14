import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue인터페이스의 구현체인  LinkedList로 
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); //스택 요소  하나를 꺼냄 
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()){
			System.out.println(q.poll()); //Queue에서 요소 하나를 꺼냄
		}
	}

}
