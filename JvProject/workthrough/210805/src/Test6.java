import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		int n, ans, count = 0;

		Scanner sc = new Scanner(System.in);

		ans = (int) (Math.random() * 100) + 1;

		for (int i = 0; i < 5; i++) {

			System.out.println((i + 1) + "��° �õ��Դϴ�.");

			n = sc.nextInt();

			if (n > ans) {
				System.out.println("���亸�� Ů�ϴ�.");
			} else if (n < ans) {
				System.out.println("���亸�� �۽��ϴ�.");
			} else {
				System.out.println("�����Դϴ�! " + (i + 1) + "�� ���� ���߼̽��ϴ�!");
				count = 1;
				break;
			}

		}

		sc.close();

		if (count == 0) {
			System.out.println("��ȸ�� �� ����ϼ̽��ϴ�. ������ " + ans + " �Դϴ�.");
			return;
		} else {
			return;
		}

	}
}
