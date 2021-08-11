package com.company;


import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for paper, and 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if ( userInput == computerInput){
            System.out.println("Draw");
        }
        else if ( userInput ==0 && computerInput ==2 || userInput ==1 && computerInput==0 || userInput==2 && computerInput==1 ){
            System.out.println("You Win !!");

        }
        else{
            System.out.println("Computer wins");
        }

        switch (computerInput){
            case 0:
                System.out.println("Computer picked Rock");
                break;
            case 1:
                System.out.println("Computer Picked Paper");
            case 2:
                System.out.println("computer Picked Scissor");

        }

    }






}
