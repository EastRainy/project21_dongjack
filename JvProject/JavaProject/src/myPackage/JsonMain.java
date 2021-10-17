package myPackage;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonMain extends Frame {

	Panel mainP;
	Button b1, b2, b3, b4, b5;
	Label show, l1, l2, l3;
	TextField t1, t2, t3;
	CharactorVO c;
	JSONArray ar;
	List list1;
	ListArrayControl LAC;
	Canvas canv;
	Boolean see = false;

	Toolkit tk = Toolkit.getDefaultToolkit();

	public JsonMain(String title) {

		super(title);

		Dimension screenSize = tk.getScreenSize();
		int uiWidth = 800;
		int uiHeight = 600;

		this.setBounds((screenSize.width - uiWidth) / 2, (screenSize.height - uiHeight) / 2, uiWidth, uiHeight);
		this.setLayout(new BorderLayout());
		this.setResizable(false);

		c = new CharactorVO();

		ar = new JSONArray();
		list1 = new List();
		list1.setSize(100, 600);
		list1.setMultipleMode(false);
		LAC = new ListArrayControl(ar, list1);

		list1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = list1.getSelectedIndex();
				CharactorVO tmp = new CharactorVO(LAC.getJSONIndex(i));
				t1.setText(tmp.getName());
				t2.setText(Integer.toString(tmp.getAge()));
				t3.setText(tmp.getId());

			}
		});

		MenuBar mb = new MenuBar();

		Menu mf = new Menu("File");
		MenuItem mf_o = new MenuItem("Open File");
		mf_o.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str;
				try {
					str = Files.readString(Paths.get("jsons/Input.json"));
				} catch (IOException e1) {

					System.out.println("파일 입출력 오류발생");

					return;
				}
				JSONParser p = new JSONParser();
				JSONObject tmp;
				try {
					tmp = (JSONObject) p.parse(str);
				} catch (ParseException e1) {
					System.out.println("JSON 파싱 오류발생");
					return;
				}
				ar = (JSONArray) tmp.get("Charactors");
				LAC.initSyncList(ar);
				return;

			}
		});
		MenuItem mf_s = new MenuItem("Save File");
		mf_s.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JSONObject tmp = new JSONObject();
				try {
					OutputStream output = new FileOutputStream("jsons/Output.json");
					tmp.put("Charactors", ar);
					String str = tmp.toJSONString();
					byte[] by = str.getBytes();
					output.write(by);

					output.close();

				} catch (Exception e2) {
					System.out.println("파일 입출력 오류발생");
				}

			}
		});

		mf.add(mf_o);
		mf.add(mf_s);

		mb.add(mf);

		this.setMenuBar(mb);

		mainP = new Panel();
		mainP.setBackground(Color.lightGray);
		mainP.setSize(700, 500);
		mainP.setLayout(null);

		l1 = new Label("이름");
		l1.setBounds(50, 100, 50, 25);
		t1 = new TextField("이름을 입력해주세요.", 50);
		t1.setBounds(110, 100, 200, 25);
		t1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

		l2 = new Label("나이");
		l2.setBounds(50, 150, 50, 25);
		t2 = new TextField("0", 50);
		t2.setBounds(110, 150, 200, 25);
		t2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

		l3 = new Label("ID");
		l3.setBounds(50, 200, 50, 25);
		t3 = new TextField("ID를 입력해주세요", 50);
		t3.setBounds(110, 200, 200, 25);
		t3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

		mainP.add(l1);
		mainP.add(t1);
		mainP.add(l2);
		mainP.add(t2);
		mainP.add(l3);
		mainP.add(t3);

		b1 = new Button("미리보기");
		b1.setBounds(250, 450, 100, 50);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					c.setName(t1.getText());
					c.setAge(Integer.parseInt(t2.getText()));
					c.setId(t3.getText());

					show.setText(c.getJSON().toString());

					repaint();
				} catch (NumberFormatException e2) {
					show.setText("입력값이 잘못되었습니다. 나이는 숫자만 가능합니다.");
				}
			}
		});
		b2 = new Button("추가");
		b2.setBounds(50, 450, 50, 50);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					c.setName(t1.getText());
					c.setAge(Integer.parseInt(t2.getText()));
					c.setId(t3.getText());
					LAC.addJSON(c);
					c = new CharactorVO();
					show.setText("삽입성공.");
					return;
				} catch (NumberFormatException e2) {
					show.setText("입력값이 잘못되었습니다. 나이는 숫자만 가능합니다.");
					return;
				}

			}
		});
		b3 = new Button("수정");
		b3.setBounds(100, 450, 50, 50);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					c.setName(t1.getText());
					c.setAge(Integer.parseInt(t2.getText()));
					c.setId(t3.getText());

					LAC.changeJSON(c, list1.getSelectedIndex());
					show.setText("수정성공.");

				} catch (NumberFormatException e2) {
					show.setText("입력값이 잘못되었습니다. 나이는 숫자만 가능합니다.");
				} catch (IndexOutOfBoundsException e3) {
					show.setText("수정을 원하시는 아이템을 선택해주세요.");
				}

			}
		});
		b4 = new Button("삭제");
		b4.setBounds(150, 450, 50, 50);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					LAC.removeJSON(list1.getSelectedIndex());
					repaint();
				} catch (IndexOutOfBoundsException e3) {
					show.setText("삭제을 원하시는 아이템을 선택해주세요.");
				}

			}
		});

		canv = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(tk.getImage("images/fun.png"), 0, 0, this);
			}
		};
		canv.setBounds(500, 350, 100, 100);
		canv.setVisible(see);

		b5 = new Button("Fun");
		b5.setBounds(500, 450, 50, 50);
		b5.setBackground(new Color(244, 251, 185));
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (see == false) {
					see = true;
				} else {
					see = false;
				}
				canv.setVisible(see);

			}
		});

		mainP.add(b1);
		mainP.add(b2);
		mainP.add(b3);
		mainP.add(b4);
		mainP.add(b5);
		mainP.add(canv);

		show = new Label("JSON 결과물이 나타나는 곳입니다.", Label.CENTER);
		show.setSize(600, 100);
		show.setBackground(Color.yellow);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		this.add(list1, BorderLayout.WEST);
		this.add(mainP, BorderLayout.CENTER);
		this.add(show, BorderLayout.SOUTH);

		this.setVisible(true);

	}

}
