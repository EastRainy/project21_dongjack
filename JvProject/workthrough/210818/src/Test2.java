
import java.awt.*;
import java.awt.event.*;



public class Test2 extends Frame {

	public Test2(String title) {

		super(title);

		this.setBounds(100, 100, 500, 400);
		this.setBackground(Color.orange);
		
		this.addWindowListener(new Event1());
		
		
		setVisible(true);
	}

	public static void main(String[] args) {

		Test2 t = new Test2("닫기 이벤트 처리");
		
		
	}
}
class Event1 implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}