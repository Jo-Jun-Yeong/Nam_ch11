import java.util.*;
public class Ex11_17 {

	public static void main(String[] args) {
		 HashMap map = new HashMap();
		 
		 map.put("김자바", new Integer(90));
		 map.put("김자바", new Integer(100));
		 map.put("이자바", new Integer(100));
		 map.put("강자바", new Integer(80));
		 map.put("안자바", new Integer(90));
		 
		 Set set = map.entrySet();
		 Iterator it = set.iterator(); //map의 key+value값 읽기
		 
		 while(it.hasNext()) {
			 Map.Entry e = (Map.Entry)it.next();
			 System.out.println("이름 : " + e.getKey() + "  점수 : " + e.getValue());
		 }
		 
		 System.out.println("");
		 
		 
		 set = map.keySet(); 	//key값 
		 System.out.println("참가자 명단 : " + set);
		 
		 Collection values = map.values(); //점수 가져오기
		 it = values.iterator(); //value값 읽기
		 
		 int total=0;
		 while(it.hasNext()) {
			 total += (int)it.next();
		 }
		 System.out.println("총점 : " + total);
		 System.out.println("평균 : " +(float)total/set.size() );
			 
		 System.out.println("최고점수 : " + Collections.max(values));
		 System.out.println("최저점수 : " + Collections.min(values));
		  
		 
		 
	}//main()
}