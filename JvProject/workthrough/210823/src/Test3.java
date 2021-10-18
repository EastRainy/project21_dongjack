import java.awt.*;
import java.awt.event.*;

public class Test3 extends Frame implements MouseMotionListener {
        int x, y;
        
        Test3(String title) {
                super(title);
                setBounds(200, 200, 500, 500);
                
                ////////////// 프레임에서 마우스 이동시 이벤트 처리
                addMouseMotionListener(this);
                
                
                ////////////// 프레임 닫기 이벤트 처리 
                addWindowListener(new WindowAdapter() { 
                        public void windowClosing(WindowEvent arg0) { 
                                System.exit(0); // 프로그램 종료!
                        }
                });
                
                setVisible(true);
        }
        
        // paint() 메소드 자동호출 상황
        // 1. 처음 화면 나타날 때
        // 2. 다른 화면에 가려졌다가 다시 나타날 때
        // 3. 아이콘화 되었다가 다시 나타날 때
        public void paint(Graphics g) { // 오버라이딩  
                g.drawString("마우스를 움직여보세요", 10, 50);
                g.drawString("*", x, y);
        }
        
        public void update(Graphics g) { // 오버라이딩
                paint(g);
        }
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                
                repaint(); // update() -> paint()
                // repaint(): update() 메소드를 호출함!
                // update(): clearRect()로 화면을 지우고 -> paint()
        }
        
        public static void main(String[] args) {
                new Test3("그래픽 연습");
        }
}





