import java.util.Scanner;
class StatementDemo{
	public static void main(String[] args) {
		int a,b,c;	//Declaration Statement
		c=0;		//Assigning Statement
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the values of a and b");	//Simple Statement
		a=obj.nextInt();	//input statement
		b=obj.nextInt();
		c=a+b;		//expression Statement
		System.out.println("Sum is "+c);	//output statement
	}
}

class ConditionalStatements{
	public static void main(String[] args) {
		int unit,dis,price;
		float total;
		price=100;
		System.out.println("Enter the number of units");
		Scanner obj=new Scanner(System.in);
		unit=obj.nextInt();
		if(unit<5000)
		{
			dis=5;
			total=((price*unit)/100)*95;
			System.out.println("Total amount after 5% discount is "+total);
		}
		else{
			dis=10;
			total=((price*unit)/100)*90;
			System.out.println("Total amount after 10% discout is "+total);
		}
	}
}

class IfElseLadderStatement{
	public static void main(String[] args) {
		int dell,hp,tos;
		System.out.println("Enter the MRP of Dell, HP, Toshiba Laptops Respectively");
		Scanner obj=new Scanner(System.in);
		dell=obj.nextInt();
		hp=obj.nextInt();
		tos=obj.nextInt();
		if(dell<hp){
			if(tos<dell){
				System.out.println("Toshiba is cheaper");
			}
			else{
				System.out.println("Dell is Cheaper");
			}
		}
		else{
			if (tos<hp) {
				System.out.println("Toshiba is Cheaper");
			}
			else{
				System.out.println("HP is cheaper");
			}
		}
	}
}