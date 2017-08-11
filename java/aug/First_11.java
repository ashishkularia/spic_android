import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
	<applet code="First_11.class" height=400 width=400></applet>
*/

public class First_11 extends Applet {
	Button login, red, blue, green;
	TextField txt;
	public void init() {
		System.out.println("This is inti()");
		Color c=new Color(125,025,200);
		setBackground(c);
		login = new Button("Login");
		red= new Button("Red");
		green = new Button("Green");
		blue = new Button("Blue");
		add(login);
		add(red);
		add(green);
		add(blue);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str= ae.getActionCommand();
				System.out.println(""+str);
			}
		});
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str= ae.getActionCommand();
				System.out.println(""+str);
				setBackground(Color.red);
			}
		});
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str= ae.getActionCommand();
				System.out.println(""+str);
				setBackground(Color.green);
			}
		});
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str= ae.getActionCommand();
				System.out.println(""+str);
				setBackground(Color.blue);
			}
		});
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