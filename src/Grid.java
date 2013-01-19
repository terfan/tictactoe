public class Grid {
    Square[][] squares = new Square[3][3];

    public Grid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares[i][j] = new Square();
                squares[i][j].value = 0;
            }
        }
    }
}
