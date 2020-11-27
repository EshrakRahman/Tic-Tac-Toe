package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCellsElements = "";
        int count = 0;

        //System.out.println("Enter cells: >");
        inputCellsElements  = scanner.nextLine();

        if (inputCellsElements.contains("0") || inputCellsElements.contains("X") || inputCellsElements.contains("_") ) {
            System.out.println("---------");
            System.out.println("| " + inputCellsElements.charAt(0) + " " + inputCellsElements.charAt(1) + " " + inputCellsElements.charAt(2) + " " + "|");
            System.out.println("| " + inputCellsElements.charAt(3) + " " + inputCellsElements.charAt(4) + " " + inputCellsElements.charAt(5) + " " + "|");
            System.out.println("| " + inputCellsElements.charAt(6) + " " + inputCellsElements.charAt(7) + " " + inputCellsElements.charAt(8) + " " + "|");
            System.out.println("---------");
        } else {
            System.out.println("No");
        }

    }
}
