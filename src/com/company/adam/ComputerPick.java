package com.company.adam;
import java.util.*;



public class ComputerPick {
    public static Random rnd = new Random();

    /**
     * receives the state and arr arrays and randomly chooses and places an index that is free
     * @param state the state of the game currently
     * @param arr an array in which each number corresponds to a cell
     * @return 2 in the free cell of state
     */
    public void randomPick(int[][] state, int[][] arr){
        ArrayList<Integer> tmp = FreeIndices(state, arr);
        // use length of tmp to select next move
        int index = rnd.nextInt(tmp.size());
        index = tmp.get(index);
        // Update state with the selection
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (arr[i][j] == index) {
                    state[i][j] = 2;
                }
            }
        }
    }

    /**
     * @param state
     * @param arr
     * @return the free cells that are represented in array tmp
     */
    private ArrayList<Integer> FreeIndices(int[][] state, int[][] arr){
        // return all indices of free cells in state
        ArrayList<Integer> tmp = new ArrayList<Integer>(0);
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (state[i][j] == 0) {
                    tmp.add(arr[i][j]);
                }
            }
        }
        return tmp;
    }

    /**
     * checks if the computer won
     * @param state the current state of the game
     * @return if the computer has won
     */
    public boolean hasComputerWon(int[][] state) {
        boolean has_computer_won = false;
        int countTopDiagonal = 0;
        int countColumn = 0;
        int countRow = 0;
        int countBottomDiagonal = 0;
        for (int i = 0; i <= 2; i++) {
            countColumn = 0;
            countRow = 0;
            for (int j = 0; j <=2; j++) {
                // diagonal from top to bottom
                if (state[j][i] == 2 && i == j) {
                    countTopDiagonal++;
                }
                if (state[2-j][2-i] == 2) {
                    countBottomDiagonal++;
                }
                if (state[j][i] == 2) {
                    countColumn++;
                }
                if (state[i][j] == 2) {
                    countRow++;
                }
            }
            if (countColumn == 3) {
                has_computer_won = true;
                break;
            }
            if (countRow == 3) {
                has_computer_won = true;
                break;
            }
        }
        if (countTopDiagonal == 3) {
            has_computer_won = true;
        }
        if (countBottomDiagonal == 3) {
            has_computer_won = true;
        }
        return has_computer_won;
    }
}
