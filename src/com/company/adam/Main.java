package com.company.adam;

public class Main {
    static UserInput userinput = new UserInput();
    static ComputerPick computerpick = new ComputerPick();
    public static void main(String[] args) {
	// write your code here
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] state = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 1; i <= 4; i++) {
            userinput.getInput(state, arr);
            System.out.println(state);
            computerpick.randomPick(state, arr);
            System.out.println(state);
        }
        userinput.getInput(state, arr);
        System.out.println(state);
    }

    public boolean hasSomeoneWon() {

        return
    }
}
