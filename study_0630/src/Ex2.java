import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Ex2 {
//
//	public static void main(String[] args) {
//		Button b = new Button("Start");
//		b.addActionListener(new EventHandler());
//		
//	}
//
//}
//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!");
//	}
//}

//↓↓↓↓↓↓↓↓

// 익명 클래스
public class Ex2 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {	//조상이름ActionListener
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
			
		});
		
	}

}