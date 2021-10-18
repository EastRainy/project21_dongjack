import java.awt.*;
import java.awt.event.*;

public class Bingo extends Frame {
	// Button[] b = new Button[9];
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	boolean[] stateButtons = { false, false, false, false, false, false, false, false, false }; // �⺻�� false
	// boolean s_b1, s_b2, s_b3, s_b4, s_b5, s_b6, s_b7, s_b8, s_b9; // ��ư ������ ����
	// ����(true or false)

	Bingo(String title) {
		super(title);
		setLayout(new GridLayout(3, 3)); // ������ 3�� 3���� GridLayout���� ����!

		// ������ �߾ӿ� ��ġ��Ű��
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // ȭ���� �ʺ�� ���̸� ���ϱ� ����!!
		setBounds(screenSize.width / 2 - 150, screenSize.height / 2 - 150, 300, 300);

		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");

		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		b5.setBackground(Color.WHITE);
		b6.setBackground(Color.WHITE);
		b7.setBackground(Color.WHITE);
		b8.setBackground(Color.WHITE);
		b9.setBackground(Color.WHITE);

		// 9�� ��ư �̺�Ʈ ó�� �κ�
		b1.addActionListener(new EventBingo());
		b2.addActionListener(new EventBingo());
		b3.addActionListener(new EventBingo());
		b4.addActionListener(new EventBingo());
		b5.addActionListener(new EventBingo());
		b6.addActionListener(new EventBingo());
		b7.addActionListener(new EventBingo());
		b8.addActionListener(new EventBingo());
		b9.addActionListener(new EventBingo());

		// �����ӿ� ���̱�
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);

		////////////// ������ �ݱ� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // ���α׷� ����!
			}
		});

		setVisible(true);
	}

	class EventBingo implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Button b = (Button) arg0.getSource();

			// ��ư ������ orange�� ����! �ٽ� ��ư ������ white�� ����!
			if (b.getBackground() == Color.WHITE) {
				b.setBackground(Color.ORANGE);
			} else {
				b.setBackground(Color.WHITE);
			}

			// �� ��ư ������ �� �� ��ư�� ���� üũ (true or false)
			if (b.getLabel() == "1") {
				if (stateButtons[0] == false) { // 1�� ��ư ���� ���°� false ������ true�� ����
					stateButtons[0] = true;
				} else {
					stateButtons[0] = false;
				}
			} else if (b.getLabel() == "2") {
				if (stateButtons[1] == false) {
					stateButtons[1] = true;
				} else {
					stateButtons[1] = false;
				}
			} else if (b.getLabel() == "3") {
				if (stateButtons[2] == false) {
					stateButtons[2] = true;
				} else {
					stateButtons[2] = false;
				}
			} else if (b.getLabel() == "4") {
				if (stateButtons[3] == false) {
					stateButtons[3] = true;
				} else {
					stateButtons[3] = false;
				}
			} else if (b.getLabel() == "5") {
				if (stateButtons[4] == false) {
					stateButtons[4] = true;
				} else {
					stateButtons[4] = false;
				}
			} else if (b.getLabel() == "6") {
				if (stateButtons[5] == false) {
					stateButtons[5] = true;
				} else {
					stateButtons[5] = false;
				}
			} else if (b.getLabel() == "7") {
				if (stateButtons[6] == false) {
					stateButtons[6] = true;
				} else {
					stateButtons[6] = false;
				}
			} else if (b.getLabel() == "8") {
				if (stateButtons[7] == false) {
					stateButtons[7] = true;
				} else {
					stateButtons[7] = false;
				}
			} else if (b.getLabel() == "9") {
				if (stateButtons[8] == false) {
					stateButtons[8] = true;
				} else {
					stateButtons[8] = false;
				}
			}

			if (stateButtons[0] && stateButtons[1] && stateButtons[2] && !stateButtons[3] && !stateButtons[4]
					&& !stateButtons[5] && !stateButtons[6] && !stateButtons[7] && !stateButtons[8]) {
				System.out.println("�����!");
			} else if (!stateButtons[0] && !stateButtons[1] && !stateButtons[2] && stateButtons[3] && stateButtons[4]
					&& stateButtons[5] && !stateButtons[6] && !stateButtons[7] && !stateButtons[8]) {
				System.out.println("�����!");
			} else if (!stateButtons[0] && !stateButtons[1] && !stateButtons[2] && !stateButtons[3] && !stateButtons[4]
					&& !stateButtons[5] && stateButtons[6] && stateButtons[7] && stateButtons[8]) {
				System.out.println("�����!");
			} else if (stateButtons[0] && !stateButtons[1] && !stateButtons[2] && stateButtons[3] && !stateButtons[4]
					&& !stateButtons[5] && stateButtons[6] && !stateButtons[7] && !stateButtons[8]) {
				System.out.println("�����!");
			} else if (!stateButtons[0] && stateButtons[1] && !stateButtons[2] && !stateButtons[3] && stateButtons[4]
					&& !stateButtons[5] && !stateButtons[6] && stateButtons[7] && !stateButtons[8]) {
				System.out.println("�����!");
			} else if (!stateButtons[0] && !stateButtons[1] && stateButtons[2] && !stateButtons[3] && !stateButtons[4]
					&& stateButtons[5] && !stateButtons[6] && !stateButtons[7] && stateButtons[8]) {
				System.out.println("�����!");
			} else if (stateButtons[0] && !stateButtons[1] && !stateButtons[2] && !stateButtons[3] && stateButtons[4]
					&& !stateButtons[5] && !stateButtons[6] && !stateButtons[7] && stateButtons[8]) {
				System.out.println("�ٺ���!");
			} else if (!stateButtons[0] && !stateButtons[1] && stateButtons[2] && !stateButtons[3] && stateButtons[4]
					&& !stateButtons[5] && stateButtons[6] && !stateButtons[7] && !stateButtons[8]) {
				System.out.println("�ֺ���!");
			}
		}
	}

	public static void main(String[] args) {
		new Bingo("���� ����");
	}
}
