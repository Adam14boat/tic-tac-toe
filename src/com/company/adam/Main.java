package com.company.adam;

import java.util.Arrays;

public class Main {
    static UserInput userinput = new UserInput();
    static ComputerPick computerpick = new ComputerPick();
    public static void main(String[] args) {
	// write your code here
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] state = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        printMatrix(state);
        for (int i = 1; i <= 4; i++) {
            userinput.getInput(state, arr);
            printMatrix(state);
            if (userinput.hasUserWon(state)) {
                System.out.println("Congratulations you won!!");
                return;
            }
            computerpick.randomPick(state, arr);
            printMatrix(state);
            if (computerpick.hasComputerWon(state)) {
                System.out.println("You lose, better luck next time");
                return;
            }
        }
        userinput.getInput(state, arr);
        if (userinput.hasUserWon(state)) {
            System.out.println("Congratulations you won!!");
        }

    }

    /**
     * prints the state of the form of a 3 by 3 matrix
     * @param state
     */
    public static void printMatrix(int[][] state) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (j != 2) {
                    System.out.printf("%3d  |", state[i][j]);
                } else {
                    System.out.printf("%3d", state[i][j]);
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println( " _ __|__ __|__ _");
            }
        }
        System.out.println();
    }

}
