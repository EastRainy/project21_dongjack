
import java.awt.*;

public class Test2 {

	public static void main(String[] args) {

		
		Font f1 = new Font("SansSerif", Font.ITALIC, 12);
		
		Frame f = new Frame("로그인");
		f.setLayout(null);
		f.setBounds(300, 300, 420, 200);
		f.setBackground(new Color(228,215,255));
		
		Label lid = new Label("ID : ");
		lid.setBounds(50,50,150,40);
		lid.setBackground(Color.white);
		lid.setAlignment(Label.RIGHT);
		lid.setText("아이디 : ");
		lid.setFont(f1);
		
		
		Label lpw = new Label("Password : ", Label.RIGHT);
		
		lpw.setBounds(50,120,150,40);
		lpw.setBackground(Color.white);
		lpw.setFont(f1);
		
		TextField tfid = new TextField(10);
		tfid.setBounds(220, 50, 150, 40);
		
		
		TextField tfpw = new TextField(10);
		tfpw.setBounds(220, 120, 150, 40);
		tfpw.setEchoChar('*');

		
		f.add(lid);f.add(tfid);
		f.add(lpw);f.add(tfpw);
		
		f.setVisible(true);
		
	}

}
