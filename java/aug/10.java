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

