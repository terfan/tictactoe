public class Game {
    BigGrid elmo = new BigGrid();
    Grid currentGrid;
    int currentPlayer;

    public void Game() {
        currentGrid = null;
        currentPlayer = 1;

    }

    public static void play(boolean player, int row, int col) {
        if (player == true) {
        } else {

        }
    }

    public void start() {
        printBoard();
        while (true) {
            String input = StdIn.readString();
            String[] splitted = input.split(",");
            if (currentGrid == null) {
                int gridx = Integer.parseInt(splitted[0]);
                int gridy = Integer.parseInt(splitted[1]);
                int squarex = Integer.parseInt(splitted[2]);
                int squarey = Integer.parseInt(splitted[3]);
                int value = Integer.parseInt(splitted[4]);

                elmo.grids[gridx][gridy].squares[squarex][squarey].value = value;
                currentGrid = elmo.grids[squarex][squarey];
                currentPlayer = value;
            } else {
                int squarex = Integer.parseInt(splitted[0]);
                int squarey = Integer.parseInt(splitted[1]);
                currentGrid.squares[squarex][squarey].value = currentPlayer;
                currentGrid = elmo.grids[squarex][squarey];
            }
            if (currentPlayer == 1)
                currentPlayer = 2;
            else if (currentPlayer == 2)
                currentPlayer = 1;
            printBoard();
        }
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
