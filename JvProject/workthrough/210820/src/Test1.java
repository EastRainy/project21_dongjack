import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame {

	Label lid, lpd;
	TextField tfid, tfpw;
	Button ok;

	Test1(String title) {

		super(title);

		this.setLayout(new FlowLayout());
		this.setBounds(200, 200, 500, 100);

		lid = new Label("ID :");
		lpd = new Label("Password");

		tfid = new TextField(10);
		tfpw = new TextField(10);
		tfpw.setEchoChar('*');

		ok = new Button("OK");
		ok.addActionListener(new T1Event());

		add(lid);
		add(tfid);
		add(lpd);
		add(tfpw);
		add(ok);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
	}

	class T1Event implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(tfid.getText());
			System.out.println(tfpw.getText());
		}

	}

	public static void main(String[] args) {

		Test1 t = new Test1("·Î±×ÀÎ");

	}
}
