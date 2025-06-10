package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean tf;
		
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		str = null;
	    tf = false;
	    
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		tf = true;
		
		System.out.println(b + s + i + l);
		System.out.println(f + d);
		System.out.println(c + " " +  str +  " "  + tf);
		System.out .println(b + s + i + l + f + d);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		String name;
		int age;
		double height;
		double weight;
		String food;
		
		name = "山田太郎";
		age = 18;
		height = 170.5;
		weight = 62.2;
		food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		int BMI;
		BMI = (int)(weight / ((height / s ) * (height / s)));
		
				
		System.out.println("BMIは" + BMI + "です");
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		double BMI_sf;
		BMI_sf = weight / ((height / s ) * (height / s));
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は"  + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は"+ weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", BMI_sf) + "です");
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は"  +(age + age)+ "歳です");
		System.out.println("身長は" + (height + height) + "cmです");
		System.out.println("体重は"+ (weight + weight) + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		double BMI_half;
		BMI_half = (weight / ((height / s ) * (height / s))) / 2;
		System.out.println("BMIは" + String.format("%.2f", BMI_half) + "です");
		
		System.out.println(age >= 25);
		age = 25;
		System.out.println(age >= 25);
		age = 24;//値を戻した
		
		String strval = String.valueOf(age);
		String strval2 = String.valueOf(height);
		String strval3 = String.valueOf(weight);
		System.out.println("年齢は"  + strval + "歳です" + "身長は" + strval2 + "cmです" +"体重は"+ strval3 + "kgです");
		
		Integer intpar = Integer.valueOf(strval);
		System.out.println("年齢は"  + intpar + "歳です");		
		double dpar = Double.parseDouble(strval2);
		System.out.println("身長は" + dpar + "cmです");
		
		System.out.println(intpar >=25 || dpar >=160);
		
		

	}

}
