import java.util.Scanner;
class Demo
{
public static void main(String[]args)
{

Employee p= new Employee();
Scanner sc = new Scanner(System.in);
p.getData("amir",25);
p.show();
int salary=sc.nextInt();
double gross=p.calgross(salary);
System.out.println("Gross salary"+gross);

}
}
class Employee
{
private int id;
private String name;
public void getData(String n,int i)
{
	id=i; 
	name=n;
}	
	
	public void show()
	{
		System.out.println("Name is"+name+"age"+id);
	}
private double calHra(int basic)
{
	double hra=basic*60/100;
	return hra;
}
	
	private double calda(int basic)
{
	double da=basic*40/100;
	return da;
}
private double calcca(int basic)
{
	double cca=basic*20/100;
	return cca;
	
}
public double calgross(int basic)
{
	double hra=calHra(basic);
	double cca=calcca(basic);
	double da=calHra(basic);
	double gross=basic+hra+cca+da;
	return gross;
}










}

