package com.company.adam;

import java.util.Arrays;

public class Main {
    static UserInput userinput = new UserInput();
    static ComputerPick computerpick = new ComputerPick();
    public static void main(String[] args) {
	// write your code here
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] state = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(state));
        for (int i = 1; i <= 4; i++) {
            userinput.getInput(state, arr);
            if (userinput.hasUserWon(state)) {
                System.out.println("Congratulations you won!!");
                return;
            }
            computerpick.randomPick(state, arr);
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

}
