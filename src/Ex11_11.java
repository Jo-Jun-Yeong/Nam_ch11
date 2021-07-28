import java.util.*;

class Ex11_11 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("asdfasd");
		hs.add("asdfasd"); //중복이라서 저장이 안됨
		hs.add(new Person("David", 32));
		hs.add(new Person("David", 32)); 
		
		System.out.println(hs);
		
		
	}//main()

}


//equals(), hashcode() 오버라이딩이 안되엇 중복 저장됨
class Person {
	String name;
	int age;
	
	
	@Override
	public int hashCode() {
		//int Objects.hash(object...values); //...는 가변인자 
		return Objects.hash(name, age);
		
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		//나 자신(this)의 name과 age를 p와 비교
		//7장 다시 보기
		return this.name.equals(p.name) && this.age ==p.age;
	}
	
	Person(String name, int  age){
		this.name = name;
		this.age = age;
		
	}

	public String toString() {
		return name + " : " + age;
	}
	
	
	
}
