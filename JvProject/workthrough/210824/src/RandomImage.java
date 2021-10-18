import java.awt.*;
import java.awt.event.*;

public class RandomImage extends Frame {

	Canvas c1;
	Image img;

	RandomImage(String title) {
		super(title);
		setLayout(null);

		// 프레임 중앙에 위치시키기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // 화면의 너비와 높이를 구하기 위해!!
		setBounds(screenSize.width / 2 - 200, screenSize.height / 2 - 200, 400, 400);

		img = tk.getImage("images/img1.png");

		c1 = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		c1.setBounds(50, 50, 200, 200);
		c1.repaint();

		////////////// 프레임 닫기 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // 프로그램 종료!
			}
		});
		
		add(c1);
		setVisible(true);
		
		repaint();
		
	}

	public static void main(String[] args) {
		new RandomImage("랜덤 이미지 프로그램");
	}
}
