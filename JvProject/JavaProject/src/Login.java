
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
		tfPwd.setEchoChar('*'); // 비밀번호 보호
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
		Dimension screenSize = tk.getScreenSize(); // 화면에 너비,높이 정보를 Screensize에 대입

		this.setBounds((screenSize.width - 400) / 2, (screenSize.height - 100) / 2, 400, 80);
		setVisible(true);
	}

	class EventLogin implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String id = tfId.getText();
			String pw = tfPwd.getText();

			if (id.equals("admin") && pw.equals("admin")) {
				// System.out.println("admin님, Login되었습니다.");
				new Msg(f, "admin님, Login되었습니다.");
				dispose(); // 로그인창의 디스포즈
			} else {
				// System.out.println("ID 혹은 Password가 올바르지 않습니다.");
				new Msg(f, "ID 혹은 Password가 올바르지 않습니다.");
				tfId.requestFocus(); // ID에 포커스
				tfId.selectAll(); // ID 칸 전체선택
				tfPwd.selectAll();
			}

			if (id.equals("admin") && pw.equals("admin")) {
				System.out.println("admin님, Login되었습니다.");

			} else if (id.equals("admin2") && pw.equals("admin2")) {
				System.out.println("admin2님, Login되었습니다.");

			} else {
				System.out.println("ID 혹은 Password가 올바르지 않습니다.");
				tfId.requestFocus(); // ID에 포커스
				tfId.selectAll(); // ID 칸 전체선택
				tfPwd.selectAll();
			}

		}
	}
}
