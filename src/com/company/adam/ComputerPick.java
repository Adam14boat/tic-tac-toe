package com.company.adam;
import java.util.*;



public class ComputerPick {
    static Random rnd = new Random();

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
                    System.out.println(arr[i][j]);
                    tmp.add(arr[i][j]);
                }
            }
        }
        return tmp;
    }

    public boolean hasComputerWon(int[][] state) {
        boolean player_top_diagonal = true;
        boolean player_column = true;
        boolean player_row = true;
        boolean player_bottom_diagonal = false;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <=2; j++) {
                // diagonal from top to bottom
                if (state[i][j] != 2 && i == j) {
                    player_top_diagonal = false;
                }
                if (state[i][j] != 2) {
                    player_column = false;
                }
                if (state[j][i] != 2) {
                    player_row = false;
                }
            }
        }
        if (state[2][0] == state[0][2] && state[1][1] == state[2][0] && state[1][1] == 2) {
            player_bottom_diagonal = true;
        }
        return player_top_diagonal || player_column || player_row || player_bottom_diagonal;
    }
}
