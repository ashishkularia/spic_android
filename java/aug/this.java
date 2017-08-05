import java.util.Scanner;
class MainDemo
{
public static void main(String[]args)
{
Demo d3=new Demo(7656756.87,986678.87);


}
}
class Demo
{
	String name,address;
	int id,age;
	double salary,bonus;
	public Demo(String n, String a)
	{
		name=n;
		address=a;
System.out.println("Name is"+name+"address is"+address);
	}
	public Demo(int i,int a)
	{
		this("amir","edc employee");
		id=i;
		age=a;
		System.out.println("id is"+id+"age is"+age);
	}
	public Demo(double s,double b)
	{
		this(1001,24);
		salary=s;
		bonus=b;
		System.out.println("salary is"+salary+"bonus is"+bonus);
	}
		}




class Cons
{
	public static void main(String[]args)
	{
		D1 d3=new D1();
		d3.getData("amir",1001);
		d3.show();
	}
}
	class D1
	{
		int id;
		String name;
		public void getData(String name,int id)
		{
			this.id=id;
			this.name=name;
		}
		public void show()
		{
			System.out.println("name is "+name+"id is"+id);
		}
	}
	
	
	
	
	
	
	
	
	



class Cons1
{
	public static void main(String[]args)
	{
		D11 d3=new D11();
		d3.getData("amir",1001);
	}
}
	class D11
	{
		int id;
		String name;
		public void getData(String n,int i)
		{
			id=i;
			name=n;
			this.show();
		}
		public void show()
		{
			System.out.println("name is "+name+"id is"+id);
		}
	}














































