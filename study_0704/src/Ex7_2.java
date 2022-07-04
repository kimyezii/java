
public class Ex7_2 {

	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck2() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int) (Math.random() * cards.length);
// cards[i] cards[j] . 와 의 값을 서로 바꾼다
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM) // index . 의 유효성을 검사한다
			return null;
		return cards[index];
	}

	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index); // pick(int index) . 를 호출한다
	}
} // SutdaDeck

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
