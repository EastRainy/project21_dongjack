import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame {

	Panel p1;
	Button b1, b2, b3, b4;
	Label l1, l2;
	int money;

	Test1(String title) {

		super(title);
		money = 0;

		setLayout(new GridLayout(4, 1));
		setBounds(200, 100, 500, 300);
		this.setBackground(Color.lightGray);

		p1 = new Panel();

		l1 = new Label("돈을 입력하세요.", Label.CENTER);
		l1.setFont(new Font("SanSerif", Font.BOLD, 30));
		l1.setForeground(Color.blue);
		l2 = new Label("입력하신 금액 : " + money + " 원.", Label.CENTER);
		l2.setFont(new Font("SanSerif", Font.BOLD, 20));

		l1.setBackground(Color.gray);
		l2.setBackground(Color.white);

		b1 = new Button("100원");
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.black);
		b1.addActionListener(new Event6());

		b2 = new Button("500원");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.black);
		b2.addActionListener(new Event6());

		b3 = new Button("1000원");
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.black);
		b3.addActionListener(new Event6());

		b4 = new Button("초기화");
		b4.setForeground(Color.red);
		b4.setBackground(Color.lightGray);
		b4.setFont(new Font("Serif", Font.BOLD, 24));
		b4.addActionListener(new Event6());

		p1.setLayout(new GridLayout(1, 10, 10, 0));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);

		this.add(l1);
		this.add(p1);
		this.add(l2);
		this.add(b4);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		this.setVisible(true);

	}

	class Event6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Button pred = (Button) (e.getSource());

			if (pred.equals(b1)) {
				money += 100;
			} else if (pred.equals(b2)) {
				money += 500;
			} else if (pred.equals(b3)) {
				money += 1000;
			} else if (pred.equals(b4)) {
				money = 0;
			}

			l2.setText("입력하신 금액 : " + money + " 원.");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test1("돈 입력 GUI");

	}

}
