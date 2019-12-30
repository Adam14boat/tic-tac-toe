package com.company.adam;

import java.lang.reflect.Array;
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
            System.out.println(Arrays.deepToString(state));
            computerpick.randomPick(state, arr);
            System.out.println(Arrays.deepToString(state));
        }
        userinput.getInput(state, arr);
        System.out.println(Arrays.deepToString(state));
    }

    /**
     * check if someone won
     * @return
     */
    public boolean hasSomeoneWon() {

        return false;
    }
}
