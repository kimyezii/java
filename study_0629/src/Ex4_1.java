
public class Ex4_1 {

	public static void main(String[] args) {
//		1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		10 < x && x <20
		
//		2. char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
		!(ch == ' ' || ch =='\t')
		
//		3. char�� ���� ch�� ��x' �Ǵ� ��X' �� �� true�� ���ǽ�		
		ch == 'x' || ch == 'X'
		
//		4. char�� ���� ch�� ����(��0��~��9��)�� �� true�� ���ǽ� 
		'0' <= ch && ch <='9'
		
//		5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���) �� �� true�� ���ǽ�
		('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
		
//		6. int�� ���� year�� 400���� �����������ų� 
//		   �Ǵ� 4�� ���� �������� 100���� ������������ ���� ��  true�� ���ǽ� 
		year%400==0 || year%4==0 && year%100!=0
		
//		7. boolean�� ���� powerOn�� false�϶� true�� ���ǽ�
		powerOn == false	/	!powerOn
		
//		8. ���ڿ� �������� str�� ��yes�� �� �� true�� ���ǽ�
		str.equals("yes")	/	"yes".equals(str)
	
		
		
	}

}
