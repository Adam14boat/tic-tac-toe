package com.company.adam;
import java.util.*;



public class ComputerPick {
    Random rnd = new Random();
    ArrayList<Integer> positionArray = new ArrayList<Integer>(9);

    public int[][] randomPick(int[][] state, int[][] arr){
        ArrayList<Integer> tmp = FreeIndices(state, arr);

        // use length of tmp to select next move
        int position = rnd.nextInt(10) + 1;

        // Update state with the selection
        state[i][j] = 1;
        return state;
    }

    public ArrayList<Integer> FreeIndices(int[][] state,int[][] arr){
        // return all indices of free cells in state
    }


}
