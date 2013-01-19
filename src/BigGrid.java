public class BigGrid {
    Grid[][] grids = new Grid[3][3];

    public BigGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grids[i][j] = new Grid();
            }
        }
    }
}
