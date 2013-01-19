import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawGrid extends JFrame implements ActionListener {
    Game game;

    DrawGrid(Game game) {
        this.setLayout(new GridLayout(3, 3));
        this.game = game;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 3));
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        JButton button = new JButton();
                        String name = i + "," + j + "," + x + "," + y;
                        button.setName(name);
                        button.addActionListener(this);
                        panel.add(button);
                    }
                }
                add(panel);
            }
        }

    }// End of constructor

    public void actionPerformed(ActionEvent ae) {
        JButton source = (JButton) ae.getSource();
        game.move(source.getName());
    }
}// End of Application

