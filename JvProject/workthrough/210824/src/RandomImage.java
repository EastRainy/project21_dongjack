import java.awt.*;
import java.awt.event.*;

public class RandomImage extends Frame {

	Canvas c1;
	Image img;

	RandomImage(String title) {
		super(title);
		setLayout(null);

		// ������ �߾ӿ� ��ġ��Ű��
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // ȭ���� �ʺ�� ���̸� ���ϱ� ����!!
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

		////////////// ������ �ݱ� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // ���α׷� ����!
			}
		});
		
		add(c1);
		setVisible(true);
		
		repaint();
		
	}

	public static void main(String[] args) {
		new RandomImage("���� �̹��� ���α׷�");
	}
}
