package com.company.adam;

import java.util.*;

public class UserInput {
    static Scanner input = new Scanner(System.in);

    public void getInput(int[][] state, int[][] arr){
        System.out.println("Enter the number of the cell you want to place your piece in");
        int cell = input.nextInt();
        boolean cell_not_placed = true;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (arr[i][j] == cell && state[i][j] == 0) {
                    cell_not_placed = false;
                    state[i][j] = 1;
                }
            }
        }
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
        boolean has_player_won = false;
        int countTopDiagonal = 0;
        int countColumn = 0;
        int countRow = 0;
        int countBottomDiagonal = 0;
        for (int i = 0; i <= 2; i++) {
            countColumn = 0;
            countRow = 0;
            for (int j = 0; j <=2; j++) {
                // diagonal from top to bottom
                if (state[j][i] == 1 && i == j) {
                    countTopDiagonal++;
                }
                if (state[2-j][2-i] == 1) {
                    countBottomDiagonal++;
                }
                if (state[i][j] == 1) {
                    countColumn++;
                }
                if (state[j][i] == 1) {
                    countRow++;
                }
            }
            if (countColumn == 3) {
                has_player_won = true;
                break;
            }
            if (countRow == 3) {
                has_player_won = true;
                break;
            }
        }
        if (countTopDiagonal == 3) {
            has_player_won = true;
        }
        if (countBottomDiagonal == 3) {
            has_player_won = true;
        }
        return has_player_won;
    }
}
