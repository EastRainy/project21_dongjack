import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int i, j, n;
		
		System.out.print("값을 입력해주세요 : ");
		n = scanner.nextInt();
		
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	
		scanner.close();

	}
}
