package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	 public void showButton() {
         JFrame frame = new JFrame();
         frame.setVisible(true);
         JButton button = new JButton();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
         int random = new Random().nextInt(5);
         if(random==0) {
        	
         }
    }
	 public static void main(String[] args) {
         new FortuneCookie().showButton();
         
   }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "woohoo");
		
	}
}
