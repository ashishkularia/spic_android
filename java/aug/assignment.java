import java.util.Scanner;

class Diamond{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		for (int i=4;i>=0;i--)	{
			System.out.println();
			for (int j=i;j>=0;j--) {
				System.out.print(j+"\t");
			}
			System.out.print("\t");
			for (int k=0;k<=i;k++) {
				System.out.print(k+"\t");
			}
		}
		for (int i=4;i>=0;i--) {
			System.out.println();
			for (int j=4;j>=i;j--) {
				System.out.print(j+"\t");
			}
			for (int k=i;k<=4;k++) {
				System.out.print(k+"\t");
			}			
		}
	}
}

class Assignment_1_10_8_2017 {
	public static void main(String[] args) {
		String plan="";
		int unit;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The units");
		unit = obj.nextInt();
		System.out.println("Enter Type");
		plan = obj.next();
		Bill b = new Bill();
		Plan p = b.getPlan(plan);
		p.getRate();
		p.calBill(unit);
	}
}

abstract class Plan {
	double rate;
	abstract void getRate();
	void calBill(int unit) {
		double bill = rate*unit;
		System.out.println("Your Bill is "+bill);
	}
}

class Domestic extends Plan {
	void getRate() {
		rate = 3.00;
	}
}

class Industrial extends Plan {
	void getRate() {
		rate = 5.00;
	}
}

class Commercial extends Plan {
	void getRate() {
		rate = 6.00;
	}
}

class Bill{
	public Plan getPlan(String type) {
		if(type.equals("Domestic")) {
			return new Domestic();
		}
		if(type.equals("Industrial")) {
			return new Industrial();
		}
		if(type.equals("Commercial")) {
			return new Commercial();
		}
		return null;
	}
}

class Assignment_2_10_8_2017 {
	public static void main(String[] args) {
		String bank = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank, Loan Amount and time Period");
		bank = sc.next();
		double princi = sc.nextDouble();
		double time = sc.nextDouble();
		BankSelector bs = new BankSelector();
		Loan ln = bs.getBank(bank);
		ln.interest();
		ln.calInt(princi, time);
	}
}

abstract class Loan {
	double rate;
	abstract void interest();
	void calInt(double n, double t) {
		double principle = n;
		double time = t;
		double inter = principle*time*rate/100;
		System.out.println("Your interest will be "+inter);
	}
}

class SBI extends Loan {
	void interest() {
		rate=6.15;
	}
}

class PNB extends Loan {
	void interest() {
		rate=6.75;
	}
}

class HDFC extends Loan {
	void interest() {
		rate=6.50;
	}
}

class ICICI extends Loan {
	void interest() {
		rate=6.85;
	}
}

class BankSelector {
	public Loan getBank(String type) {
		if (type.equals("SBI")) {
			return new SBI();
		}
		if (type.equals("ICICI")) {
			return new ICICI();
		}
		if (type.equals("PNB")) {
			return new PNB();
		}
		if (type.equals("HDFC")) {
			return new HDFC();
		}
		return null;
	}
}
