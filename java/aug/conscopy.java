import java.util.Scanner;
class MainDemo
{
public static void main(String[]args)
{
Box b=new Box();
Box b1=new Box(10);
Box b2=new Box(10,20,30);
Box b3=new Box(b1);//copy constructor concept.
b.volume();
b1.volume();
b2.volume();
b3.volume();
}
}
class Box
{
private int lenght,width,height;
public Box()
{}
public Box(int l)
{

lenght=width=height=10;
}
public Box(int l,int w,int h)
{
	lenght=l;
	width=w;
	height=h;
}
public Box(Box b)
{
	lenght=b.lenght;
	width=b.width;
	height=b.height;
}
public void volume()
{
	int vol=lenght*width*height;
	System.out.println("volume is "+vol);
	}
}



























