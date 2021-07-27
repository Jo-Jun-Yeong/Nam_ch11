/* #ch11_25 Arrays(1/4) - 배열을 다루기 편리한 메소드(static) 제공
 * 	(비슷한 static 메서드 : Math, Objects, Collections....)
 * 
 * 	1. 배열의 출력 - toStirng() : 문자열로 변경하여 배열을 출력
 * 		ex) static String toString(boolean [] b); ....
 * 
 * 	2. 배열의 복사 - copyOf(), copyOfRange() : System.array(A, B) A배열을 B배열로 복사
 * 		ex) int [] arr = {1, 2, 3, 4, 5};
 * 			int [] arr2 = copyOf(arr, arr.length); // arr의 배열의 arr.length만큼 복사하여 arr2에 저장
 * 			int [] arr3 = copyRangeOf(arr, 2, 6); //RangeOf = from~to 새로생성되는 배열이 arr.length보다 크면 0으로 채움
 * 													//**from <= x < to**
 * 	
 * #ch11_25 Arrays(2/4)
 * 	3. 배열 채우기 - fill(), setAll()
 * 		ex) int [] arr = new int[5];
 * 			int [] arr2 = fill(arr, 9) //arr을 9로 arr.length만큼 채운다
 * 			int [] arr3 = setAll(arr, (i) -> (int)(Math.round()*5)+1);
 * 
 *  4. 배열의 정렬과 검색 - sort(), binarySearch()
 *  
 *  	ex) binarySearch는 이진탐색시에 정렬이 안되어있다면 잘못된 값이 나온다
 *  							**-5가 나온다면 정렬이 안되있는것이다.**
 *  		int [] arr = {3, 2, 0, 1, 4};
 *  
 *  		1. Arrays.sort(arr); //arr을 정렬한다. 
 *  		2. int idx = Arrays.binarySearch(arr, 3) // arr에서 3이 어디있는지 찾는다.
 *  				**올바른 값 2**
 *  |알아두면 좋음| - 순차검색(탐색)과 이진(2로 나눠가며) 검색
 * 					이진검색은 정렬 한 후에 사용하여야 한다.
 *  		
 *  #ch11_26 Arrays(3/4)
 *   5. 다차원 배열의 출력 - deepToString()
 *    	ex) int [] arr = {0, 1, 2, 3, 4};
 *    		int [][] arr2D = {{11, 22},{21, 22}}
 *    		System.out.println(Arrays.toString(arr)); 	//[0, 1, 2 ,3 , 4, 5]
 *    		System.out.println(Arrays.deepToString(arr2D)); //[[11, 22],[21, 22]]
 *   
 *   6. 대차원 배열의 배교 - deepEquals()
 *   	ex) int [][] arr2D = {{"aaa","bbb"}, {"AAA","BBB"}}
 *    		int [][] arr2D2 = {{"aaa","bbb"}, {"AAA","BBB"}}
 *    		
 *    		System.out.println(Arrays.equals(arr2D, arr2D2)); //false
 *    		System.out.println(Arrays.deepEquals(arr2D, arr2D2)) //true
 *    
 *  #ch11_26 Arrays(4/4)
 *  	7. 배열을 List로 변환 - asList(Object(가변 매개변수)(..배열..)a)
 *  		List list = Arrays.asList(new Integer [] {1, 2, 3, 4, 5}); // list = [1, 2, 3, 4, 5]
 *  		List list = Arrays.asList(1, 2, 3, 4, 5) 	//list = [1, 2, 3, 4, 5]
 *  
 *  		**List는 읽기 전용이기떄문에 
 *  		list.add(6) 을 하면 UnsupprotedOperationException 예외발생**
 *  		따라서 
 *  		List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5))
 *  
 *  	8. 람다와 스트림(14장) 관련 - parallelXXX(), spliterator(), stream()
 *  		생략 
 *  		
 *  		
 * */
public class ch11_25to29 {

	public static void main(String[] args) {
		

	}

}
