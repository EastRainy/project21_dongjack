import java.awt.*;
import java.awt.event.*;

public class Test3 extends Frame implements MouseMotionListener {
        int x, y;
        
        Test3(String title) {
                super(title);
                setBounds(200, 200, 500, 500);
                
                ////////////// �����ӿ��� ���콺 �̵��� �̺�Ʈ ó��
                addMouseMotionListener(this);
                
                
                ////////////// ������ �ݱ� �̺�Ʈ ó�� 
                addWindowListener(new WindowAdapter() { 
                        public void windowClosing(WindowEvent arg0) { 
                                System.exit(0); // ���α׷� ����!
                        }
                });
                
                setVisible(true);
        }
        
        // paint() �޼ҵ� �ڵ�ȣ�� ��Ȳ
        // 1. ó�� ȭ�� ��Ÿ�� ��
        // 2. �ٸ� ȭ�鿡 �������ٰ� �ٽ� ��Ÿ�� ��
        // 3. ������ȭ �Ǿ��ٰ� �ٽ� ��Ÿ�� ��
        public void paint(Graphics g) { // �������̵�  
                g.drawString("���콺�� ������������", 10, 50);
                g.drawString("*", x, y);
        }
        
        public void update(Graphics g) { // �������̵�
                paint(g);
        }
        
        public void mouseDragged(MouseEvent e) {}
        
        public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                
                repaint(); // update() -> paint()
                // repaint(): update() �޼ҵ带 ȣ����!
                // update(): clearRect()�� ȭ���� ����� -> paint()
        }
        
        public static void main(String[] args) {
                new Test3("�׷��� ����");
        }
}





