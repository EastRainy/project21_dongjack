
import java.awt.*;
import java.awt.event.*;

public class Login extends Frame {
	Label lid, lpwd;
	TextField tfId, tfPwd;
	Button ok;

	Frame f = this;

	Login(String title) {
		this.setLayout(new FlowLayout());

		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);
		tfId = new TextField(10);
		tfPwd = new TextField(12);
		tfPwd.setEchoChar('*'); // ��й�ȣ ��ȣ
		ok = new Button("OK");

		add(lid);
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(ok);

		ok.addActionListener(new EventLogin());
		tfId.addActionListener(new EventLogin());
		tfPwd.addActionListener(new EventLogin());
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // ȭ�鿡 �ʺ�,���� ������ Screensize�� ����

		this.setBounds((screenSize.width - 400) / 2, (screenSize.height - 100) / 2, 400, 80);
		setVisible(true);
	}

	class EventLogin implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String id = tfId.getText();
			String pw = tfPwd.getText();

			if (id.equals("admin") && pw.equals("admin")) {
				// System.out.println("admin��, Login�Ǿ����ϴ�.");
				new Msg(f, "admin��, Login�Ǿ����ϴ�.");
				dispose(); // �α���â�� ������
			} else {
				// System.out.println("ID Ȥ�� Password�� �ùٸ��� �ʽ��ϴ�.");
				new Msg(f, "ID Ȥ�� Password�� �ùٸ��� �ʽ��ϴ�.");
				tfId.requestFocus(); // ID�� ��Ŀ��
				tfId.selectAll(); // ID ĭ ��ü����
				tfPwd.selectAll();
			}

			if (id.equals("admin") && pw.equals("admin")) {
				System.out.println("admin��, Login�Ǿ����ϴ�.");

			} else if (id.equals("admin2") && pw.equals("admin2")) {
				System.out.println("admin2��, Login�Ǿ����ϴ�.");

			} else {
				System.out.println("ID Ȥ�� Password�� �ùٸ��� �ʽ��ϴ�.");
				tfId.requestFocus(); // ID�� ��Ŀ��
				tfId.selectAll(); // ID ĭ ��ü����
				tfPwd.selectAll();
			}

		}
	}
}
