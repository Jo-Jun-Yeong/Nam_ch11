import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

	public static void main(String[] args) {
		Object [] objArr = {"1", new Integer(1), "2", "2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i =0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		//set에 저장되어있는 요소를 출력한다.
		System.out.println(set);
		
		//set에 저장되어있는 요소를 iterator를 이용해 출력한다
		Iterator it  = set.iterator();
				
		while(it.hasNext())
		System.out.println(it.next());
		
		//중복은 허용이 안되고 1이 중복으로 나온 이유는  첫1은 문자열이고 두번째1은 Integer타입이다 
		
	}//main()
}//class 
