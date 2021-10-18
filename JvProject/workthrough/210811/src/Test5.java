
public class Test5 {

	public static void main(String[] args) {

		char i, j;

		for (i = 'a'; i <= 'z'; i++) {

			for (j = 'a'; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= 'z'; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

	}
}
