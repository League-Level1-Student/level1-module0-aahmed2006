package _06_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	public static JButton leftButton = new JButton();
	public static JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	public static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel();

	public void run() {
		
	 
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("Click me!");
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
		panel.add(leftButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
		
	}
	
		
	

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
if(buttonPressed == leftButton) {
	rightButton.setSize(BIG);
	rightButton.setText("No, click ME!");
	leftButton.setSize(SMALL);
	leftButton.setText("Click me!");
} else {
	leftButton.setSize(BIG);
	leftButton.setText("No, click ME!");
	rightButton.setSize(SMALL);
	rightButton.setText("Click me!");
}
		frame.pack();
	}




	 
		// TODO Auto-generated method stub
		
	
}