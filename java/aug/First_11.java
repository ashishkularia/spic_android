import java.awt.*;
import java.applet.*;

/*
	<applet code="First_11.class" height=400 width=400></applet>
*/

public class First_11 extends Applet {
	public void init() {
		System.out.println("This is inti()");
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
	}
}