
import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame {

	Test1(String title) {
		super(title);
		this.setBounds(100, 100, 500, 400);
		this.setLayout(null);

		Button b1 = new Button("Ȯ��");
		b1.setBounds(100, 100, 300, 200);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ���Ƚ��ϴ�.");

			}

		});

		add(b1);

		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Test1("�̺�Ʈ ó�� ����");

	}
}