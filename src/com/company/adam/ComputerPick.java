package com.company.adam;
import java.util.*;



public class ComputerPick {
    Random rnd = new Random();

    /**
     * receives the state and arr arrays and randomly chooses and places an index that is free
     * @param state the state of the game currently
     * @param arr an array in which each number corresponds to a cell
     * @return 2 in the free cell of state
     */
    public int[][] randomPick(int[][] state, int[][] arr){
        ArrayList<Integer> tmp = FreeIndices(state, arr);
        // use length of tmp to select next move
        int index = rnd.nextInt(tmp.size());
        // Update state with the selection
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (arr[i][j] == index) {
                    state[i][j] = 2;
                }
            }
        }
        return state;
    }

    /**
     * @param state
     * @param arr
     * @return the free cells that are represented in array tmp
     */
    private ArrayList<Integer> FreeIndices(int[][] state, int[][] arr){
        // return all indices of free cells in state
        ArrayList<Integer> tmp = new ArrayList<Integer>(0);
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (state[i][j] == 0) {
                    tmp.add(arr[i][j]);
                }
            }
        }
        return tmp;
    }


}
