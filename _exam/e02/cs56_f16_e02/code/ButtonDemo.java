import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo {
    private JFrame frame;
    private JLabel label;
    public static void main (String[] args) {
		ButtonDemo gui = new ButtonDemo ();
		gui.go();
    }
    public void go() {
		frame = new JFrame();
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), 
											BoxLayout.X_AXIS);
		frame.setLayout(boxLayout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("Button 1");
		button1.addActionListener(new Listener1());
		JButton button2 = new JButton("Button 2");
		button2.addActionListener(new Listener2());
		label = new JLabel("Nothing clicked yet");
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.setSize(400,100);
		frame.setVisible(true);
    }
	
    class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Button 1 clicked");
		}
	}

    class Listener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Button 2 clicked");
		}
	}

}