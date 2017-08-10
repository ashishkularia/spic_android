class MultipleInherritance {
	public static void main(String[] args) {
		Company obj = new DemoCompany();
		Emp obj2 = new DemoCompany();
		obj.getName("Spic");
		obj2.getDetail("Ashish",143);
		obj.show();
		obj2.showDetails();
	}
}

interface Company {
	void getName(String n);
	void show();
}

interface Emp extends Company {
	void getDetail(String n, int id);
	void showDetails();
}

class DemoCompany implements Company, Emp {
	String cname, ename;
	int empid;
	public void getName(String n) {
		cname = n;
	}
	public void getDetail(String n, int id) {
		ename = n;
		empid = id;
	}
	public void show() {
		System.out.println("Name of the Company : "+cname);
	}
	public void showDetails() {
		System.out.println("Emp Name : "+ename+" Emp id : "+empid);
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		Rect obj2 = new Rect();
		obj2.getData (30,30);
		obj2.area();
		obj2.cirarea();
		obj2.show();
	}
}

abstract class Shape {
	int len, wid, rad;
	void getData(int l, int w) {
		len = l;
		wid = w;
	}
	public Shape(int r) {
		rad = r;
	}
	abstract void show();
}

class Rect extends Shape {
	int area;
	double cirarea;
	public Rect () {
		super(20);
	}
	void area(){
		area = len*wid;
	}
	void cirarea(){
		cirarea = rad*rad*3.14;
	}
	void show() {
		System.out.println("Rect Area Is "+area);
		System.out.println("Circle Area is "+cirarea);
	}
}