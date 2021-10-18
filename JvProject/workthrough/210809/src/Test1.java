
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("종료 범위를 입력해주세요 : ");
		int end = scanner.nextInt();
		
		for(int i=1;i<=end;i++) {
			
			
			if(i==1||i%2==0)
				ans = ans+i;
			else
				ans = ans-i;
			
			
			if(i!=end)
				if(i%2==0)
					System.out.print(i+" - ");
				else
					System.out.print(i+" + ");
			else
				System.out.print(i);
		}
		
		System.out.print(" = "+ans);
		
		scanner.close();
		
	}

}
