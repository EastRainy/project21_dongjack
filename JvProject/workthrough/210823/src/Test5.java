
import java.awt.*;
import java.awt.event.*;

public class Test5 extends Frame implements MouseMotionListener {
	int x, y;
	Image img = null;
	Graphics gImg = null;

	Test5(String title) {
		super(title);
		setBounds(200, 200, 500, 500);

		addMouseMotionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		setVisible(true);

		img = createImage(500, 400);
		gImg = img.getGraphics();// �̹����� �׷��� ��ü�� ������
		gImg.drawString("���� ��ư�� ���� ä�� ���콺�� ������������.", 10, 50);
		repaint();

	}

	@Override
	public void paint(Graphics g) {
		if (img != null) {
			g.drawImage(img, 0, 0, this);
		}
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	public void mouseDragged(MouseEvent e) {

		if (e.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK) {
			return;
		}
		gImg.drawLine(x, y, e.getX(), e.getY());

		x = e.getX();
		y = e.getY();

		repaint();

	}

	public void mouseMoved(MouseEvent e) {

		x = e.getX();
		y = e.getY();

	}

	public static void main(String[] args) {
		new Test5("�׷��� ����");
	}
}
