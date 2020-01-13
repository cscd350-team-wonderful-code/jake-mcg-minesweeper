package minesweeper.inputgenerator;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//1x1 board
		generateBoardAllOneChar(1,1,'.');
		generateBoardAllOneChar(1,1,'*');
		
		//3x7 board
		generateBoardAllOneChar(3, 7,'.');
		generateBoardAllOneChar(3, 7,'*');
		generateBoardAlternatingChars(3, 7);
		generateBoardRandomChars(3, 7);
		
		//100x1 board
		generateBoardAllOneChar(100, 1,'.');
		generateBoardAllOneChar(100, 1,'*');
		generateBoardAlternatingChars(100, 1);
		generateBoardRandomChars(100, 1);
		
		//1x100 board
		generateBoardAllOneChar(1, 100,'.');
		generateBoardAllOneChar(1, 100,'*');
		generateBoardAlternatingChars(1, 100);
		generateBoardRandomChars(1, 100);

		//10x10 board
		generateBoardAllOneChar(10, 10,'.');
		generateBoardAllOneChar(10, 10,'*');
		generateBoardAlternatingChars(10, 10);
		generateBoardRandomChars(10, 10);

		//20x40 board
		generateBoardAllOneChar(20, 40,'.');
		generateBoardAllOneChar(20, 40,'*');
		generateBoardAlternatingChars(20, 40);
		generateBoardRandomChars(20, 40);
		
		//80x30 board
		generateBoardAllOneChar(80, 30,'.');
		generateBoardAllOneChar(80, 30,'*');
		generateBoardAlternatingChars(80, 30);
		generateBoardRandomChars(80, 30);
		
		//50x50 board
		generateBoardAllOneChar(50, 50,'.');
		generateBoardAllOneChar(50, 50,'*');
		generateBoardAlternatingChars(50, 50);
		generateBoardRandomChars(50, 50);

		// 100x100 board
		generateBoardAllOneChar(100,100,'.');
		generateBoardAllOneChar(100,100,'*');
		generateBoardAlternatingChars(100,100);
		generateBoardRandomChars(100,100);
		
		System.out.println("0 0");
	}
	
	private static void generateBoardAllOneChar(int numberOfRows, int numberOfCols, char charToUse) {
		System.out.println(numberOfRows + " " + numberOfCols);
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCols; j++) {
				System.out.print(charToUse);
			}
			System.out.println(); 
		}
			
	}
	
	private static void generateBoardAlternatingChars(int numberOfRows, int numberOfCols) {
		boolean isMine = true;
		
		System.out.println(numberOfRows + " " + numberOfCols);
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCols; j++) {
				if (isMine) 
					System.out.print('*');
				else
					System.out.print('.');
				
				isMine = !isMine;
			}
			System.out.println();
		}
			
	}
	
	private static void generateBoardRandomChars(int numberOfRows, int numberOfCols) {
		
		System.out.println(numberOfRows + " " + numberOfCols);
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCols; j++) {
				if (useMine()) 
					System.out.print('*');
				else
					System.out.print('.');
			}
			System.out.println();
		}
			
	}
	
	private static boolean useMine() 
	{
		Random randomNumber = new Random();
		return randomNumber.nextInt(2) == 1;
	}
	
	

}
