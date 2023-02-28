import java.util.*;

public class A1113319_0224_1{
    public static void main (String [] argv){
        int Number,Calculate;
        System.out.println ("請輸入任意整數");
        Scanner sc = new Scanner(System.in);
        Number = sc.nextInt();
        Calculate = Number % 2;
        if(Calculate == 1){
	        System.out.println ("該數為奇數");
	}else{
		System.out.println ("該數為偶數");
	}    
			
    }
}
