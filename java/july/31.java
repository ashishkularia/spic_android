import java.util.Scanner;

class IfElseLadder{
	public static void main(String[] args) {
		int price;
		double total=0.0, dis=0.0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the amount");
		price = obj.nextInt();
		if(price>50000){
			dis=(price*50)/100;
		}
		else if(40000<price && price<=50000){
			dis=(price*30)/100;
		}
		else if(30000<price && price<=40000){
			dis=(price*25)/100;
		}
		else if(20000<price && price<=30000){
			dis=(price*20)/100;
		}
		else{
			dis=(price*10)/100;
		}
		System.out.println("Discount : "+ dis);
		total=price-dis;
		System.out.println("Amount to Pay : " + total);
	}
}

class SwitchStatement{
	public static void main(String[] args) {
		int num1, num2, num3=0;
		String oper;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		num1=obj.nextInt();
		num2=obj.nextInt();
		System.out.println("Enter Operator");
		oper=obj.next();
		switch (oper){
			case "+":
				num3=num1+num2;
				System.out.println("Result : "+num3);
				break;
			case "*":
				num3=num1*num2;
				System.out.println("Result : "+num3);
				break;
			case "/":
				num3=num1/num2;
				System.out.println("Result : "+num3);
				break;
			case "-":
				num3=num1-num2;
				System.out.println("Result : "+num3);
				break;
			default :
				System.out.println("Invalid Operator");
		}
	}
}

class NestedSwitchStatement{
	switch (expression){
		case 1:
			break;
		case 2:
			switch (expression) {
				case 1:
					break;
				case 2:
					break;
				default:
			}
			break;
		case 3:
			break;
		default:
	}
}