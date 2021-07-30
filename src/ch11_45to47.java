import java.util.*;

public class ch11_45to47 {
/* #ch11-46 HashMap과 HashTable - 순서x, 중복(key x, value o )
 *  	* Map인터페이스를 구현, 데이터를 키와 값의 한쌍(Entry)로 묶어서 저장
 *    	* HashMap(동기화 X)은 HashTable(동기화 O)의 신버전
 *    
 *   	* HashMap
 *   		- Map인터페이스를 구현한 대표적인 컬렉션  클래스
 *   		- 순서를 유지하려면 LinkedMap 클래스를 사용하면 된다.
 *   
 *     	* TreeMap  (=TreeSet)
 *     		- 범위 검색과 정렬에 유리한 컬렉션  클래스
 *     		-  HashMap보다 데이터의 추가, 삭제에 시간이 더 걸림
 *     
 *  #ch11-47 HashMap의 키(key)와 값(value)
 *  	-  *해싱(hahsing)* 기법으로 데이터를 저장,  데이터가 많아도 검색이 빠르다.
 *  	- Map인터페이스를 구현, 데이터를 키와 값의 쌍으로 저장
 *  		⌐키(key) : 컬렉션 내의 중복 (X)
 *  		⌙값(value) : 컬렉션 내의 중복 (O)
 *  
 *  HashMap을 구현하면 키와 값을 저장할 수 있는 Entry배열이 있다
 *  
 *  *해싱(hashing)*
 *  - 해싱함수(hash fanction)로 해시 테이블(hash table)에 데이터를 저장, 검색
 *  - 해시 테이블은 배열과 링크드 리스트가  조합된 형태
 *  - 이는 2차원 배열과 유사함
 *  	배열의 장점인 index를 알면 데이터를 바로  알 수 있다.
 *  	리스트의 장점 변경에 유리함을 합친 형태
 *  - LinkedList의 묶음
 *  - 키가 들어가고 Hash Function으로 해시코드(Hash code)가 출력되는 형태이다.
 *  	이 해시코드의 역할은 저장위치, 배열의index를 담당
 *  
 *  > 해시테이블에 저장됨 데이터를 가져오는 과정
 *  	1. 키(key)로 해시함수를 호출해서 해시코드를 얻는다.
 *  	2. 해시코드(index)에 대응하는 LinkedList에서 배열을 찾는다.,
 *  	3. 키와 일치하는 데이터를 찾는다.
 *  		* 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다.
 *  		 서로다른 키 일지라도 같은 값의 해시코드를 반환할 수 있다.
 *  		 -> 서로다른 아이디라도 비밀번호는 같을 수 있다.
 *   
 * */
}