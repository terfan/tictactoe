
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JPanel;

public class drawPanel extends JPanel implements ActionListener {
	public drawPanel(){
		 for (int i = 0; i < 9; i++) {
			 JButton button = new JButton();
			 button.addActionListener(this);
			 }
	}

 public void actionPerformed(ActionEvent ae) {
 ae.getActionCommand();
 }
 }
