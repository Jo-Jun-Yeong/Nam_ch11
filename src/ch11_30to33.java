/* #11_30 Comparator와 Comparable
 *  - 객체 정렬에 필요한 메서드(정렬기 제공)를 정의한 인터페이스
 *   정렬(sort()) : 두 대상을 비교하여 자리 바꾸기를 반복(1.대상, 2.조건)
 *   	static void sort(Object o) //객체 배열에 저장된 객체가 구현한 Comparator에의해 정렬
 *   	static void sort(Object o, Comparator c) // 지정한 Comprarator에의한 정렬 
 *   
 * 		Comparable : 기본 정렬기준을 구현하는데 이용
 * 		Comparator : 기본 정렬기준 외에 다른 기준으로 정렬고자 할 때 이용
 * 			
 * 		*
 * 		 같으면 0
 * 		 왼쪽이 크면 1
 * 		 오른쪽이 크면 -1 를 반환
 * 		*
 * 
 * 		public interface Comparator{
 * 			int compare(Object o1, Object o2)	//o1, o2두 객체를 비교하라는 뜻
 * 			bollean equals(Object o1)		//equals를 오버라이하라는 뜻
 * 			}
 * 
 * 		public interface Comparable{
 * 			int compareTo(Object o) 	//주어진 객체를 자기자신(This, o)과 비교
 * 		}
 * 
 * 
 * */
public class ch11_30to33 {

	public static void main(String[] args) {


	}

}
