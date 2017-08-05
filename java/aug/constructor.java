import java.util.Scanner;
class MainDemo
{
public static void main(String[]args)
{

Person p=new Person();
p.show();
Person p1=new Person("amir",15);
p1.show();
}
}
class Person
{
String name;
	int age;
	public Person()
	{
		System.out.println("default cons");
	}
	
	public Person(String n,int a)
	{
		name=n;
		age=a;
	}
	public void show()
	{
		System.out.println("name is "+name+"age is"+age);
	}
	
	
	
}
	
	
