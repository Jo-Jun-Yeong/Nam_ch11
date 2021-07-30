import java.util.*;
public class Ex11_16 {

	public static void main(String[] args) {
		 HashMap hash = new HashMap();
		 
		 
		 hash.put("myId","1234");
		 hash.put("asdf","1111");
		 hash.put("asdf","1234");
		 
		 Scanner s = new Scanner(System.in); //화면으로부터 라인단위로 입력을 받음
		 
		 while(true) {
			 System.out.println("아이디를 입력해 주세요");
			 System.out.print("ID : ");
			 
			 String IDinput = s.nextLine().trim();
			 
			 System.out.println("비밀번호를 입력해 주세요");
			 System.out.println("PW : ");
			 
			 String PWinput = s.nextLine().trim();
			 
			 if(!hash.containsKey(IDinput)){
				 System.out.println("입력하신 아이디는 없는 아이디입니다.");
				 continue;
			 }//if
			 
			 if(!hash.get(IDinput).equals(PWinput)) {
				 System.out.println("잘못된 비밀번호입니다. 다시 시도해 주세요");
			 }
			 else System.out.println("아이디와 비밀번호가 일치합니다.");
			 break;			 
		 }
		 
	}//main()
}//class
