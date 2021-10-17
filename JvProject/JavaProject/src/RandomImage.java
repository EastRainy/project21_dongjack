import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomImage extends Frame {

	Canvas c1;
	Image img;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Button b1;
	int i=1;
	Random rand = new Random();

	RandomImage(String title) {
		super(title);
		setLayout(null);

		// 프레임 중앙에 위치시키기
		
		Dimension screenSize = tk.getScreenSize(); // 화면의 너비와 높이를 구하기 위해!!
		setBounds(screenSize.width / 2 - 200, screenSize.height / 2 - 225, 400, 450);
		
		img = tk.getImage("images/randImg/r"+i+".png");
		

		c1 = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		c1.setBounds(50, 50, 300, 300);
		c1.setBackground(Color.yellow);
		

		////////////// 프레임 닫기 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // 프로그램 종료!
			}
		});
		
		b1 = new Button("랜덤 이미지");
		b1.setBounds(50, 360, 300, 50);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				i = rand.nextInt(5)+1;
				img = tk.getImage("images/randImg/r"+i+".png");//몇개없으면 배열접근으로 오버헤드 낮추기 가능
				c1.repaint();
			}
		});
		
		add(c1); add(b1);
		setVisible(true);
		
		repaint();
		
	}
	public static void main(String[] args) {
		new RandomImage("랜덤 이미지 프로그램");
	}
}
