import java.awt.*;
import java.awt.event.*;

public class Coffee extends Frame {

	Label l1, l2, l3, l4, l5;
	Panel p1, p2, p3;

	Checkbox c1, c2, c3;
	Checkbox s1, s2, s3;

	CheckboxGroup coffee, size;
	Button b1;
	int sum;

	Color cr1 = new Color(254, 225, 190);
	Color cr2 = new Color(180, 105, 105);

	Coffee(String title) {

		super(title);
		this.sum = 0;

		this.setLayout(null);
		this.setResizable(false);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		
		int fWidth = 400;// screenSize.width / 2;
		int fHeight = 550;// screenSize.height / 2;

		setBounds(screenSize.width / 2 - (fWidth / 2), screenSize.height / 2 - (fHeight / 2), fWidth, fHeight);

		
		
		this.setBackground(cr1);

		l1 = new Label("Ŀ�� ���Ǳ�", Label.CENTER);
		l1.setBounds(100, 40, 200, 50);
		l1.setForeground(cr2);
		l1.setFont(new Font("Serif", Font.BOLD, 20));

		p1 = new Panel();
		p1.setLayout(new GridLayout(1, 2, 20, 20));
		p1.setBounds(25, 100, 350, 200);

		p2 = new Panel();
		p2.setLayout(new GridLayout(4, 1));
		p2.setBackground(cr2);
		l2 = new Label("Ŀ�� ����", Label.CENTER);
		l2.setForeground(Color.white);
		l2.setFont(new Font("SanSerif", Font.PLAIN, 14));

		coffee = new CheckboxGroup();
		c1 = new Checkbox("�Ƹ޸�ī��(1000��)", true);
		c1.setCheckboxGroup(coffee);
		c2 = new Checkbox("ī���(1500��)");
		c2.setCheckboxGroup(coffee);
		c3 = new Checkbox("īǪġ��(2000��)");
		c3.setCheckboxGroup(coffee);
		p2.add(l2);
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);

		p3 = new Panel();
		p3.setLayout(new GridLayout(4, 1));
		p3.setBackground(cr2);

		l3 = new Label("������ ����", Label.CENTER);
		l3.setForeground(Color.white);
		l3.setFont(new Font("SanSerif", Font.PLAIN, 14));

		size = new CheckboxGroup();
		s1 = new Checkbox("����������(+0��)", true);
		s1.setCheckboxGroup(size);
		s2 = new Checkbox("�߰�������(+500��)");
		s2.setCheckboxGroup(size);
		s3 = new Checkbox("ū������(+1000��)");
		s3.setCheckboxGroup(size);
		p3.add(l3);
		p3.add(s1);
		p3.add(s2);
		p3.add(s3);

		p1.add(p2);
		p1.add(p3);

		b1 = new Button("������ּ���.");
		b1.setBounds(25, 320, 350, 50);
		b1.setFont(new Font("Serif", Font.BOLD, 18));
		b1.addActionListener(new CoffeeEvent());
		
		l4 = new Label("��� ��ư�� �����ּ���", Label.CENTER);
		l4.setBounds(25, 390, 350, 50);
		l4.setBackground(Color.black);
		l4.setForeground(Color.yellow);
		l4.setFont(new Font("SanSerif", Font.PLAIN, 14));
		
		l5 = new Label("", Label.CENTER);
		l5.setBounds(25, 460, 350, 50);
		l5.setBackground(Color.white);
		l5.setFont(new Font("SanSerif", Font.PLAIN, 14));
		

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		add(l1);
		add(p1);
		add(b1);
		add(l4);
		add(l5);

		setVisible(true);
	}

	class CoffeeEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Checkbox ans1, ans2;
			int cal=0;

			ans1 = coffee.getSelectedCheckbox();
			ans2 = size.getSelectedCheckbox();
			String ans = null;

			if (ans1.equals(c1)) {
				cal+=1000;
				ans = "�Ƹ޸�ī��, ";
			}
			else if (ans1.equals(c2)) {
				cal+=1500;
				ans = "ī���, ";
			} 
			else if (ans1.equals(c3)) {
				cal+=2000;
				ans = "īǪġ��, ";
			}
			
			
			if (ans2.equals(s1)) {
				ans = ans.concat("����������");
			}
			else if (ans2.equals(s2)) {
				cal+=500;
				ans = ans.concat("�߰�������");
			}
			else if (ans2.equals(s3)) {
				cal+=1000;
				ans = ans.concat("ū������");
			}
			
			sum = cal; 
			l4.setText(sum + "��");
			l5.setText(ans);

		}

	}

}
