
/*	ch11-4 List인터페이스 - 순서O,중복O
 * List = Vecotr + ArrayList + LinkedList
 *  추가 메서드
 *  - void add(int index, Object element)
 *  - boolean addAll(int index, Collection c)
 *  
 *  삭제 메서드
 *  - Object remove(int index)
 *  
 *  읽기 메서드
 *  - Object get(int index)
 *  
 *  쓰기 메서드
 *  - Object set(int index)
 *  
 *  검색 메서드
 *  - int indexOf(Object o) 		//왼쪽에서 오른쪽으로
 *  - int listindextOf(Object o) 	//오른쪽에서 왼쪽으로
 *  
 *  정렬 메서드
 *  - void sort(int index, Object element)
 *  
 *  ch11-5 Set인터페이스 - 순서X 중복X
 *  Set = (SortedSet +T reeSet) + HashSet
 *  Set인터페이스의  메서드 == 	컬렉션 인터페이스 
 *  Set이 집합이므로  집합과 관련된 메서드(Collection에  변화가 잇으면 true 아니면 false 반환)
 * 	합집합
 * 	- boolean addAll(Collection c) : 지정된 collection(c)를 Collection에 추가한다.
 * 
 *  부분 집합
 *  - boolean containsAll(Collection c) : 지정된 collection의 객체들이 Collection에 저장되어있는지 확인한다.
 *  
 *  차집합
 *  - boolean removeAll(Collection c) : 지정된 Collection에 있는 객체들을 모두 삭제한다.
 *  
 *  교집합 
 *  - boolean retainAll(Collection c) : 지정된 Collection을 제외한 나머지 객체들을 삭제한다.
 *  
 *  ch11-6 Map인터페이스 - 순서x,중복(key O, Value X)
 *  Map = hashMap + TreeMap
 *  추가 메서드
 *  -Object put(Object key, Object  Value) : Map에 value객체를 key객체에 연결하여 저장한다.
 *  
 *  삭제 메서드
 *  -Object remove(Object  key) : 지정한 key객체와 일치하는 key-value객체를 삭제한다.
 *  검색 메서드
 *  - boolean containsKey(Object key) : 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다.
 *  - boolean containsValue(Object value) : 지정된 value객체와 일치하는 Map의 value객체가 있는지 확인한다.
 *  - Object get(Object key): 지정한 key객체에 대응하는 value객를 찾아서 반환한다.
 *  읽기 메서드
 *  - Set entrySet() : Map에 저장되어있는 key-value 쌍을 Map.Entry타입의  객체로 저장한  Set에 반환한다.
 *  	entry = key + value
 *  - Set keySet() : Map에 저장된 모든 key객체를 반환한다.
 *  - Collection values() : Map에 저장된 모든 value 객체를 반환한다.  
 * */

public class ch11_3to6 {

	public static void main(String[] args) {

	}

}
