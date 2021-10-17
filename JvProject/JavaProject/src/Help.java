
import java.awt.*;
import java.awt.event.*;


public class Help extends Frame {

	Help(String title){
		
		super(title);
		this.setLayout(null);
	
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds(screenSize.width/2-250,screenSize.height/2-250,500,500);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		
		});
		
		Label l1 = new Label("개발자 : 김 성 빈", Label.CENTER);
		l1.setBounds(170, 400, 150, 25);
		
		Label l2 = new Label("도움주신 분 : 최 유 리",Label.CENTER);
		l2.setBounds(170, 450, 150, 25);
		
		this.add(l1);
		this.add(l2);
		
		
		
		setVisible(true);
		repaint();
		
	}
	
	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("images/icon2.png");
		
		g.drawImage(img,200,200,this);
	}
	
	
}


