
import java.awt.*;
import java.awt.event.*;

public class Test3 extends Frame {

	Test3(String title) {
		super(title);
		this.setBounds(100, 100, 500, 400);
		this.setLayout(null);

		Label l1 = new Label("�غ���", Label.CENTER);

		l1.setBounds(250, 150, 150, 100);

		Button b1 = new Button("1��ư");
		b1.setBounds(100, 100, 100, 100);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("1��ư�� ���Ƚ��ϴ�.");
				setBackground(Color.black);

			}

		});
		Button b2 = new Button("2��ư");
		b2.setBounds(100, 200, 100, 100);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("2��ư�� ���Ƚ��ϴ�.");
				setBackground(Color.white);
			}

		});

		add(b1);
		add(b2);
		add(l1);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Test3("�̺�Ʈ ó�� ����");

	}
}