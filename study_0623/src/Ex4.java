
public class Ex4 {

	public static void main(String[] args) {
		// 상속 - 기존의 클래스로 새로운 클래스를 작성하는 것.
		// 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;		// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();		// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello,world");
		stv.caption = true;		// 캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello,world");
	}

}
class Tv {
	boolean power;		//전원상태 on/off
	int channel;		//채널
	
	void power()	{power = !power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
}

class SmartTv extends Tv {		// SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;			//캡션상태 on/off
	void displayCaption(String text) {
		if(caption) {		// 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}
