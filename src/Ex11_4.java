import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	static Queue q = new LinkedList();
	static final  int MAX_SIZE = 5; //Queue에 최대 5개만큼 명령어를 저장한다.
	
	public static void main(String[] args) {
		System.out.println("help 를 누르면 도움말을 볼 수 있습니다.");

		
		while(true) {
			System.out.println(">>");
			
			try {
				//화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) {
					continue;  
				}
				else if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if(input.equalsIgnoreCase("help")) {
					System.out.println("hepl - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 입력어를"+ MAX_SIZE + "개 보여줍니다.");
				}
				//여기부터 history에 출력
				else if(input.equalsIgnoreCase("history")){
					save(input);
					
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) {
						System.out.println(i+1 + "." + list.get(i));
					}//for

				}//if
				else {
					save(input);
					System.out.println(input);
				}//if(input.equalsIgnoreCase("q"))
				
			}catch(Exception e) {
				System.out.println("입력 오류입니다.");
			}//try-catch
			
		}//while
		
	}//main()

	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		if(q.size() > MAX_SIZE) //size는 collector인터페이스에 정의됨
		q.remove();
	}//save()
}
