import java.util.*;

/* #ArrayList
 * 	- 동기화 x
 * 	- 배열 기반 + 연결(List)
 * 
 * 		#스택(Stack)
 * 			-바닥이 막힌 통 구조로 되어있다.
 * 			-Push로 넣고 Put으로 빼낸다.
 * 			-ArrayList로 구현
 *  		-Stack 객체를 만들어서 사용
 *   		- 수식의 계산 확인, 엑셀의undo/redo, 인터넷 브라우저의 앞,뒤로가기
 *   		 ex)Stack s = new Stack();
 *   
 * 
 * 
 * #LinkedList
 * 	- 불연속적 데이터를 서로 연결(Link)함
 * 	- 데이터의 삭제는 한번의 참조로 가능
 * 	- 데이터의 추가는 한번의 node 객체 생성, 2번의 참조변경으로 가능
 * 	- 데이터의 접근성 나쁨
 * 
 * 		#큐(Queue)
 * 			-바닥이 뚫린 통 구조로 되어있다.
 * 			-Offer로 넣고 Poll로 뺴낸다
 * 			-Queue를 구현한 인터페이스로 구현 가능
 * 			-LinkedList... 등으로 구현 가능
 * 			-최근 사용문저, 인쇄작업 대기목록등...
 * 			 ex) Queue q = new LinkedList();
 * 			
 *
 * #이터레이터(Iterator)
 * 	이터레이터가 필요한 이유
 * 	>Set, List의 구조가 다르기 때문에 각 저장된 요소를 얻을 방법을 표준화 시킨 것이다.
 * 		ex) ArrayLsit list = new ArrayList();
 * 			Iterator it = list.iterator();
 * 			while(it.hasNext()){ //hasNext를 통해 다음 얻을 값이 있는지 확인 할 필요가 있다.
 * 				System.out.println(it.next()); //list에 입력되있는 값을 얻어온 후 출력한다.
 * 			} 
 * 		*주의* iterator는 한번 값을 받아오고 사용하면 재사용시 다시 받아와서 사용해야 한다.
 * 	> Map에서는 iterator가 없기 때문에 
 * 	   keySet(), entrySet(), values()를 호출한 후 iterator를 호출해야 한다.
 * 		ex)
		Map map = new TreeMap();
		
		Set eSet = map.entrySet();
		Iterator it = eSet.iterator();
		아래와 같이 줄일 수 있다.
		Iterator it2 = map.entrySet().iterator();
		
		즉 Set, List의 형태로 받아서 iterator()를 호출해야 한다.
		
		
 * 
 * */	
public class ch11_56_Summary_2 {
	
}
