import java.util.Scanner;

class Animal{
	String name;
	double height;
	int weight;
	int rate;
	
	void show() {
		System.out.println("名字:"+name);
		System.out.println("身高"+height);
		System.out.println("體重"+weight);
		System.out.println("速度"+rate);

	}
	
	double distance(int x,double y) {
		return x*y*rate;
	}
	double distance(int x) {
		return x*rate;
	}
}
public class A1113319_0324_01 {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[4];
		
		for (int i = 0; i < animal.length; i++) {
            animal[i] = new Animal();
        }
		
		animal[0].name="雪寶";
		animal[0].height=1.1;
		animal[0].weight=52;
		animal[0].rate=100;
		
		animal[1].name="驢子";
		animal[1].height=1.5;
		animal[1].weight=99;
		animal[1].rate=200;
		
		animal[2].name="安娜";
		animal[2].height=1.7;
		animal[2].weight=48;
		animal[2].rate=120;
		
		animal[3].name="愛沙";
		animal[3].height=1.7;
		animal[3].weight=50;
		animal[3].rate=120;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<animal.length;i++) {
			animal[i].show();
			System.out.println("請輸入"+animal[i].name+"的時間x");
			int x = scanner.nextInt();
			animal[i].distance(x);
			System.out.println("是否需要輸入加速度y?(1.繼續輸入 其他數字.不輸入)");
			
			int check = scanner.nextInt();
			if(check==1) {
				System.out.println("請輸入加速度y");
				double y = scanner.nextDouble();
				System.out.println(animal[i].name+"的距離是"+animal[i].distance(x,y));
			
			}else {
				System.out.println(animal[i].name+"的距離是"+animal[i].distance(x));
				continue;
			}
			
		}
		
		

	}

}
