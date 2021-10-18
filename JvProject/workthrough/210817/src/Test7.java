
import java.awt.*;

public class Test7 {

	public static void main(String[] args) {
		Frame f = new Frame("메뉴가 있는 프레임");

		f.setLayout(null);
		f.setBounds(100, 100, 500, 400);

		MenuBar mb = new MenuBar();

		Menu m1 = new Menu("파일");
		MenuItem mi1 = new MenuItem("열기");
		Menu m1_1 = new Menu("저장");
		MenuItem mi3 = new MenuItem("닫기");
		
		MenuItem mi2_1 = new MenuItem("저장하기");
		MenuItem mi2_2 = new MenuItem("다른이름으로 저장");
		
		m1_1.add(mi2_1);
		m1_1.add(mi2_2);
		
		
		m1.add(mi1);m1.add(m1_1);
		m1.addSeparator();//구분선 추가
		m1.add(mi3);

		Menu m2 = new Menu("편집");
		Menu m3 = new Menu("윈도우");
		Menu m4 = new Menu("도움말");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);

		f.setMenuBar(mb);

		f.setVisible(true);
	}

}
