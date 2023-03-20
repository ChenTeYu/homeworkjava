import java.util.Scanner;

public class A1113319_0317_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入正整數n");
		int n = scanner.nextInt();
		System.out.println("請輸入正整數m");
		int m = scanner.nextInt();

		int a[][] = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=(i+1)*(j+1);
			}
		}
		
		for(int[] row : a){
			for(int value : row){
				System.out.print(value+" ");
			}
				System.out.println();
		}
	}
}

		


		
