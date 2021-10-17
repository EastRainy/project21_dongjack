
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import myPackage.JsonMain;

public class MenuStart extends Frame {
	int fWidth, fHeight;

	MenuStart(String title) {

		super(title);
		this.setResizable(false);

		// 프레임 중앙에 위치시키기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		fWidth = 550;// screenSize.width / 2;
		fHeight = 600;// screenSize.height / 2;

		setBounds(screenSize.width / 2 - (fWidth / 2), screenSize.height / 2 - (fHeight / 2), fWidth, fHeight);

		// 프레임 아이콘 설정
		this.setIconImage(new ImageIcon("images/icon.png").getImage());

		// 메뉴 설정

		MenuBar mb = new MenuBar();

		Menu mFile = new Menu("File");
		MenuItem miJoin = new MenuItem("Join", new MenuShortcut('J', true));
		MenuItem miExit = new MenuItem("Exit", new MenuShortcut('E'));

		miExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		mFile.add(miJoin);
		mFile.addSeparator();
		mFile.add(miExit);

		Menu mEvent = new Menu("Event1");
		MenuItem miEvent_1 = new MenuItem("BMI");
		miEvent_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new CheckBMI("BMI 프로그램");
			}
		});
		MenuItem miEvent_2 = new MenuItem("Coffee");
		miEvent_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Coffee("Coffee 자판기");
			}
		});
		MenuItem miEvent_3 = new MenuItem("MoneyCount");
		miEvent_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new MoneyCount("돈 계산기");
			}
		});
		MenuItem miEvent_4 = new MenuItem("Bingo Game");
		miEvent_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Bingo("빙고 게임");
			}
		});
		mEvent.add(miEvent_1);
		mEvent.add(miEvent_2);
		mEvent.add(miEvent_3);
		mEvent.add(miEvent_4);

		Menu mEvent2 = new Menu("Event2");
		MenuItem miEvent2_1 = new MenuItem("PaintTool");
		miEvent2_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PaintTool("그림판");

			}
		});
		mEvent2.add(miEvent2_1);
		MenuItem miEvent2_2 = new MenuItem("Christmas");
		miEvent2_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Christmas("Christmas");

			}
		});
		mEvent2.add(miEvent2_2);
		MenuItem miEvent2_3 = new MenuItem("JSON Editor");
		miEvent2_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new JsonMain("JSON Editor");

			}
		});
		mEvent2.add(miEvent2_3);

		Menu mHelp = new Menu("Help");
		MenuItem miHelp = new MenuItem("프로그램 소개");
		miHelp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Help("프로그램 소개");

			}
		});
		mHelp.add(miHelp);

		// 메뉴바에 메뉴 붙이기
		mb.add(mFile);
		mb.add(mEvent);
		mb.add(mEvent2);
		mb.add(mHelp);

		// 프레임에 메뉴 붙이기
		this.setMenuBar(mb);

		// Closing 설정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.setVisible(true);

	}

	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("images/pen.png");

		int imgWidth, imgHeight;

		if (img == null) {
			return;
		}
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);

		g.drawImage(img, (getWidth() - imgWidth) / 2, (getHeight() - imgHeight) / 2, this);

	}

	public static void main(String[] args) {

		new MenuStart("JavaProject");
		new Login("Login");

	}

}
