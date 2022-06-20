import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		//  Arrays로 배열 다루기

		int[] arr = {3,4,2,0,1};	//1차원 배열
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D = {{11,12}, {21,22}};		//2차원 배열
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		
//		int[] arr2 = Arrays.copyOf(arr, arr.length);
//		int[] arr2 = Arrays.copyOf(arr, 7);
		int[] arr2 = Arrays.copyOf(arr, 3);	// copyof([],from,to)
		System.out.println(Arrays.toString(arr2));
	}

}
