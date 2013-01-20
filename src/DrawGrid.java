import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class DrawGrid extends JFrame implements ActionListener {
    private static final long serialVersionUID = -1344993123117053615L;
    Game game;
    HashMap<String, JButton> buttons = new HashMap<String, JButton>();

    DrawGrid(Game game) {
        this.setLayout(new GridLayout(3, 3));
        this.game = game;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 3));
                panel.setBorder(new LineBorder(Color.BLACK, 4));
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        JButton button = new JButton();
                        String name = i + "," + j + "," + x + "," + y;
                        button.setName(name);
                        button.addActionListener(this);
                        panel.add(button);
                        buttons.put(name, button);
                        button.setBorder(new LineBorder(Color.BLACK, 1));

                    }
                }
                add(panel);
            }
        }
        createMenu();
    }// End of constructor

    public void createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem newGame = new JMenuItem("New Game");

        file.add(newGame);
        newGame.addActionListener(this);
        this.setJMenuBar(menuBar);
    }

    public void highlightGrid(int gridx, int gridy, int player) {
        String name;

        for (int squarex = 0; squarex < 3; squarex++) {
            for (int squarey = 0; squarey < 3; squarey++) {
                name = gridx + "," + gridy + "," + squarex + "," + squarey;
                JButton button = buttons.get(name);
                if (player == 1) {
                    button.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                } else {
                    button.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj instanceof JButton) {
            JButton source = (JButton) ae.getSource();
            if (source == null)
                return;
            game.move(source.getName());
        } else {
            game.reset();
            for (JButton button : buttons.values()) {
                button.setIcon(new ImageIcon("blank.png"));
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        }
    }
}// End of Application

