
import java.awt.*;

public class Test7 {

	public static void main(String[] args) {
		Frame f = new Frame("�޴��� �ִ� ������");

		f.setLayout(null);
		f.setBounds(100, 100, 500, 400);

		MenuBar mb = new MenuBar();

		Menu m1 = new Menu("����");
		MenuItem mi1 = new MenuItem("����");
		Menu m1_1 = new Menu("����");
		MenuItem mi3 = new MenuItem("�ݱ�");
		
		MenuItem mi2_1 = new MenuItem("�����ϱ�");
		MenuItem mi2_2 = new MenuItem("�ٸ��̸����� ����");
		
		m1_1.add(mi2_1);
		m1_1.add(mi2_2);
		
		
		m1.add(mi1);m1.add(m1_1);
		m1.addSeparator();//���м� �߰�
		m1.add(mi3);

		Menu m2 = new Menu("����");
		Menu m3 = new Menu("������");
		Menu m4 = new Menu("����");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);

		f.setMenuBar(mb);

		f.setVisible(true);
	}

}
