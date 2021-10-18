import java.awt.*;

public class Test4 {

	public static void main(String[] args) {
		
		Frame f= new Frame();
		
		//f.setLocation(0, 0);
		//f.setSize(400, 300);
		
		f.setTitle("Test4");
		
		f.setBounds(100, 200, 400, 300);
		f.setBackground(Color.GRAY);
		f.setLayout(null);
		
		
		Button b1 = new Button("확인");
		b1.setLabel("확인");
		b1.setBounds(100, 100, 100, 100);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		
		
		f.add(b1);
		
		f.setVisible(true);
	}
	
}
