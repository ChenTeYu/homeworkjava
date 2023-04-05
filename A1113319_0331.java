import java.util.Scanner;

class Animal {
	String name;
	double height;
	int weight;
	int rate;
	
	public Animal(String name,double height,int weight,int rate) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.rate=rate;
		
	}
	
	void show() {
		System.out.println("\n姓名:"+name);
		System.out.println("身高:"+height);
		System.out.println("體重:"+weight);
		System.out.println("速度:"+rate);

	}
	
	double distance(int x,double y) {
		return (x*y*this.rate);
	}
	
	double distance(int x) {
		return (x*this.rate);
	}

	static void showinfo() {
		System.out.println("歡迎進入冰雪奇緣系統");
	}
}

class human extends Animal {
	String gender;
	
	public human(String name,double height,int weight,int rate,String gender) {
        super(name, height, weight, rate);
		this.gender=gender;
	}
	
	void show() {
		super.show();
		System.out.println("性別:"+gender);
	}
}


class snow extends human{
	String iceSkill;
	
	public snow(String name,double height,int weight,int rate,String gender,String iceSkill) {
        super(name, height, weight, rate, gender);
        this.iceSkill=iceSkill;
	}
	
	void show() {
		super.show();
		System.out.println("冰雪技能:"+this.iceSkill);
	}
	
	double distance(int x,double y) {
		return (2*x*y*this.rate);
	}
	
	double distance(int x) {
		return (2*x*this.rate);
	}

}

public class A1113319_0331 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Animal.showinfo();

		Animal 雪寶 = new Animal("雪寶",1.1,52,100);
		Animal 驢子 = new Animal("驢子",1.5,99,200);

		human 阿克 = new human("阿克",1.9,80,150,"男");
		human 漢斯 = new human("漢斯",1.8,78,130,"男");
		human 安娜 = new human("安娜",1.7,48,120,"女");
		
		snow 愛沙 = new snow("愛沙",1.7,50,120,"女","Yes");
		
		雪寶.show();
		驢子.show();
		阿克.show();
		漢斯.show();
		安娜.show();
		愛沙.show();
		
		System.out.println("\n請輸入雪寶的x時間");
		int x = scanner.nextInt();
		System.out.println("請輸入雪寶的y加速度(無則輸入0)");
		int y = scanner.nextInt();
		if(y==0) {
			System.out.println("雪寶距離:"+雪寶.distance(x));
		}else {
			System.out.println("雪寶距離:"+雪寶.distance(x,y));

		}
		
		System.out.println("\n請輸入驢子的x時間");
		x = scanner.nextInt();
		System.out.println("請輸入驢子的y加速度(無則輸入0)");
		y = scanner.nextInt();
		if(y==0) {
			System.out.println("驢子距離:"+驢子.distance(x));
		}else {
			System.out.println("驢子距離:"+驢子.distance(x,y));

		}
		
		System.out.println("\n請輸入阿克的x時間");
		x = scanner.nextInt();
		System.out.println("請輸入阿克的y加速度(無則輸入0)");
		y = scanner.nextInt();
		if(y==0) {
			System.out.println("阿克距離:"+阿克.distance(x));
		}else {
			System.out.println("阿克距離:"+阿克.distance(x,y));
		}
		
		System.out.println("\n請輸入漢斯的x時間");
		x = scanner.nextInt();
		System.out.println("請輸入漢斯的y加速度(無則輸入0)");
		y = scanner.nextInt();
		if(y==0) {
			System.out.println("漢斯距離:"+漢斯.distance(x));
		}else {
			System.out.println("漢斯距離:"+漢斯.distance(x,y));
		}
		
		System.out.println("\n請輸入安娜的x時間");
		x = scanner.nextInt();
		System.out.println("請輸入安娜的y加速度(無則輸入0)");
		y = scanner.nextInt();
		if(y==0) {
			System.out.println("安娜距離:"+安娜.distance(x));
		}else {
			System.out.println("安娜距離:"+安娜.distance(x,y));
		}
		
		System.out.println("\n請輸入愛沙的x時間");
		x = scanner.nextInt();
		System.out.println("請輸入愛沙的y加速度(無則輸入0)");
		y = scanner.nextInt();
		if(y==0) {
			System.out.println("愛沙距離:"+愛沙.distance(x));
		}else {
			System.out.println("愛沙距離:"+愛沙.distance(x,y));
		}
		
		scanner.close();
	}

}
