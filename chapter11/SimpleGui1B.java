package chapter11;

import javax.swing.*;

//a new import statement for the package that ActionListener and ActionEvent are in.
import java.awt.event.*;

//implement the interface. This says,"an instance of SimpleGui1B IS-A ActionListener implementers"
public class SimpleGui1B implements ActionListener {
	JButton button;
	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		/*AAAA
		 * register your interest with the button. This says to the button, 
		 * "Add me to your list of listeners".
		 * The argument you pass MUST be an object from a class that 
		 * implements ActionListener!!
		 */
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
}


