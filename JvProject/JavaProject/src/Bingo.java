import java.awt.*;
import java.awt.event.*;

public class Bingo extends Frame {
	
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	boolean[] stateButtons = { false, false, false, false, false, false, false, false, false }; // 기본값 false
	int count=0;
	Panel p1, p2;
	Label l1;

	Bingo(String title) {
		super(title);
		setLayout(new BorderLayout()); 
		p1 = new Panel();
		p1.setLayout(new GridLayout(3, 3));
		p1.setSize(300,300);
		

		// 프레임 중앙에 위치시키기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 화면의 너비와 높이를 구하기 위해!!
		setBounds(screenSize.width / 2 - 150, screenSize.height / 2 - 150, 300, 400);

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

		// 9개 버튼 이벤트 처리 부분
		b1.addActionListener(new EventBingo());
		b2.addActionListener(new EventBingo());
		b3.addActionListener(new EventBingo());
		b4.addActionListener(new EventBingo());
		b5.addActionListener(new EventBingo());
		b6.addActionListener(new EventBingo());
		b7.addActionListener(new EventBingo());
		b8.addActionListener(new EventBingo());
		b9.addActionListener(new EventBingo());

		// 프레임에 붙이기
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		

		
		l1 = new Label("빙고 게임 시작",Label.CENTER);
		l1.setBackground(Color.gray);
		l1.setSize(300, 50);
		
		
		
		this.add(p1,BorderLayout.CENTER);
		this.add(l1,BorderLayout.SOUTH);

		////////////// 프레임 닫기 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				dispose();; // 프로세스 종료!
			}
		});

		setVisible(true);
	}

	class EventBingo implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Button b = (Button) arg0.getSource();

			// 버튼 누르면 orange로 변경! 다시 버튼 누르면 white로 변경!
			if (b.getBackground() == Color.WHITE) {
				b.setBackground(Color.ORANGE);
			} else {
				b.setBackground(Color.WHITE);
			}

			// 각 버튼 눌렀을 때 각 버튼의 상태 체크 (true or false)
			if (b.getLabel() == "1") {
				if (stateButtons[0] == false) { // 1번 버튼 이전 상태가 false 였으면 true로 변경
					stateButtons[0] = true;
					count++;
				} else {
					stateButtons[0] = false;
					count--;
				}
			} else if (b.getLabel() == "2") {
				if (stateButtons[1] == false) {
					stateButtons[1] = true;
					count++;
				} else {
					stateButtons[1] = false;
					count--;
				}
			} else if (b.getLabel() == "3") {
				if (stateButtons[2] == false) {
					stateButtons[2] = true;
					count++;
				} else {
					stateButtons[2] = false;
					count--;
				}
			} else if (b.getLabel() == "4") {
				if (stateButtons[3] == false) {
					stateButtons[3] = true;
					count++;
				} else {
					stateButtons[3] = false;
					count--;
				}
			} else if (b.getLabel() == "5") {
				if (stateButtons[4] == false) {
					stateButtons[4] = true;
					count++;
				} else {
					stateButtons[4] = false;
					count--;
				}
			} else if (b.getLabel() == "6") {
				if (stateButtons[5] == false) {
					stateButtons[5] = true;
					count++;
				} else {
					stateButtons[5] = false;
					count--;
				}
			} else if (b.getLabel() == "7") {
				if (stateButtons[6] == false) {
					stateButtons[6] = true;
					count++;
				} else {
					stateButtons[6] = false;
					count--;
				}
			} else if (b.getLabel() == "8") {
				if (stateButtons[7] == false) {
					stateButtons[7] = true;
					count++;
				} else {
					stateButtons[7] = false;
					count--;
				}
			} else if (b.getLabel() == "9") {
				if (stateButtons[8] == false) {
					stateButtons[8] = true;
					count++;
				} else {
					stateButtons[8] = false;
					count--;
				}
			}
			
			if(stateButtons[0]&&stateButtons[1]&&stateButtons[2]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[0]&&stateButtons[3]&&stateButtons[6]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[0]&&stateButtons[4]&&stateButtons[8]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[1]&&stateButtons[4]&&stateButtons[7]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[2]&&stateButtons[5]&&stateButtons[8]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[2]&&stateButtons[4]&&stateButtons[6]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[3]&&stateButtons[4]&&stateButtons[5]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
			if(stateButtons[6]&&stateButtons[7]&&stateButtons[8]&&count==3) {
				l1.setText("Bingo!");
				repaint();
			}
				

		}
	}
}
