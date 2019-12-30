package com.company.adam;

import java.util.*;

public class UserInput {
    private int cell;
    Scanner input = new Scanner(System.in);

    public int[][] getInput(int[][] state, int[][] arr){
        System.out.println("Enter the number of the cell you want to place your piece in");
        cell = input.nextInt();
        boolean cell_not_placed = true;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (arr[i][j] == cell && state[i][j] == 0) {
                    cell_not_placed = false;
                    state[i][j] = 1;
                }
            }
        }
        while (cell_not_placed) {
            System.out.println("Enter the number of the cell you want to place your piece in");
            cell = input.nextInt();
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    if (arr[i][j] == cell && state[i][j] == 0) {
                        cell_not_placed = false;
                        state[i][j] = 1;
                    }
                }
            }
        }
        return state;
    }

}
