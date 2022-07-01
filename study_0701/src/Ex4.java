import javax.swing.text.StyledEditorKit.BoldAction;

public class Ex4 {

	public static void main(String[] args) {
		//ObjectŬ������ equals()
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		
	}

}

class Person {
	long id;	//this.id

	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		
		return this.id == p.id;
	}

	Person(long id) {
		this.id = id;
	}
}
