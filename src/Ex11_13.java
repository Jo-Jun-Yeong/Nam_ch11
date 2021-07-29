import java.util.*;
public class Ex11_13 {

	public static void main(String[] args) {
		Set set = new TreeSet(); //TreeSet이기 때문에 정렬이 되어 출력
								//따라서 범위검색과 정렬에 유리
//		Set set = new HashSet(); 
		
		
		for(int i=0; set.size()<6; i++) {
			int random = (int)(Math.random()*45)+1;
			set.add(random);
		}//for

		System.out.println(set);
		
	}//main()
	/*TreeSet은 꼭 정렬기준이 필요하기 때문에
	 *정렬 기준을 넣거나 구현을 하여야한다.
	 *넣지 않는다면 기본정렬기준(Comparable)이 적용된다.
	 * */
	
}
