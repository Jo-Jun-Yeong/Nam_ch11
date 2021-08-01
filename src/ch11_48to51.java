/*	# ch11_48 HashMap의 주요 메서드
 * 		HashMap()
 * 		HashMap(int initialCapacity) : 배열의 초기 용량 설정
 * 		HashMap(int initialCapacity, float loadFactor) : + 용량 증설 시기
 * 		HashMap(Map m) : Map(m)을 HashMap으로 바꿔준다
 * 
 * 		-추가-
 * 		Object put(Object key, Object value)
 * 		void putAll(Map m)
 * 
 * 		-삭제-
 * 		Object remove(Object key)
 * 
 * 		-변경-
 * 		Object replace(Object key, Object value) : key에 해당하는 value를 새로운 값으로 변경
 * 		boolean replace(Object key, Object Value, Object newValue) : ""
 * 
 * 		-읽기-
 * 		Set entry() : 키+값을 Set의 형태로  가져온다
 * 		Set keySet() : 키를 Set의 형태로 가져온다
 * 		Collection value() : 값을 Collection의 형태로 가져온다
 * 		
 * 		-반환-
 * 		Object get(Object  key) : 주어진  key에 해당하는 값을 반환한다.
 * 		Obejct gerOrDefault(Object key, Object defualtValue)
 * 		 : 주어진 key값이 HashMap에 없을 때 defualtValue가 반환된다.
 * 		boolean containskey(Object key) : 지정된 key가 있는지 확인
 * 		boolean containsvalue(Object value) : 지정된 value가 있는지 확인
 * 		
 * 		-기본-
 * 		int size(), boolean isEmpty(), void clear(), Object clone()
 * */
public class ch11_48to51 {

}
