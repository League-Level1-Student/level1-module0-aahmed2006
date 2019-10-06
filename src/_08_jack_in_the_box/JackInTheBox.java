package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import _07_fortune_cookie.FortuneCookie;

public class JackInTheBox implements ActionListener {
	public JackInTheBox() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Surprise!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}
	
	public static void main(String[] args) {
        new JackInTheBox();
        
  }
	private void showPicture(String fileName) {
	    try {
	        JLabel imageLabel = createLabelImage(fileName);
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(imageLabel);
	        frame.setVisible(true);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public JLabel createLabelImage(String fileName) {
		try {
	            URL jackInTheBox = getClass().getResource(fileName);
	            if (jackInTheBox == null) {
		       System.err.println("Could not find image " + fileName);
		       return new JLabel();
	            } else {
	                Icon icon = new ImageIcon(jackInTheBox);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	            }
	        } catch (Exception e) {
	            System.err.println("Could not find image " + fileName);
	            return new JLabel();
	        }
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//showPicture();
	}
}
