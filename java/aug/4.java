import java.util.Scanner;

class ThisDemo{
	public static void main(String[] args) {
		Dept d = new Dept();
		d.getData("admin",22);
		d.show();
		d.showThis();
		Emp e = new Emp();
		e.getDept(d);
		e.show();
		d.empDept();
		ClassDemo cd=new ClassDemo();
		ClassDemo.InnerClass cdi=cd.new InnerClass();
		ClassDemo.NestedClass cdn= new ClassDemo.NestedClass();
		cdi.getData("ClassDemo.InnerClass");
		cdi.show();
		cdn.getData("ClassDemo.NestedClass");
		cdn.show();
	}
}

class Emp{
	String empName;
	int empId;
	public void show() {
		System.out.println("Name is"+empName+"\nId is "+empId);
	}
	public void getDept(Dept d){
		System.out.println("Dept Name is "+d.dname+"\nDept Id is : "+d.did);
	}
}

class Dept {
	String dname;
	int did;
	public void getData(String n, int d) 	{
		dname=n;
		did=d;
	}
	public void getData(Dept d) 	{
		dname=d.dname;
		did=d.did;
	}
	public void show() {
		System.out.println("Dept Name is "+dname+"\nDept Id is " + did);
	}
	public void showThis()	{
		this.getData(this);
		this.show();
	}
	public void empDept ()	{
		Emp e=new Emp();
		e.getDept(this);
	}
}

class ClassDemo{
	String name;
	static String sname;
	class InnerClass{
		public void getData(String n){
			name=n;
		}
		public void show(){
			System.out.println("Name is " + name);
		}
	}

	static class NestedClass{
		public void getData(String n) {
			sname=n;
		}
		public void show(){
			System.out.println("Name is "+sname);
		}
	}
}