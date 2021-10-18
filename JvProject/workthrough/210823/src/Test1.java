import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame {
	Checkbox cb1, cb2, cb3;
	CheckboxGroup group;

	Test1(String title) {
		super(title); // Frame(title); ������ ����ǥ���� ����!!
		setBounds(200, 200, 400, 300);
		setLayout(new FlowLayout()); // ��->����, ��->�Ʒ�, �������
		setBackground(Color.pink);

		///////////// �޴� ����
		MenuBar mb = new MenuBar(); // �޴���
		Menu mFile = new Menu("File"); // �޴�(File)
		MenuItem miOpen = new MenuItem("Open"); // �޴�������(Open)

		MenuItem miExit = new MenuItem("Exit"); // �޴�������(Exit)

		////////////// Exit �޴������� ������ �� �̺�Ʈ ó��
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		Menu mHelp = new Menu("Help"); // �޴�(Help)

		group = new CheckboxGroup();
		cb1 = new Checkbox("pink", group, true);
		cb2 = new Checkbox("orange", group, false);
		cb3 = new Checkbox("green", group, false);

		////////////// üũ�ڽ� �̺�Ʈ ó��
		cb1.addItemListener(new Event1());
		cb2.addItemListener(new Event1());
		cb3.addItemListener(new Event1());

		// �޴��� �޴� ������ ���̱�
		mFile.add(miOpen);
		mFile.add(miExit);

		// �޴��ٿ� �޴� ���̱�!!
		mb.add(mFile);
		mb.add(mHelp);

		// �����ӿ� �޴��� ���̱�!!
		setMenuBar(mb);

		// �����ӿ� ���̱�
		add(cb1);
		add(cb2);
		add(cb3);

		////////////// ������ �ݱ� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // ���α׷� ����!
			}
		});

		setVisible(true); // ������ ȭ�鿡 ���̱�
	}

	class Event1 implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			Checkbox cb = (Checkbox) arg0.getSource();
			String str = cb.getLabel();

			if (str.equals("pink")) {
				setBackground(Color.pink);
				cb1.setBackground(Color.pink);
				cb2.setBackground(Color.pink);
				cb3.setBackground(Color.pink);
			} else if (str.equals("orange")) {
				setBackground(Color.orange);
				cb1.setBackground(Color.orange);
				cb2.setBackground(Color.orange);
				cb3.setBackground(Color.orange);
			} else {
				setBackground(Color.green);
				cb1.setBackground(Color.green);
				cb2.setBackground(Color.green);
				cb3.setBackground(Color.green);
			}
		}
	}

	public static void main(String[] args) {
		new Test1("�̺�Ʈ ó�� ����");
	}
}
