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

    public boolean isWon() {
        return checkHoriz() || checkVert() || checkDiag1() || checkDiag2();
    }

    public boolean checkHoriz() {
        
        if (squares[0][0].value != 0 && squares[0][0].value == squares[0][1].value && squares[0][1].value == squares[0][2].value
        		|| squares[1][0].value != 0 && squares[1][0].value == squares[1][1].value && squares[1][1].value == squares[1][2].value
        		|| squares[2][0].value != 0 && squares[2][0].value == squares[2][1].value && squares[2][1].value == squares[2][2].value) {
             return true;             
        }
        return false;
    }

    public boolean checkVert() {
        if (squares[0][0].value != 0 && squares[0][0].value == squares[1][0].value && squares[1][0].value == squares[2][0].value
        		|| squares[0][1].value != 0 && squares[0][1].value == squares[1][1].value && squares[1][1].value == squares[2][1].value
        		|| squares[0][2].value != 0 && squares[0][2].value == squares[1][2].value && squares[1][2].value == squares[2][2].value) {
             return true;      
        }
        
        return false;
    }

    public boolean checkDiag1() {
        if (squares[0][0].value != 0 && squares[0][0].value == squares[1][1].value && squares[1][1].value == squares[2][2].value) {
            return true;
        }
        return false;
    }

    public boolean checkDiag2() {
        if (squares[0][2].value != 0 && squares[0][2].value == squares[1][1].value && squares[1][1].value == squares[2][0].value) {
            return true;
        }
        return false;
    }
}
