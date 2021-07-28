import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0; set.size()<6; i++ ) {
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));
		} //set
		
		//set은 sort를 사용할 수 없기 떄문에 list로 sort를 이용해 정렬하여  출력한다
		//1. set의 모든 요소를 list에  저장
		List list = new LinkedList(set);
		//2. sort를 이용해  list를 정렬
		Collections.sort(list);
		//3. list 출력
		System.out.println(list);
	}

}
