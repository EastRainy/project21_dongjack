import java.awt.*;
import java.awt.event.*;

public class CheckBMI extends Frame {
	Font f1 = new Font("Serif", Font.BOLD, 23);
	Font f2 = new Font("Serif", Font.BOLD + Font.ITALIC, 24);
	Font f3 = new Font("Serif", Font.PLAIN, 15);
	Font f4 = new Font("SansSerif", Font.BOLD, 20);

	Color c1 = new Color(0, 25, 50); // ���ѳ���
	Color c2 = new Color(0, 64, 128); // ����
	Color c3 = new Color(217, 236, 255); // �ϴû�

	Panel p1, p2, p3;
	Label l1, l2, l3, l4, l5;
	TextField tfcm, tfkg;
	Button b1, b2;

	CheckBMI(String title) {
		super(title);
		setLayout(new GridLayout(3, 1)); // ������ GridLayout ����(3�� 1��)

		// ������ �߾ӿ� ��ġ��Ű��
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // ȭ���� �ʺ�� ���̸� ���ϱ� ����!!
		setBounds(screenSize.width / 2 - 200, screenSize.height / 2 - 150, 400, 300);

		////////////////// Panel 1 �κ�
		p1 = new Panel();
		p1.setLayout(null);

		l1 = new Label("BMI ��� ���α׷�", Label.CENTER);
		l1.setBounds(80, 20, 240, 50);
		l1.setFont(f1);
		l1.setBackground(c1);
		l1.setForeground(c3);

		p1.add(l1);

		////////////////// Panel 2 �κ�
		p2 = new Panel();
		p2.setLayout(null);
		p2.setBackground(Color.ORANGE);

		l2 = new Label("Ű(cm) :", Label.RIGHT);
		l2.setBounds(10, 15, 90, 27);

		l3 = new Label("������(kg) :", Label.RIGHT);
		l3.setBounds(10, 45, 90, 27);

		tfcm = new TextField();
		tfcm.setBounds(110, 15, 90, 27);

		tfkg = new TextField();
		tfkg.setBounds(110, 45, 90, 27);

		b1 = new Button("���");
		b1.setBounds(210, 15, 75, 60);
		b1.setFont(f3);

		b2 = new Button("�ʱ�ȭ");
		b2.setBounds(290, 15, 75, 60);
		b2.setFont(f3);

		p2.add(tfcm);
		p2.add(tfkg);
		p2.add(l2);
		p2.add(l3);
		p2.add(b1);
		p2.add(b2);

		////////////////// Panel 3 �κ�
		p3 = new Panel();
		p3.setLayout(null);
		p3.setBackground(c2);

		l4 = new Label("Ű�� �����Ը� �Է����ּ���", Label.CENTER);
		l4.setBounds(30, 10, 325, 35);
		l4.setForeground(c3);
		l4.setFont(f3);

		l5 = new Label("BMI ���α׷�", Label.CENTER);
		l5.setBounds(30, 45, 325, 35);
		l5.setForeground(Color.orange);
		l5.setFont(f3);

		p3.add(l4);
		p3.add(l5);

		// �����ӿ� �г� ���̱�
		add(p1);
		add(p2);
		add(p3);

		////////////// tfcm, tfkg, b1 �̺�Ʈ ó��
		tfcm.addActionListener(new Event1());
		tfkg.addActionListener(new Event1());
		b1.addActionListener(new Event1());

		////////////// b2 �̺�Ʈ ó��
		b2.addActionListener(new Event2());

		////////////// ������ �ݱ� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // ���α׷� ����!
			}
		});

		setVisible(true);
	}

	class Event1 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			double cm, kg, bmi;

			cm = Double.parseDouble(tfcm.getText());
			kg = Double.parseDouble(tfkg.getText());

			bmi = kg / ((cm / 100) * (cm / 100));
			bmi = Math.round(bmi * 100) / 100.0; // �Ҽ��� 2�ڸ� ǥ���� ���� ���~

			l4.setText("����� BMI�� " + bmi + "�Դϴ�.");

			if (bmi < 18.5) {
				l5.setText("��ü�� �Դϴ�");
				l5.setForeground(Color.red);
			} else if (bmi >= 18.5 && bmi < 23.0) {
				l5.setText("���� �Դϴ�");
				l5.setForeground(Color.GREEN);
			} else if (bmi >= 23 && bmi < 25.0) {
				l5.setText("��ü�� �Դϴ�");
				l5.setForeground(Color.YELLOW);
			} else {
				l5.setText("�� �Դϴ�");
				l5.setForeground(Color.red);
			}
		}
	}

	class Event2 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			l4.setForeground(c3);
			l5.setForeground(Color.orange);

			tfcm.setText("");
			tfkg.setText("");
			l4.setText("Ű�� �����Ը� �Է����ּ���");
			l5.setText("BMI ���α׷�");
		}
	}

	public static void main(String[] args) {
		new CheckBMI("BMI ��� ���α׷�");
	}
}
