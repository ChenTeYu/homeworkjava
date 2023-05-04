import java.util.Scanner;

public class A1113319_0421_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入電子郵件");
		String email = sc.next();
		String rule = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		if (email.matches(rule)) {
			System.out.println("正確");
		}else {
			System.out.println("錯誤");
		}
		sc.close();

	}

}
