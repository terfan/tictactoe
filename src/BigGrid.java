public class BigGrid {
    Grid[][] grids = new Grid[3][3];

    public BigGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grids[i][j] = new Grid();
            }
        }
    }
    
    public boolean isWon() {
        return checkHoriz0() || checkVert0() || checkDiag01() || checkDiag02();
    }

    public boolean checkHoriz0() {
        
        if (grids[0][0].isWon() == true && grids[0][0].isWon() == grids[0][1].isWon() && grids[0][1].isWon() == grids[0][2].isWon()
        		|| grids[1][0].isWon() == true && grids[1][0].isWon() == grids[1][1].isWon() && grids[1][1].isWon() == grids[1][2].isWon()
        		|| grids[2][0].isWon() == true && grids[2][0].isWon() == grids[2][1].isWon() && grids[2][1].isWon() == grids[2][2].isWon()) {
             return true;             
        }
        return false;
    }

    public boolean checkVert0() {
        if (grids[0][0].isWon() == true && grids[0][0].isWon() == grids[1][0].isWon() && grids[1][0].isWon() == grids[2][0].isWon()
        		|| grids[0][1].isWon() == true && grids[0][1].isWon() == grids[1][1].isWon() && grids[1][1].isWon() == grids[2][1].isWon()
        		|| grids[0][2].isWon() == true && grids[0][2].isWon() == grids[1][2].isWon() && grids[1][2].isWon() == grids[2][2].isWon()) {
             return true;      
        }
        
        return false;
    }

    public boolean checkDiag01() {
        if (grids[0][0].isWon() == true  && grids[0][0].isWon() == grids[1][1].isWon() && grids[1][1].isWon() == grids[2][2].isWon()) {
            return true;
        }
        return false;
    }

    public boolean checkDiag02() {
        if (grids[0][2].isWon() == true && grids[0][2].isWon() == grids[1][1].isWon() && grids[1][1].isWon() == grids[2][0].isWon()) {
            return true;
        }
        return false;
    }
}

    

