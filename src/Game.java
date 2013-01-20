import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Game {
    BigGrid elmo = new BigGrid();
    Grid currentGrid;
    int currentPlayer;
    int currentGridx;
    int currentGridy;
    boolean collided;
    DrawGrid drawgrid;

    public Game() {
        currentGrid = null;
        currentPlayer = 1;
        collided = false;
    }

    public void move(String input) {
        String[] splitted = input.split(",");
        String name = null;
        int squarex, squarey;
        int gridx = 0;
        int gridy = 0;
        if (currentGrid == null) {
            gridx = Integer.parseInt(splitted[0]);
            gridy = Integer.parseInt(splitted[1]);
            squarex = Integer.parseInt(splitted[2]);
            squarey = Integer.parseInt(splitted[3]);

            elmo.grids[gridx][gridy].squares[squarex][squarey].value = currentPlayer;
        } else {
            squarex = Integer.parseInt(splitted[2]);
            squarey = Integer.parseInt(splitted[3]);

            if (collided == false) {
                if (currentPlayer == 1)
                    currentPlayer = 2;
                else if (currentPlayer == 2)
                    currentPlayer = 1;
            }
            if (currentGrid.squares[squarex][squarey].value == 0) {
                currentGrid.squares[squarex][squarey].value = currentPlayer;

                if (!currentGrid.won && currentGrid.isWon()) {
                    this.drawgrid.highlightGrid(currentGridx, currentGridy, currentPlayer);
                    currentGrid.won = true;
                }
                collided = false;
            } else {
                collided = true;
                return;
            }
        }

        if (currentGrid == null) {
            name = gridx + "," + gridy + "," + squarex + "," + squarey;
        } else {
            name = currentGridx + "," + currentGridy + "," + squarex + "," + squarey;
        }
        JButton button = (JButton) drawgrid.buttons.get(name);
        if (currentPlayer == 1) {
            ImageIcon o = new ImageIcon("o.png");
            button.setIcon(o);
        }
        if (currentPlayer == 2) {
            ImageIcon x = new ImageIcon("x.png");
            button.setIcon(x);
        }

        button.setOpaque(true);

        currentGridx = squarex;
        currentGridy = squarey;
        currentGrid = elmo.grids[currentGridx][currentGridy];

        printBoard();
    }

    public void reset() {
        this.elmo = new BigGrid();
    }

    public void printBoard() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0)
                System.out.println();

            Grid g1 = elmo.grids[(int) Math.floor(i / 3.)][0];
            Grid g2 = elmo.grids[(int) Math.floor(i / 3.)][1];
            Grid g3 = elmo.grids[(int) Math.floor(i / 3.)][2];
            System.out.print(g1.squares[i % 3][0].value);
            System.out.print(g1.squares[i % 3][1].value);
            System.out.print(g1.squares[i % 3][2].value);
            System.out.print(" ");

            System.out.print(g2.squares[i % 3][0].value);
            System.out.print(g2.squares[i % 3][1].value);
            System.out.print(g2.squares[i % 3][2].value);
            System.out.print(" ");

            System.out.print(g3.squares[i % 3][0].value);
            System.out.print(g3.squares[i % 3][1].value);
            System.out.print(g3.squares[i % 3][2].value);

            System.out.println();
        }
    }
}
