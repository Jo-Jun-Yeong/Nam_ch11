import java.util.*;
public class Ex11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3"); 
		setA.add("4"); setA.add("5");
		System.out.println("A : " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B : " + setB);
		
		//합집합
		Iterator it = setA.iterator(); //값을  읽어오기 위해 생성
		Iterator it2 = setB.iterator();
//		while(it.hasNext()) {
//			Object tmp  = it.next();
//			setHab.add(tmp);
//			tmp=it2.next();
//			setHab.add(tmp);
//			
//		}//while
//		System.out.println("A 합 B : "+setHab);
		
//		//합집합 간단히
		setA.addAll(setB);
		System.out.println("A 합간 B : "+setA);
		
		
////		교집합
//		it = setA.iterator(); //일회용이라 가져온 값을 전부 읽으면 다시 생성해야 한다.
//		it2 = setB.iterator();
//		while(it.hasNext()&&it2.hasNext()) {
//			Object tmp = it.next();
//			if((setB.contains(tmp)))
//				setKyo.add(tmp);
//		}//while
//		System.out.println("A 교 B : "+setKyo);
		
//		교집합 간단히
		setA.retainAll(setB);
		System.out.println("A 교간 B : "+setA);
		
		
//		//차집합
//		it=setA.iterator();
//		while(it.hasNext()) {
//			Object tmp1 = it.next();
//			if(!setB.contains(tmp1)) {
//				setCha.add(tmp1);
//			}
//		}//wuile
//		System.out.println("A 차 B : "+setCha);
		
		//차집합 간단히
		setA.removeAll(setB);
		System.out.println("A 차간 B : "+setA);
		
	}//main()

}
