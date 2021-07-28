/* #ch34 HashSet - 중복x 순서x
 *  Set = HashSet + TreeSet
 *   * HashSet
 *    	> Set인터페이스를 구현하는 대표적인 컬렉션 클래스
 *    	> 순서를 유지하려면 LinkedHashSet을 사용하면 된다
 *    
 *   * TreeSet
 *   	> 범위검색과 정렬에 유리한 컬렉션 클래스
 *   	> HashSet보다 데이터 추가,삭제에 시간이 더 걸림
 *   
 *   - HashSet의 주요 메서드
 *   	> HashSet()
 *   	> HashSet(Collection c)
 *   	> HashSet(int initialCapacity) : 초기 용량  설정
 *   	> HashSet(int initialCapacity, float loadFactor) : 초기용량 + 용량의 추가 증설 시기 
 * 	
 * 	 	 추가
 * 		> bollean add(Object o)
 * 		> bollean addAll(Collection c) //합집합
 * 		 삭제
 * 		> boolean remove(Object o)
 * 		> boolean removeAll(Collection c) //교집합
 * 		> boolean clear() //모두 삭제
 * 		 기타
 * 		> bollean retainAll(Collection c) //차집합
 *		 검색?
 *		> boolean contains(Object o )
 *		> boolean containsAll(Collection c) 
 *		> boolean isEmpty()
 *		 읽기
 *		> iterator iterator(); 	//Collection의 요소 읽기
 *		> int size()
 *		 반환
 *		> Object [] toArray()
 *		> Object [] toArray(Object[] a)
 *		 
 * */
public class ch_34to36 {

	public static void main(String[] args) {
		

	}

}
