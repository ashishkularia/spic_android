import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Scanner;

/*
<applet code="Assignment_1_11_8_2017.class" width=400 height=400> </applet>
*/

public class Assignment_1_11_8_2017 extends Applet {
	Button sum, mul, sub, div;
	TextField txt1, txt2, txt3;
	public void init() {
		sum = new Button("Sum (+)");
		mul = new Button("Multiply (*)");
		sub = new Button("Subtract (-)");
		div = new Button("Divide (/)");
		txt1 = new TextField(20);
		txt2 = new TextField(20);
		txt3 = new TextField(20);
		add(txt1);
		add(txt2);
		add(txt3);
		add(sum);
		add(mul);
		add(sub);
		add(div);
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Double str = Double.parseDouble(txt1.getText());
				Double str2 = Double.parseDouble(txt2.getText());
				str += str2;
				txt3.setText(String.valueOf(str));
				System.out.println("String is "+str);
			}
		});
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Double str = Double.parseDouble(txt1.getText());
				Double str2 = Double.parseDouble(txt2.getText());
				str *= str2;
				txt3.setText(String.valueOf(str));
				System.out.println("String is "+str);
			}
		});
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Double str = Double.parseDouble(txt1.getText());
				Double str2 = Double.parseDouble(txt2.getText());
				str -= str2;
				txt3.setText(String.valueOf(str));
				System.out.println("String is "+str);
			}
		});
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Double str = Double.parseDouble(txt1.getText());
				Double str2 = Double.parseDouble(txt2.getText());
				str /= str2;
				txt3.setText(String.valueOf(str));
				System.out.println("String is "+str);
			}
		});
	}
}