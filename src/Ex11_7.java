import java.util.*;


class Ex11_7 {

	public static void main(String[] args) {
		String [] arr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(arr); 	//기본 String의 Comparator에의한 정렬
		System.out.println("arr : " + Arrays.toString(arr));
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); 	//대소문자 구분 안함
		System.out.println("arr : "+Arrays.toString(arr));
		
		Arrays.sort(arr, new Descending());
	}//main()

} //main class

class Descending implements Comparator{
	
	public int compar(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; //-1을 곱해서 정렬을 역순으로 한다.
		} //if
		
		return -1;
	}//comp
} //Descending class
