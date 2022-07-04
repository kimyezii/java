
public class Ex6_16 {

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);

	}

	private static void change(String str) {
		str += "456";
		
	}

}

