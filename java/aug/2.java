import java.util.Scanner;

class ClassDemo{
	public static void main(String[] args) {
		Person.getData(22,"Ashish");
		Person.show();
		Person2 obj = new Person2();
		obj.getData(22,"Gunjan");
		obj.show();
		Emp obj2=new Emp();
		obj2.getData("Ashish",22);
		obj2.show();
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		double gross = obj2.cal_gross(salary);
	}
}
/*	Declare each data member with private access specifier so that the scope of that variable is within the class
	We use member function as static so that we can call that function with the help of className instead of using the object
	Scope of parameter is within the member function
	Note: All data members of static function should be static
*/
class Person{
	private static int age;
	private static String name;
	public static void getData(int a,String n){
		age=a;
		name=n;
	}
	public static void show(){
		System.out.println("Name is "+name+"\nAge is "+age);
	}
}

class Person2{
	private int age;
	private String name;
	public void getData(int a,String n){
		age=a;
		name=n;
	}
	public void show(){
		System.out.println("Name is "+name+"\nAge is "+age);
	}
}

class Emp{
	private String name;
	private int id;
	public void getData(String n, int i) {
		name=n;
		id=i;
	}
	public void show() {
		System.out.println("Name is "+name+"\nId is "+id);
	}
	public double calHra(int basic) {
		double hra=basic*60/100;
		return hra;
	}
	public double calDa(int basic) {
		double da=basic*40/100;
		return da;
	}
	public double calCca(int basic) {
		double cca=basic*20/100;
		return cca;
	}
	public double cal_gross(int basic){
		double hra=calHra(basic);
		double da=calDa(basic);
		double cca=calCca(basic);
		double gross=hra+da+cca;
		return gross;
	}
}
