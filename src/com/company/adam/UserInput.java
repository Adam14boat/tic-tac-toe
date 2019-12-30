package com.company.adam;

import java.util.*;

public class UserInput {
    private int cell;
    Scanner input = new Scanner(System.in);

    public void getInput(int[][] state, int[][] arr){
        System.out.println("Enter the number of the cell you want to place your piece in");
        cell = input.nextInt();
        boolean cell_not_placed = true;
        while (cell_not_placed) {
            System.out.println("Enter the number of the cell you want to place your piece in");
            cell = input.nextInt();
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    if (arr[i][j] == cell && state[i][j] == 0) {
                        cell_not_placed = false;
                        state[i][j] = 1;
                    }
                }
            }
        }
    }

    public boolean hasUserWon(int[][] state) {
        boolean player_top_diagonal = true;
        boolean player_column = true;
        boolean player_row = true;
        boolean player_bottom_diagonal = false;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <=2; j++) {
                // diagonal from top to bottom
                if (state[i][j] != 1 && i == j) {
                    player_top_diagonal = false;
                }
                if (state[i][j] != 1) {
                    player_column = false;
                }
                if (state[j][i] != 1) {
                    player_row = false;
                }
            }
        }
        if (state[2][0] == state[0][2] && state[1][1] == state[2][0] && state[1][1] == 1) {
            player_bottom_diagonal = true;
        }
        return player_top_diagonal || player_column || player_row || player_bottom_diagonal;
    }
}
