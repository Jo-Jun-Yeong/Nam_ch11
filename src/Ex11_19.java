import java.util.*;
import static java.util.Collections.*;
public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);
		System.out.println(list);

		swap(list, 0, 3);
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list, reverseOrder());
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int idx = binarySearch(list, 3); //binarySearch를 사용하기 전엔 sort를 해야한다. 
		System.out.println("3이 있는 index : " + idx);
		
		System.out.println("Max : "+max(list));
		System.out.println("Min : "+min(list));
		System.out.println("Min : "+max(list, reverseOrder()));
		
		fill(list, 9);
		System.out.println(list);
		
		List nlist = nCopies(list.size(), 2);
		System.out.println(nlist);
		
		System.out.println(disjoint(list, nlist)); //둘 간의공통 요소가 없으면 true
		
		copy(list, nlist); //B를 A에 복사한다.
		System.out.println("list : "+list);
		
		Enumeration e = enumeration(list);
		List list2 = list(e);
		
		System.out.println("list2 : " + list2);
	}

}
