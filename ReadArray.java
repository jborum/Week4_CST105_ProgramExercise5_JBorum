import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Program: Read Array File: ReadArray.java Summary: Program reads data from a
 * text file and stores data in an 20 x 45 array Author: Jason E. Borum Date:
 * December 9, 2017
 **/

public class ReadArray {

	public static void main(String[] args) throws FileNotFoundException {

		// Create String Array
		char[][] charArray = new char[20][45];
		char stringChar;

		// Create a Scanner
		Scanner fileIn = new Scanner(new File("ReadFileArray.in"));
		String fileString = fileIn.nextLine();

		int stringLength = fileString.length();

		// Fill multi-dimensional array with ''@' character
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray[i].length; j++) {
				charArray[i][j] = '@';
			}
		}

		// Add characters from the
		int k = 0;
		while (k < stringLength) {
			stringChar = fileString.charAt(k);
			charArray[0][k] = stringChar;
			k++;
		}

		// Prints out a multidimensional array with the values being the indexes

		for (char[] rows : charArray) {
			// for(elementDataType varForColumn : varForRow)
			for (char column : rows) {
				System.out.print(column);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < charArray[0].length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				System.out.print(Character.toString(charArray[j][i]));
			}
			System.out.println();
		}

	} // End of main method
} // End of ReadArray Class
