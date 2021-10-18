import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame {
	Checkbox cb1, cb2, cb3;
	CheckboxGroup group;

	Test1(String title) {
		super(title); // Frame(title); 프레임 제목표시줄 설정!!
		setBounds(200, 200, 400, 300);
		setLayout(new FlowLayout()); // 왼->오른, 위->아래, 가운데정렬
		setBackground(Color.pink);

		///////////// 메뉴 구성
		MenuBar mb = new MenuBar(); // 메뉴바
		Menu mFile = new Menu("File"); // 메뉴(File)
		MenuItem miOpen = new MenuItem("Open"); // 메뉴아이템(Open)

		MenuItem miExit = new MenuItem("Exit"); // 메뉴아이템(Exit)

		////////////// Exit 메뉴아이템 눌렀을 때 이벤트 처리
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		Menu mHelp = new Menu("Help"); // 메뉴(Help)

		group = new CheckboxGroup();
		cb1 = new Checkbox("pink", group, true);
		cb2 = new Checkbox("orange", group, false);
		cb3 = new Checkbox("green", group, false);

		////////////// 체크박스 이벤트 처리
		cb1.addItemListener(new Event1());
		cb2.addItemListener(new Event1());
		cb3.addItemListener(new Event1());

		// 메뉴에 메뉴 아이템 붙이기
		mFile.add(miOpen);
		mFile.add(miExit);

		// 메뉴바에 메뉴 붙이기!!
		mb.add(mFile);
		mb.add(mHelp);

		// 프레임에 메뉴바 붙이기!!
		setMenuBar(mb);

		// 프레임에 붙이기
		add(cb1);
		add(cb2);
		add(cb3);

		////////////// 프레임 닫기 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // 프로그램 종료!
			}
		});

		setVisible(true); // 프레임 화면에 보이기
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
		new Test1("이벤트 처리 연습");
	}
}
