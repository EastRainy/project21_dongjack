import java.awt.*;

public class Test6 {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLayout(null);
		
		f.setTitle("���̽� ����");
		f.setBounds(50, 50, 400, 300);
		
		
		Choice c = new Choice();
		
		c.add("������");c.add("ȭ����");c.add("������");c.add("�����");
		c.add("�ݿ���");c.add("�����");c.add("�Ͽ���");
		
		
		c.setBounds(50, 50, 200, 100);
		
		f.add(c);
		
		
		
		
		f.setVisible(true);
		
	}

}
