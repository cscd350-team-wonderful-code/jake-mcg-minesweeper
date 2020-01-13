package minesweeper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
    	
    	String filepath = "C:\\Users\\Jake\\eclipse-workspace\\minesweeper\\src\\minesweeper\\input.txt";
    	
        Scanner reader = new Scanner(new File(filepath));

        String currentLine = reader.nextLine();
        
        Minesweeper board;
        int numberOfFields = 0;
        
        while (!currentLine.equals("0 0")) {
            numberOfFields++;

            String temp[] = currentLine.split(" ");
            int numberOfRows = Integer.parseInt(temp[0]);
            int numberOfCols = Integer.parseInt(temp[1]);

            board = new Minesweeper(numberOfRows, numberOfCols);

            for (int i = 1; i <= numberOfRows; i++) {
                String rowText = reader.nextLine();
                for (int j = 1; j <= numberOfCols; j++) {
                    board.setBoardSpace(i,j,rowText.charAt(j-1));
                }
            }

            System.out.println(String.format("Field #" + numberOfFields + ":\n"));
            System.out.println(board.toString());

            currentLine = reader.nextLine();
        } 
    }
}
