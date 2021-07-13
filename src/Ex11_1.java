import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		 ArrayList list1 = new ArrayList(10);
		 // ArrayList에는 객체만 저장 가능 
//		 list1.add(new Integer(5));
		 //autoboxing에 의해 (new Integer(5) == 5)
		 list1.add(5);
		 list1.add(new Integer(4));
		 list1.add(new Integer(2));
		 list1.add(new Integer(0));
		 list1.add(new Integer(1));
		 list1.add(new Integer(3));
		 
		 ArrayList list2 = new ArrayList(list1.subList(1, 4));
//		 subList(int fromindex, int toindex) : 기존의 ArrayList의 부분을 뽑아 새로운 ArrayList를 만든다.
//		  **주의** 
//		 from<= list < to
		 
		 print(list1, list2);
		 
//		 -정렬
		Collections.sort(list1);
		Collections.sort(list2);
//		**주의** Collection은 인터페이스 Collections는 유틸 클래스
		print(list1, list2);
		
		//list2의 모든 요소가 list1에 있는가?
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		System.out.println();
//		 -추가-
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		
		print(list1, list2);
		
//		-변경-
		list2.set(3, "AA");
		
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
//		-검색-
//		indexOf()는 지정한 객체의 위치(index)를 알려준다.
		System.out.println("index = "+list1.indexOf(1));
		print(list1, list2);
		
//		-삭제-
		list1.remove(new Integer(1));
		
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2) );
		print(list1, list2);
		
		for(int i = list1.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
	}//main()
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+ list1);
		System.out.println("list2 : "+ list2);
		System.out.println();
	}
	
	static void print(ArrayList list1) {
		System.out.println("list1 : "+ list1);
		System.out.println();
		
	}

}//class 

