
public class Ex7_5 {

	public static void main(String[] args) {
		MyTv3 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

	}

}

class MyTv3 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; // (previous channel) ���� ä��
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel = this.channel; // . ���� ä���� ���� ä�ο� �����Ѵ�
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void gotoPrevChannel() {
		setChannel(prevChannel); // . ���� ü���� ���� ä�η� �����Ѵ�
	}
}