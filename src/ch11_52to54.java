/* # ch11_52 to 54 Collections(1/2)  - 컬렉션을 위한 메서드(static)제공
 * 		1. 컬렉션 채우기, 복사, 정렬, 검색, 등....
 * 				(fill(), copy(), sort(), binarySerarch())
 *  
 * 		2. 컬렉션의 동기화 - syncronizedXXX()
 * 		**Vector O | ArrayList X** 
 * 			static Collection syncronizedCollection(Collection c)
 * 			static List syncronizedList(List l)
 * 			static Set syncronizedSet(Set s)
 * 			static Map syncronizedMap(Map m)
 * 			static SortedSet syncronizedSortedSet(SortedSet SS)
 * 			static SortedMap syncronizedSortedMap(SortedMap SM)
 * 		
 * 			* List syncList = Collections.syncronizedList(new ArrayList(...));
 * 			위와 같이 사용하면 된다.
 * 		 
 * 		3. 변경 불가(readOnly) 컬렉션 만들기 - unmodifiableXXX() = final(상수)
 * 			static Collection unmodifiableCollection(Collection c)
 * 			static List unmodifiableList(List l)
 * 			static Set unmodifiableSet(Set s)
 * 			static Map unmodifiableMap(Map m)
 * 			static NavigableSet unmodifiableNavigableSet(NavigableSet NS)
 * 			static SortedSet unmodifiableSortedMap(SortedSet SS)
 * 			static NavigableMap unmodifiableNavigableMap(NavigableMap NM)
 * 			static SortedMap unmodifiableSortedMap(SortedMap  SM)
 * 
 * 		4. 싱글틀 컬렉션 만들기- singletonXXX()
 * 			-객체 1개만 저장 가능 - 
 * 			static List  singletonList(Object o)
 * 			static Set singleton(Object o)
 * 			static Map singletionMap(Object o)
 * 
 * 		5. 한 종류의 개기체만 저장하는 컬렉션 만들기 - checkedXXX()
 * 			static Collection checkedCollection(Collection c, class type)
 * 			static List checkedList (List l)
 * 			static Set checkedSet (Set s)
 * 			static Map checkedMap (Map m)
 * 			static queue checkedQueue (queue q)
 * 			static NavigableSet checkedNavigableSet(NavigableSet NS)
 * 			static SortedSet checkedSortedSet(SortedSet SS)
 * 			static NavigableMap checkedNavigableMap(NavigableMap NM)
 * 			static SortedMap checkedSortedMap(SortedMap SM)
 * 
 *			*1. List 객체를 만든다.
 *				> List list =  new ArrayList();
 *			2. checked메서드를 이용해서 타입을 지정해 준다.
 *				> List checkedList = checkedList(List, String.class) 	//String타입만 저장 가능
 *				-> checkedList.add("abc") //OK
 *				-> checkedLIst.add(new Integer(3)) //classCastException 발생
 * */
public class ch11_52to54 {

}
