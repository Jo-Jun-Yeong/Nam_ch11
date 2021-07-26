
public class ch11_22to24 {
	/**ch11_22 Iterator(신버전), ListIterator(양방향), Enumeration(구버전)
	 * 
	 * 	- 컬렉션에 저장된 데이터에 접근하는데 이용되는 인터페이스
	 * 
	 * 	>Iterator의 메서드
	 * 		boolean hasNext() : 읽어올 요소가 있는지 확인한다. 있으면 true Or false
	 * 		Object next() : 다음 요소를 읽어온다. next() 호출하기 전에 hasnext로 읽을 요소가 있는지 확인 한 후 호출하는게 안전한다.
	 * 
	 *  > Enumeration의 메서드
	 *		boolean hasMoreElements() : 읽어올 요소가 있는지 확인한다. Iterator의 hasNext()와 동일하다
	 *  	Object nextElements() : 다음 요소를 읽어온다.  Iterator의 next()와 동일하다
	 *  
	 *  - Iterator가 필요한 이유
	 *   > Set, list의 구조가 다르기 때문에 저장된 요소들을 얻을때의 방법을 표준화 시킨 것
	 *  - Collection에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용한다.
	 *  	Ex) ArrayList list = new ArrayList(); //다른 컬렉션으로 변경할 때에는 이 부분만 고치면 된다.
	 *  		Collection c = new hashSet(); 	//Set과 List의 조상인 Collection으로 참조변수를 설정했기 때문에
	 *  		Collection c = new TreeSet();	//자손의 객체를 얻을 때에 편한 이점이 있다./
	 *  
	 *  
	 *    
	 *  		Iterator it = list.iterator(); //iterator 구현한 객체 얻기
	 *  		while(it.hasNext()){
	 *  			System.out.println(it.next(););
	 *  		}
	 *			//iterator는 일회용이라 값을 모두 얻어왔다면 다시 객체를 생성해야 한다.
	 *  
	 *  		it = list.iterator(); //iterator 구현한 객체 얻기2nd
	 *  		while(it.hasNext()){
	 *  			System.out.println(it.next(););
	 *  		}
	 *   	
	 **ch11_24 Map과 Iterator   
	 *	- Map에는 Iterator가 없다
	 *	 > Iterator는 Collection(Set + List) 인터페이스에서 구현한 자손이기 때문에
	 *		> 따라서 iterator()가 없으므로 
	 *			keySet(), EntrySet(), values() 를 호출하여 iterator를 호출 해야한다.
	 *		Ex) Map map = new Map();
	 *
	 *			iterator it = map.entrySet().iterator();
	 *			//위의 코드는 아래의 코드를 한줄로 줄인 코드이다
	 *			Set eSet = map.entrySet();
	 *			Iterator it = eSet.iterator();
	 *			1. iterator는 Map에 없기때문에 Set or List의 형태로 값을 받아야한다.
	 *			2. 1의 값에 iterator()를 호출하여 값을 얻어온다.
	 *
	 * */

	public static void main(String[] args) {

	}

}
