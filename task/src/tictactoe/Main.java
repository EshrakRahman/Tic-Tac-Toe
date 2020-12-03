package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCellsElements;

        //System.out.println("Enter cells: >");
        inputCellsElements  = scanner.nextLine();

        if (inputCellsElements.contains("O") || inputCellsElements.contains("X") || inputCellsElements.contains("_") ) {
            System.out.println("---------");
            System.out.println("| " + inputCellsElements.charAt(0) + " " + inputCellsElements.charAt(1) + " " + inputCellsElements.charAt(2) + " " + "|");
            System.out.println("| " + inputCellsElements.charAt(3) + " " + inputCellsElements.charAt(4) + " " + inputCellsElements.charAt(5) + " " + "|");
            System.out.println("| " + inputCellsElements.charAt(6) + " " + inputCellsElements.charAt(7) + " " + inputCellsElements.charAt(8) + " " + "|");
            System.out.println("---------");

            if ((inputCellsElements.charAt(0) == 'X' && inputCellsElements.charAt(1) == 'X' && inputCellsElements.charAt(2) == 'X') ||
                    (inputCellsElements.charAt(2) == 'X' && inputCellsElements.charAt(4) == 'X' && inputCellsElements.charAt(6) == 'X') ||
                    (inputCellsElements.charAt(0) == 'X' && inputCellsElements.charAt(8) == 'X' && inputCellsElements.charAt(4) == 'X') ||
                    (inputCellsElements.charAt(6) == 'X' && inputCellsElements.charAt(7) == 'X' && inputCellsElements.charAt(8) == 'X') ||
                    (inputCellsElements.charAt(3) == 'X' && inputCellsElements.charAt(4) == 'X' && inputCellsElements.charAt(5) == 'X') ||
                    (inputCellsElements.charAt(0) == 'X' && inputCellsElements.charAt(3) == 'X' && inputCellsElements.charAt(6) == 'X') ||
                    (inputCellsElements.charAt(1) == 'X' && inputCellsElements.charAt(4) == 'X' && inputCellsElements.charAt(7) == 'X') ||
                    (inputCellsElements.charAt(2) == 'X' && inputCellsElements.charAt(5) == 'X' && inputCellsElements.charAt(8) == 'X')) {
                System.out.println("X wins");
            } else if (((inputCellsElements.charAt(0) == 'O' && inputCellsElements.charAt(1) == 'O' && inputCellsElements.charAt(2) == 'O') ||
                    (inputCellsElements.charAt(2) == 'O' && inputCellsElements.charAt(4) == 'O' && inputCellsElements.charAt(6) == 'O') ||
                    (inputCellsElements.charAt(0) == 'O' && inputCellsElements.charAt(8) == 'O' && inputCellsElements.charAt(4) == 'O') ||
                    (inputCellsElements.charAt(6) == 'O' && inputCellsElements.charAt(7) == 'O' && inputCellsElements.charAt(8) == 'O') ||
                    (inputCellsElements.charAt(3) == 'O' && inputCellsElements.charAt(4) == 'O' && inputCellsElements.charAt(5) == 'O') ||
                    (inputCellsElements.charAt(0) == 'O' && inputCellsElements.charAt(3) == 'O' && inputCellsElements.charAt(6) == 'O') ||
                    (inputCellsElements.charAt(1) == 'O' && inputCellsElements.charAt(4) == 'O' && inputCellsElements.charAt(7) == 'O') ||
                    (inputCellsElements.charAt(2) == 'O' && inputCellsElements.charAt(5) == 'O' && inputCellsElements.charAt(8) == 'O'))) {
                System.out.println("O wins");
                
            }

        } else {
            System.out.println("No");
        }

    }
}
