/*#HashMap - Hashtable - 순서 X, 중복(key X, value O)
 * 	-HashMap 	동기화X  New
 * 	-Hashtable 	동기화O  Old
 *  
 * 		> 순서를 유지하려면 LinkedGashMap을 사용하면 된다.
 * 		> 해싱 기법으로 데이터의 저장, 수정이 빠름
 * 			-키(Key) : 컬렉션 내 중복 X
 * 			-값(value) : 컬렉션 내의 중복 O
 * 
 *#Hashtable
 * -배열(Array)+LinkedList 를 합친 형태
 *    Araay : index(hashCode)를 알면 데이터를 바로 알 수 있다.
 *    LinkedList : 변경에 유리하다.
 * -해시함수(hash function)로 해시테이블에 데이터를 저장, 검색
 * - 키(key)를 입력해 해시함수를 통해 해시코드가 나오고 이를 hashtable에서 저장위치,index를 알아낸다
 *  *Hashfunction은 같은 key에 같은 HashCode를 반환해야 한다.
 *  				서로다른 Key라도 같은 HashCode를 반환할 수 있다.*
 * */
public class ch11_56_Summary_4 {

}
