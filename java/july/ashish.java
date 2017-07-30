class Info
{
	public static void main(String[] args)
	{
		System.out.println("My Name is Ashish.");
		System.out.println("I'm currntly enrolled in Android Development Programme runned by Spic India.");
		System.out.println("I've done BCA");
	}
}
class Commmand
{
	public static void main(String[] args) {
		int x = args.length;
		System.out.println("Number of arguments are "+x);
		for (int i=0;i<x;i++) {
			System.out.println(args[i]);
		}
	}
}