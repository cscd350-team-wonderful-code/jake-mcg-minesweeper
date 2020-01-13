package minesweeper;

public class Minesweeper {

	private int numberOfBoardRows, numberOfBoardColumns;
    private char[][] board;

    public Minesweeper(int row, int col) {
        //if (!validateLength(row) && !validateLength(col))
            //throw new InvalidArgumentException();
    	
    	numberOfBoardRows = row;
    	numberOfBoardColumns = col;
    	

    	
        board = new char[row + 2][col + 2];
        
        initializeEmptyRows(0);
        initializeEmptyRows(board.length - 1);
        initializeEmptyColumns(0);
        initializeEmptyColumns(board[0].length - 1);
    }

    public void setBoardSpace(int row, int col, char rowText) {
        board[row][col] = rowText;
    }

    public int getNumberOfMinesSurroundingSpace(int row, int col) {
        int count = 0;

        int startingRow = row - 1;
        int endingRow = row + 1;

        int startingCol = col - 1;
        int endingCol = col + 1;

        for (int i = startingRow; i <= endingRow; i++) {
            for (int j = startingCol; j <= endingCol; j++) {
                if (board[i][j] == '*')
                    count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();
        StringBuilder rowText = new StringBuilder();

        for (int i = 1; i <= numberOfBoardRows; i++) {
            for (int j = 1; j <= numberOfBoardColumns; j++) {
                if (board[i][j] == '*')
                    rowText.append('*');
                else
                    rowText.append(getNumberOfMinesSurroundingSpace(i,j));
            }

            boardString.append(rowText.toString() + "\n");
            rowText = new StringBuilder();
        }

        return boardString.toString();
    }

    private boolean validateLength(int value) {
        return value > 0 && value < 100;
    }

    private void initializeEmptyRows(int rowToInitialize) {
        for (int i = 0; i <= board[0].length - 1; i++)
            board[rowToInitialize][i] = '.';
    }

    private void initializeEmptyColumns(int columnToInitialize) {
        for (int i = 0; i <= board.length - 1; i++)
            board[i][columnToInitialize] = '.';
    }
}
