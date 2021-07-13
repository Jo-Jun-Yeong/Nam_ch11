/* ch11-12  LinkedList - 배열의 장단점
 *  -장점-
 *  1. 배열의 구조는 단순하고 데이터를 읽어오는속도(access time)가 빠르다.
 *  2. 데이터의 순자적인 추가(끝터 추가)와 삭제(끝부터 삭제)는 빠르다.
 *  -단점-
 *  1. 크기를 변경할 수 없다.
 *  	- 크기를 변경하는 경우에는 새로운  배열을 생성후 복사 후 참조변경해야 한다.
 *  	- 크기변경을 피하려 큰 배열을 생성하면 메모리가 낭비된다
 *  2. 비 순차적인 데이터의 추가, 삭제에 시간이 많이걸린다.
 *  	- 데이터를 추가하거나 삭제하기 위해서는 기존데이터를 옮겨야 한다.
 *   	
 * ch11-13 배열의 단점을 보완한 linkedList
 *  * LinkedList
 *  class LinkedLis{
 *  	Node node;
 *  	Object  obj;
 *  }  
 *  - 장점 
 *  1. 배열과 달리 불연속적 존제하는 데이터를 연결(link)함
 *  2. 데이터의 삭제를 단 한번의 참조로 가능하게한다.
 *  3. 데이터의 추가는 한번의 node객체 생성과 두번의 참조변경으로 가능하다.
 *  
 *	- 단점
 *	1. 데이터 접근성이 나쁨.
 *	
 *	* Doubly  Linked list(이중 연결 리스트) : 이중 연결리스트 접근성 향상
 *	class doubly linked  list{
 *		Node node;
 *		Node privious;
 *		Object  obj;
 *	}
 *
 *	* double circular linked list(이중 원형 연결 리스트) : 이중 연결리스트의 null값을 활용
 *	doubly  linked의  마지막 node의null값을  첫번쨰  node와 연결하여  
 *	첫번째값의 이전  node를 linke의 마지막 값으로 연결한다.
 *	
 *     ArrayList VS LinkedList
 *     순차적  추가/삭제 -> ArrayList
 *     비순차적 추가/삭제  -> LinkedList
 *     ** index가 n인  데이터의주소 = 배열의 주소 +n * 데이터 타입의 크기 **
 *     
 * */
public class ch11_12to14 {

	public static void main(String[] args) {

	}

}
