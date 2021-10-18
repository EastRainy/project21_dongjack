import java.awt.*;

public class Test1 {

	public static void main(String[] args) {
		Frame f = new Frame("AWT 연습중");

		f.setLayout(new FlowLayout());
		f.setLocation(100, 200);
		f.setSize(400, 300);
		f.setBackground(new Color(230, 210, 120));

		Label l1 = new Label("1.당신의 관심 분야는?");

		Checkbox ch1 = new Checkbox("news", true);
		Checkbox ch2 = new Checkbox("sports");
		Checkbox ch3 = new Checkbox("movies");
		Checkbox ch4 = new Checkbox("music");

		CheckboxGroup chg1 = new CheckboxGroup();

		Label l2 = new Label("2. 얼마나 자주 극장에 가십니까?");

		Checkbox chb1 = new Checkbox("한달에 한번", chg1, true);
		Checkbox chb2 = new Checkbox("일주일에 한번", chg1, false);
		Checkbox chb3 = new Checkbox("일주일에 두번", chg1, false);
		
		Label l3 = new Label("3. 얼마나 자주 컴퓨터를 사용하십니까?");
		CheckboxGroup chg2 = new CheckboxGroup();

		Checkbox chc1 = new Checkbox("5시간", chg2, true);
		Checkbox chc2 = new Checkbox("10시간", chg2, false);
		Checkbox chc3 = new Checkbox("15시간", chg2, false);

		f.add(l1);
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.add(ch4);

		f.add(l2);
		f.add(chb1);
		f.add(chb2);
		f.add(chb3);
		
		f.add(l3);
		f.add(chc1);
		f.add(chc2);
		f.add(chc3);

		f.setVisible(true);

	}

}
