import java.awt.*;
import java.applet.*;

/*
	<applet code="First_11.class" height=400 width=400></applet>
*/

public class First_11 extends Applet {
	Button login;
	TextField txt;
	public void init() {
		System.out.println("This is inti()");
		Color c=new Color(125,025,200);
		setBackground(c);
		login = new Button("Login");
		add(login);
	}
	public void start() {
		System.out.println("This is start()");
	}
	public void stop() {
		System.out.println("This is stop()");
	}
	public void destroy() {
		System.out.println("This is destroy()");
	}
	public void paint(Graphics g) {
		System.out.println("This is paint()");
		g.drawString("This is my First Applet",100,50);
	}
}