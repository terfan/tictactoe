public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Game game = new Game();

        DrawGrid grid = new DrawGrid(game);
        grid.setSize(400, 400);
        grid.setVisible(true);

        game.drawgrid = grid;
        game.start();
    }

}
