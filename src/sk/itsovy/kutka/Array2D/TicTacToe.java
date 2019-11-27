package sk.itsovy.kutka.Array2D;

public class TicTacToe {
    private char[][] space = new char[3][3];
    private int numMoves = 0;
    public static int countOfPlayers;

    public TicTacToe(int numMoves) {
        this.space = space;
        this.numMoves = numMoves;
        countOfPlayers++;
    }

    public void moving(int row, int col, char player) {
        if(space[row][col] == 'X' || space[row][col] == '0') {
            System.out.println("Occupied");
        } else {
            space[row][col] = player;
            numMoves++;
        }

    }
    public boolean isFull() {
        return numMoves == 9;
    }
    public boolean winner() {
        return (space[0][0] == space [0][1] && space[0][0] == space [0][2]) ||
                (space[0][0] == space [1][1] && space[0][0] == space [2][2]) ||
                (space[0][0] == space [1][0] && space[0][0] == space [2][0]) ||
                (space[2][0] == space [2][1] && space[2][0] == space [2][2]) ||
                (space[2][0] == space [1][1] && space[0][0] == space [0][2]) ||
                (space[0][2] == space [1][2] && space[0][2] == space [2][2]) ||
                (space[0][1] == space [1][1] && space[0][1] == space [2][1]) ||
                (space[1][0] == space [1][1] && space[1][0] == space [1][2]);
    }
}
