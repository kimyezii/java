import javax.swing.text.StyledEditorKit.BoldAction;

public class Ex3 {

	public static void main(String[] args) {
		//ObjectŬ������ equals()
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		}else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
	} 


}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	//Object�� equals()�� �������̵��ؼ� �ּҰ� �ƴ� value�� ��.
	public boolean equals(Object obj) {
//		return this == obj; // �ּҺ�. ���δٸ� ��ü�� �׻� ���� ->v1�� v2�� �ٸ��ϴ�.
		//���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ���.
		if(!(obj instanceof Value)) {
			return false;
		}
		
		
		Value v = (Value)obj;	//obj�� value�� ����ȯ
		
		return this.value == v.value;
	}
}