
import java.awt.*;
import java.awt.event.*;

public class Test4 extends Frame {
	Image img;

	Test4(String title) {

		super(title);

		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("images/java.jpg");

		this.setBounds(200, 200, 600, 400);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0); // ���α׷� ����!
			}
		});

		setVisible(true);

	}

	public void paint(Graphics g) {

		int imgWidth, imgHeight;

		if (img == null) {
			return;
		}
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);

		g.drawImage(img, (getWidth() - imgWidth) / 2, (getHeight() - imgHeight) / 2, this);

	}

	public static void main(String[] args) {

		new Test4("�̹��� �ֱ�");
	}

}
