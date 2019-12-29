package com.company.adam;

import java.util.*;

public class UserInput {
    public int position;
    Scanner input = new Scanner(System.in);

    public void getInput(){
        System.out.println("Enter the number of the square you want to place your piece in");
        position = input.nextInt();
    }
}
