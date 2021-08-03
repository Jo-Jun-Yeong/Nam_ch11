import java.util.LinkedList;
import java.util.*;

/*	#11장 요약
 * 	컬렉션 (Collection) : 여러 객체(Object)를 모아 놓은것
 *	프레임 웍(FrameWork) : 표준화, 정형화 뙨 프로그래밍 방식 -> 라이브러리 + 프로그래밍 방식.,
 *	라이브러리 : 다른 사람이 만들어 놓은 기능을 모아 놓은 것, 기능만 제공한다.
 *
 *	컬렉션 클래스 : 다수의 데이터를 저장할 수 있는 클래스
 *				ex) ArrayLsit, Vector, HashSet
 *
 * #List : 순서 O, 중복 O
 * 줄세워 데이터를 저장하는 형태
 * 
 * 	# List = Vector + ArrayList + LinkedList
 * 	
 * 		-메서드-
 * 		void add(int index, Object element)
 * 		voidaddAll(int index, Collection c)
 * 
 * 		Object remove(int index) : 해당 index의 객체를 삭제한다.
 * 		Object set(int index) : set의 형태로 객체를 저장한다.
 * 	 
 * 		Object get(int index)
 * 
 * 		int indexOf(Object o)
 * 		int lastindexOf(Obejct o)
 * 
 * 		void sort(int index, Object element);
 * 
 * 		
 * 	# Set - 순서 X, 중복 X
 * 		Set = (sortedSet + TreeSet) + HashSet
 * 		대부분의 메소드는 Collection의 메소드와 같다.
 * 
 * 		합집합
 * 		boolean addAll(Collection c) : 지정된c를 Collection에 추가한다.
 * 		부분집합
 * 		boolean containAll(Collection c) : c가 Collection에 있는지 확인한다.
 * 		차집합
 * 		boolean removeAll(Collection c) : c에 있는 객체들을 모두 삭제한다.
 * 		교집합
 * 		boolean reetainAll(Collection c) : c를 제외한 나머지 객체들을 모두 삭제한다.
 * 
 * 
 * 	# Map - 순서x, 중복(키X, 값O)
 * 		Map = HashMap + TreeeMap
 * 		키(key), 값(value)의 한쌍인 Entry로 구성되어있다.
 * 
 * 		Obejct put(Object key, Object value)
 * 
 *		Object get(Obejct key) : key에 대응하는 Value값을 반환한다.
 * 
 * 		Object remove(Obejct key)
 * 
 * 		Object containsKey(Object key) : key가 Map에 있는지 확인한다.
 * 		Object containsValue(Object value) : value가 Map에 있는지 확인한다.
 * 
 * 		set entrySet : Map에 저장되어있는 key-value쌍을 Map.eentry타입의 객체로 저장한다.(Set 형태로 반환)
 * 		set keySet : Map의 모든 kry를 set형태로 반환한다.
 * 		Collection values : Map의 모둔 Value를 반환한다.
 * 		
 * */
public class ch11_56_Summary_1 {
	List list = new LinkedList();
	
	
}
