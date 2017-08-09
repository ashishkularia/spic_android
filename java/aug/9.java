import java.util.Scanner;

class SuperKeyword {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.show();
	}
}

class GrandFather {
	void show() {
		System.out.println("GrandFather");
	}
}

class Father extends GrandFather {
	void show() {
		super.show();
		System.out.println("Father");
	}	
}

class Child extends Father {
	void show() {
		System.out.println("Child");
		super.show();
	}	
}

class SuperWithVariables{
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.getData(100,200);
		obj.show();
	}
}

class Demo {
	int i;
	public void show() {
		System.out.println("i is "+i);
	}
}

class Demo1 extends Demo {
	int i,j;
	public void getData(int x, int y) {
		super.i=x;
		i=x+y;
		j=y;
	}
	public void show() {
		super.show();
		System.out.println("i is "+i+" j is "+j);
	}
}

class Interface{
	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		Student obj2 = new Student();
		obj.getData("Ashish",143);
		obj.show();
		obj2.getData("Gunjan",4008);
		obj2.show();
	}
}

interface Teacher {
	void getData(String n, int i);
	void show();
}

class Demo3 implements Teacher {
	String name;
	int tid;
	public void getData(String n, int i) {					// forced to define method as public as public is by default accessifier of methods declared in interface
		name=n;
		tid=i;
	}

	public void show() {
		System.out.println("Name is "+name+"\nId is "+tid);
	}
}

class Student implements Teacher {
	String name;
	int sid;
	public void getData(String n, int i) {					// forced to define method as public as public is by default accessifier of methods declared in interface
		name=n;
		sid=i;
	}

	public void show() {
		System.out.println("Name is "+name+"\nId is "+sid);
	}
}

class Anonymous {
	public static void main(String[] args) {
		Demo4 d = new Demo4() {
			public void show() {
				System.out.println("this is show method of Anonymous Class");
			}
		};
		d.show();
	}
}

interface Demo4 {
	void show();
}