import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		int n, ans, count = 0;

		Scanner sc = new Scanner(System.in);

		ans = (int) (Math.random() * 100) + 1;

		for (int i = 0; i < 5; i++) {

			System.out.println((i + 1) + "번째 시도입니다.");

			n = sc.nextInt();

			if (n > ans) {
				System.out.println("정답보다 큽니다.");
			} else if (n < ans) {
				System.out.println("정답보다 작습니다.");
			} else {
				System.out.println("정답입니다! " + (i + 1) + "번 만에 맞추셨습니다!");
				count = 1;
				break;
			}

		}

		sc.close();

		if (count == 0) {
			System.out.println("기회를 다 사용하셨습니다. 정답은 " + ans + " 입니다.");
			return;
		} else {
			return;
		}

	}
}
