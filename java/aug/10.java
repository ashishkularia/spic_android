class MultipleInherritance {
	public static void main(String[] args) {
		DemoCompany obj = new DemoCompany();
		obj.getName("Spic");
		obj.getDetail("Ashish",143);
		obj.show();
		obj.showDetails();
	}
}

interface Company {
	void getName(String n);
	void show();
}

interface Emp {
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