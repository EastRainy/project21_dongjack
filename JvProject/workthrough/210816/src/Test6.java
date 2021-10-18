import java.awt.*;

public class Test6 {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLayout(null);
		
		f.setTitle("초이스 연습");
		f.setBounds(50, 50, 400, 300);
		
		
		Choice c = new Choice();
		
		c.add("월요일");c.add("화요일");c.add("수요일");c.add("목요일");
		c.add("금요일");c.add("토요일");c.add("일요일");
		
		
		c.setBounds(50, 50, 200, 100);
		
		f.add(c);
		
		
		
		
		f.setVisible(true);
		
	}

}
