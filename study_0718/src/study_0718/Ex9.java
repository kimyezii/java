package study_0718;

@FunctionalInterface
interface MyFunction2 {
	void run(); // public abstract void run();
}

class Ex9 {
	static void execute(MyFunction2 f) { // �Ű������� Ÿ���� MyFunction�� �޼���
		f.run();
	}

	static MyFunction2 getMyFunction2() { // ��ȯ Ÿ���� MyFunction�� �޼���
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// ���ٽ����� MyFunction�� run()�� ����
		MyFunction2 f1 = () -> System.out.println("f1.run()");

		MyFunction2 f2 = new MyFunction2() { // �͸�Ŭ������ run()�� ����
			public void run() { // public�� �ݵ�� �ٿ��� ��
				System.out.println("f2.run()");
			}
		};

		MyFunction2 f3 = getMyFunction2();
						//��System.out.println("f3.run()");

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute(() -> System.out.println("run()"));

	}

}
