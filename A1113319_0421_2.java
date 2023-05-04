import java.util.Scanner;
public class A1113319_0421_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年月日YYYY/MM/DD,或MM/DD/YYYY");
		String userInput;
		userInput = sc.next();
		if(userInput.matches("\\d{4}/\\d{2}/\\d{2}")){
			System.out.println(userInput.substring(0,4)+"年"
					+userInput.substring(5,7)+"月"
					+userInput.substring(8,10)+"日");
		}else if(userInput.matches("\\d{2}/\\d{2}/\\d{4}")){
			System.out.println(userInput.substring(6,10)+"年"
					+userInput.substring(0,2)+"月"
					+userInput.substring(3,5)+"日");
		}else {
			System.out.println("格式錯誤");
		}

		sc.close();
	}

}
