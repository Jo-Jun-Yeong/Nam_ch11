import java.util.Arrays;

public class Ex11_6 {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		int [] arr3 = Arrays.copyOf(arr, 3);
		int [] arr4 = Arrays.copyOf(arr, 7);
		
		int [] arr5 = Arrays.copyOfRange(arr, 2, 4);	 //2<=x<4
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);	 //0<=x<7 
		
		System.out.println("arr2"+Arrays.toString(arr2));
		System.out.println("arr3"+Arrays.toString(arr3));
		System.out.println("arr4"+Arrays.toString(arr4));
		System.out.println("arr5"+Arrays.toString(arr5));
		System.out.println("arr6"+Arrays.toString(arr6));
		
		int [] arr7 = new int[5];
		Arrays.fill(arr7, 7); //arr7배열을 7로 채운다
		System.out.println("arr7"+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*5)+1);
		System.out.println("arr7"+Arrays.toString(arr7));
		
		for(int i : arr7) { //향상된 for문
//			for(int x = 0; x<arr7.length; x++){
//			int i = arr7[x];
			
			char[] gragh = new char[i];
			Arrays.fill(gragh, '*');
			System.out.println(new String(gragh)+i);
			//String -> char[] : tocharArray();
			//char [] -> String : String(char[]);	
		}//for
		
		String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr : "+Arrays.toString(chArr));
		System.out.println("index of B : " + Arrays.binarySearch(chArr , 'B'));
		System.out.println("= after sort =");
		
		Arrays.sort(chArr);
		System.out.println("after sort chArr : "+Arrays.toString(chArr));
		System.out.println("index of B after sort : "+ Arrays.binarySearch(chArr, 'B'));
		
	}

}
