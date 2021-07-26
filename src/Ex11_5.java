import java.util.*;
public class Ex11_5 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		HashSet list = new HashSet();
		Collection c = new HashSet();
//		
		 c.add("1");
		 c.add("2");
		 c.add("3");
		 c.add("4");
		 c.add("5");
		 
		 Iterator  it = c.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 System.out.println();
		 
		//iteraor는 일회용이기 때문에 다 읽으면 다시 얻어와야한다.
		 it = c.iterator(); //때문에 새로운  객체 생성
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
//		 for(int i=0;  i<list.size(); i++) {
//			 Object obj = list.get(i); //HashSet으로 바꾸면get을 사용할 수 없기 때문에 
//			 							//iteraor로 값을 읽어오면 Collection인터페이스간의 값 얻기가 쉬워진다.
//			 System.out.println(obj);
			 
//		 }

	}

}
