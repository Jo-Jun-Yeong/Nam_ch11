/* #ch11_39 TreeSet - 범위 탐색, 정렬에 사용
 * 	* 이진 탐색 트리(binary search tree)로 구현 범위탐색과 정렬에 유리  
 * 	* 이진 트리는 모든 노드가 최대 2개의 하위노드를 갖음
 * 	* 각 요소(Node)가 나무(Tree)형태로 연결(LinkedList의 변형)
 * 
 * TreeNode의 구현)
 * class TreeNode{
 * 	TreeNode left; 	//왼쪽 자식노드
 * 	Object element;	//저장할 객체
 * 	TreeNode right;	//오른쪽 자식노드
 * } 
 * 
 * 	
 * #ch11_40 이진 탐색 트리(binary search tree)
 * 	* 부모보다 작은 값은 왼쪽에  큰값은 오른쪽에  저장
 * 	* *단점*데이터가 많아질 수록 추가, 삭제에 걸리는 시간이 많이 든다 (=비교횟수가 증가)
 * 
 *  #ch11_41데이터 저장 과정 boolean add(Object o)(<-저장할 객체o)
 *  ex) TreeSet에 7,4,9,1,5의 순서로 데이터를 저장한다면
 *  1. 7이 먼저 저장(root)
 *  2. 7과 4를 비교한 후 작다면 왼쪽에 저장 (4<7)
 *  3. 7과 9를 비교한 후 크다면 오른쪽에 저장 (7<9)
 *  4. 7과 1을 비교한 후 작다면 왼쪽에 저장 
 *     왼쪽에 값이 있다면 그 값과 비교(1<7 -> 1<4)
 *  5. 7과 5를 비교한 후 작다면 왼쪽에 저장 
 *  	왼쪽에 값이 있다면 그 값과 비교후 저장(5<7 -> 4<5)   
 *  
 * */
public class ch11_39to41 {

	public static void main(String[] args) {
		 

	}

}
