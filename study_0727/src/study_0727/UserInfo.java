package study_0727;
//직렬화와 역직렬화 ex1)
                        
public class UserInfo implements java.io.Serializable {
	String name;
	String password;
	int age;

	public UserInfo() {
		this("Unknown", "1111", 0);
	}

	public UserInfo(String name, String password, int age) {
		this.name = name;	
		this.password = password;	
		this.age = age;	
	}

	public String toString() {
		return "("+ name + "," + password + "," + age + ")";
	}
}