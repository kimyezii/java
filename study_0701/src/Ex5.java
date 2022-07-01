
public class Ex5 {

	public static void main(String[] args) {
		//StringJoiner
		
		int iVal = 100;
//		String strVal = String.valueOf(iVal);	//int를 String으로 변환한다.
		// == 
		String strVal = iVal+"";	//위의 코드보다 속도가 더 빠름
		
		double dVal = 200.0;
		String strVal2 = dVal + "";		//int를 String으로 변환하는 또 다른 방법
		
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
										//ㄴ문자열을 숫자로 바꾸는 방법
		// ==
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
	}

}


