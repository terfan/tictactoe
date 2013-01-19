import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class drawGrid extends JFrame implements ActionListener {
    public static void main(String argv[]) {
        drawGrid fa = new drawGrid();
        fa.setLayout(new GridLayout(3, 3));
        fa.setSize(400, 400);
        fa.setVisible(true);
    }

    drawGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                drawPanel();
            }
                for (int i = 0; i < 81; i++) {
                    for (int i = 0; i < 81; i++) {

            JButton button = new JButton();
            button.addActionListener(this);
            }
            }
            }
        }

    }// End of constructor

    public void actionPerformed(ActionEvent ae) {
        jtf.setText(ae.getActionCommand());
    }
}// End of Application

