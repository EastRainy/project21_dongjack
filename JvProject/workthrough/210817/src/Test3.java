import java.awt.*;

public class Test3 {

	public static void main(String[] args) {

		Frame f = new Frame("�г� ����");
		f.setLayout(null);
		f.setBounds(200, 200, 400, 500);

		
		Label l = new Label("�����ϴ� ���� ����",Label.CENTER);
		l.setBounds(100,80,200,80);
		l.setBackground(Color.yellow);
		l.setForeground(Color.magenta);
		f.setFont(new Font("SansSerif",Font.BOLD,20));
		
		
		Panel p = new Panel();
		p.setLayout(null);
		p.setBounds(100, 100, 200, 200);
		
		Button b = new Button("�׽�Ʈ");
		b.setBounds(50, 50, 50, 50);
		p.add(b);
		
		
		
		
		
		f.add(l);
		f.add(p);
		
		f.setVisible(true);
		
	}

}
