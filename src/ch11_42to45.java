/* #ch11-42
 * * TreeSet - 주요 생성자와 메서드
 * 	TreeSet() : 기본 생성자
 * 	TreeSet(Collection c) : 주어진 Collection을 저장하는 TreeSet 생성
 * 	TreeSet(Comparator comp) : 주어진 정렬기준(Comparator)으로 정렬하는 TreeSet을 생성
 * 
 * 	Object first() : 정렬된 순서에서 첫번째 객체를 반환한다.(제일 작은 값)
 * 	Object last() : 정렬된 순서에서 마지막 객체를 반환한다.(제일 큰 값)
 * 
 *	Object ceiling(Object o) : 지정객체(o)와 같거나 가깝게 큰 값을 반환, 없으면 null;
 *	Object floor(Object o) : 지정된객체(o)와 같거나 가깝게 작은 값을 반환, 없으면 null
 * 	Object higer(Object o) : 지정된 객체보다  큰 값을 반환
 * 	Object lower(Object o) : 지정된 객체보다 작은 값을 반환
 * 
 * 	SortedSet subSet(Object fromElement, Object toElement)
 *  from~to사이의 값들을 반환(단 from <= x < to)
 * 	SortedSet headSet(Object toElement) : 지정된 값보다 미만의 값들 반환
 * 	SortedSet tailSet(Object toElement) : 지정된 값보다 초과되는 값들 반환
 *  
 * *참고*
 * 트리 순회(tree traversal)
 * - 이전 트리의 모든 노드를 한번씩 읽는 방법
 * 1. 전이순회(preorder)
 * 2. 후위순회(postorder)
 * 3. 중위순회(inorder)	-> 사용시 오름차순으로 정렬된다.
 * 4. 레벨순회(levelorder) 
 * 
 * */
public class ch11_42to45 {

	public static void main(String[] args) {


	}

}
