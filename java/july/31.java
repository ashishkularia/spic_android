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