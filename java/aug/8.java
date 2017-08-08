import java.util.Scanner;

class Polymorphism{
	public static void main(String[] args) {
		Shape obj = new Shape();
		obj.getData(10);
		obj.getData(10,20);
		obj.getData(10,20,30);
		obj.area();
		obj.rectarea();
		obj.volume();
		
		Emp obj2 = new Emp();
		obj2.getData(22,143);
		obj2.show();
	}
}

class Shape {
	private int rad;
	private int len, wid, hgt;
	final double PI=3.14;
	public void getData(int r) {
		rad=r;
	}
	public void getData(int l, int w) {
		len=l;
		wid=w;
	}
	public void getData(int l, int w, int h) {
		len=l;
		wid=w;
		hgt=h;
	}

	public void area() {
		double ar=PI*rad*rad;
		System.out.println("Area of Circle is "+ar);
	}

	public void rectarea() {
		double ar=len*wid;
		System.out.println("Area of Rect is "+ar);
	}

	public void volume() {
		double vol=len*wid*hgt;
		System.out.println("Volume of Rect is "+vol);
	}
}

class Emp {
	private String name, address;
	private int age, empid;
	private double salary, bonus;
	public void getData(String n, String a) {
		name=n;
		address=a;
	}

	public void getData(int a, int i) {
		this.getData(50000,2500.24);
		age=a;
		empid=i;
	}

	public void getData(double s, double b) {
		this.getData("Ashish", "Spic");
		salary = s;
		bonus = b;
	}

	public void show() {
		System.out.println("Name is "+name+"\nAddress is "+address+"\nAge : "+age+"\nID : "+empid+"\nsalary : "+salary+"\nBonus : "+bonus);
	}
}

class Inherritance {
	public static void main(String[] args) {
		Child obj = new Child();
		Son obj1 = new Son();
		obj1.getData("Rajesh");
		obj1.getData("Ashish",22);		
		obj1.show();
	}
}
class Base {
	String name;

	public Base() {
		System.out.println("Base Class");
	}

	public Base(String n) {
		name = n;
		System.out.println("Base class parameterized constructor "+name);
	}

}

class Child extends Base {
	public Child() {
		super("Ashish");
		System.out.println("Child Class");
	}
}

class Father {
	String name;
	public void getData(String name) {
		this.name=name;
	}
	public void show() {
		System.out.println("Father Name is "+name);
	}
}

class Son extends Father {
	int age;
	public void getData(String n, int a) {
		super.show();							//function overriding
		this.name=n;
		age=a;
	}

	public void show() {
		System.out.println("Child name is "+name+"\nAge is "+age);
	}
}