/* ch11-15 스택과 큐(Stack & Queue)
 *  > 스택(Stack) : LIFO(Last In  Frist Out)구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다.
 *   - 밑이 막힌 상자에서 순차적으로 쌓아가는 모습(push, put)->[012]->[210]
 *   - 배열이 구현하기 적합한 방식이다.
 *   
 *  > 큐(Queue) : FIFO(First In First Out)구조. 제일 먼저 저아한 것을 재일 먼저 꺼내게 된다.
 *   - 위 아래 양쪽이  뚫린 모습으로 위에서부터 저장하고 뒤애서보터 꺼내는 모습(offer, poll) [012]->[012]
 *   - 링크드리스트가 구현하기 적합한  방식이다.
 *   /
 *  ch11-16 스택과 큐의 메서드
 *  >Stack의 메서드
 *  Stack st = new  Stack(); (push/저장, pop/추출)
 *  boolean empty() : Stack이  비어있는지 알려준다.
 *  
 *  -확인-
 *  Object  peek() : Stack의 맨 위에 저장된 객체를 반환. 
 *  				 pop()과 달리 Stack에서 객체를 꺼내지는 않음.
 *  				 (비어있을 때는 EmptyStackException발생)
 *  
 *  -추가-
 *  Object push(Object item) : Stack에 객체(item)를 저장한다.
 *  
 *  -삭제-
 *  Object pop() :  Stack의 맨 위에 저장된 객체를 꺼낸다.
 *  				(비어있을 때는 EmptyStackException 발생)
 *  
 *  -검색-
 *  int search(Object o) : Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환. 못찾으면 -1반환
 *  						(배열과 달리 위치는 0이아닌 1부터 시작한다.)
 *  
 *	///
 *
 *  >Queue의 메서드
 *  jump to ch11-18
 *  
 *  -추가-
 *  boolean add(Object o) : 지정된 객체를 Queue에 추가한다. 성공하면 true반환.
 *  ↑*예외 발생*↑				저장공간이 부족하면 iliegalStateException발생
 *  *boolean offer(Object o) : Queue에 객체를  저장. 성공하면 true 실패하면 false를 반환
 *  
 *  -삭제-
 *  Object remove() : Queue에서 객체를 꺼내 반환 비어있으면 NoSucjElementException발생
 *  ↑*예외 발생*↑
 *  *Object poll() : Queue에서 객체를 꺼내서 반환.  비어있으면 null을 반환
 *  				
 *  -읽기-
 *  Object element() : 삭제없이 요소를 읽어온다. peek와 달리 Queue가 비었을 때 NoSuchElementException 발생
 *  ↑*예외 발생*↑
 *  Object peek() : 삭제없이 요소를 읽어온다.  Queue가 비어있으면 null을 반환
 *  
 *  ch11-18 인터페이스를 구현한 클래스 찾기
 *  Queue를 구현한 인터페이스에는 여러가지가 있지만 LinkedLis등이 포함되어있어서
 *  Ex) Queue g = new LinkedList(); 로 객체를 만들어 사용할 수 있다.
 *   
 * */
public class ch11_15to18 {

	public static void main(String[] args) {
		

	}

}
