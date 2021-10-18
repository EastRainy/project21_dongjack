
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Test4 extends Frame {

	Button b1, b2, b3, b4, b5;

	Test4(String title) {
		super(title);
		this.setBounds(100, 100, 400, 500);
		this.setLayout(null);

		b1 = new Button("1");
		b1.setBounds(50, 50, 100, 100);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);

			}
		});

		b2 = new Button("2");
		b2.setBounds(200, 50, 100, 100);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.red);

			}
		});

		b3 = new Button("3");
		b3.setBounds(50, 200, 100, 100);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.magenta);

			}
		});

		b4 = new Button("4");
		b4.setBounds(200, 200, 100, 100);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.black);

			}
		});

		b5 = new Button("5");
		b5.setBounds(50, 350, 250, 100);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Random random = new Random();
				Button[] ba = new Button[] {b1,b2,b3,b4}; 
				
				int i = random.nextInt(4);
			
				
			}
		});

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new Test4("Å×½ºÆ®");
	}
}
