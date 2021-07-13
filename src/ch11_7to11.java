/*	ch11-8 ArrayList  메서드
 * -생성자-
 * - ArrayList() : 기본 생성자
 * - ArrayList(Collection C) : 매계변수로Collection을 주면 이에 해당하는 ArrayList생성
 * - ArrayList(int initialCapacity) : 배열의 길이
 * 
 * -추가-
 * - boolean add(Object o) : (Object = 객체) 추가에 성공하면 true 반환, 그냥 추가하면 맨 뒤에 추가
 * - void add(int index, Object element) : 위치를 지정하여 추가
 * - boolean addAll(Collection c) : Collection을 추가
 * - boolean addAll(int  index, Collection c) : 위치를 지정하여 Collection을 추가
 * 
 *  -삭제-
 *  - boolean remove(Object o)
 *  - Object remove(int index)
 *  - boolean removeAll(Collection c)
 *  - void clear() 		//모든 객체 삭제
 *  
 *  -검색-
 *  - int indexOf(Object o) : 이 객체의 위치를 찾아줌, 못찾으면 -1 반환
 *  - int  lestindexOf(Object o) : 뒤에서 부터 위치를 찾아줌
 *  - boolean contains(Object o) : 객체가 존재하는지 있으면 true반환
 *  - Object get(int index) : 특정 위치에 있는 객체를 반환
 *  - Object set(int index, Object element) : 특정 위치의 객체를 변경
 *  
 *  - -
 *  - List subList(int fromIndex, int tolndex) : from과 to 사이의 객체들을 뽑아 새로운 List를 만든다.\
 *  - Object[] to Array() : ArrayList의 객체 배열을 반환
 *  - Object[] to Array(Object[] a) : AraayList에 있는 객체 a를 반환 
 *  - boolean isEmpty() : 비어있는지 확인
 *  - void trimToSize() : 빈공간 제거
 *  - int size() : 저장된 객체의 갯수를 반환
 *  
 *  ch11-10 ArrayList에 저장된 객체의 삭제 과정
 *  1. 삭제할 테이터의 ++데이터를 복사후 붙여넣는다
 *  2. size-1의 위치를 null로 변경한다.
 *  3. size-- 하여 크기를 작게한다.
 *   **마지막 객체를 삭제할 떄에는**
 *   2. size-1의 위치를 null로 변경한다.
 *   3. size--하여 크기를 작게한다.
 *   
 *   for()문을 이용하여 삭제할 떄에는i값을 증가시켜 삭제할 경우
 *   inde값에 의해 삭제가 안되는곳이 있을 수도 있다.
 *   따라서 삭제는 i값을 감소시켜서 삭제한다.
 *   
 *   for(int i =list.size()-1; i>=0 i--){
 *   
 *   }
 *   
 *  
 * */
public class ch11_7to11 {

	public static void main(String[] args) {
		
	}//main()

}//class
