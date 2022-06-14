
public class Ex4 {

	public static void main(String[] args) {
		//반올림
//		long result = Math.round(4.52);
//		System.out.println(result);
		
		double pi = 3.141592;
//		double shortPi = Math.round(pi * 1000)/1000.0;
//		System.out.println(shortPi);
//		해설
//		(3.141592 * 1000) / 1000.0
//		3141.592 / 1000.0
//		3142 / 1000.0
//		3.142
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); //3
		System.out.println(Math.round(pi*1000)/1000.0); //3.142
		System.out.println("");
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000);
		System.out.println((int)(pi*1000)/1000.0);
		
	/*	int 3142 / int 1000			결과 : int3
	*   int 3142 / double 1000.0	결과 : double 3142.0 / double 1000.0 -> double 3.142
	*/
		
		
		
	}

}
