/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("===== COWS AND BULLS GAME =====");
        
        System.out.println("===== PLAYER 1 =====");
        System.out.println("[1] Rock\n[2] Paper\n[3] Scissors");
        String Player1Choice = scn.nextLine();
        
        System.out.println("===== PLAYER 2 =====");
        System.out.println("[1] Rock\n[2] Paper\n[3] Scissors");
        String Player2Choice = scn.nextLine();
        
        String winner = WinningPlayer(Player1Choice, Player2Choice);
        
        String number = "";
        int attempts = 0;
        
        if (winner.equals("Player 1")) {
            System.out.println("\n===== PLAYER 1 WINS! =====");
            System.out.println("PLEASE ENTER A 4-DIGIT NUMBER: ");
            number = scn.nextLine();
            
            while (attempts < 10){
                System.out.println("\n===== PLAYER 2 =====");
                System.out.println("PLEASE ENTER YOUR GUESS: ");
                String guess = scn.nextLine();
                
                int bulls = 0;
                int cows = 0;
                for (int i = 0; i < number.length(); i++) {
                    if (guess.charAt(i) == number.charAt(i)) {
                        bulls++;
                    } else if (number.contains(String.valueOf(guess.charAt(i)))) {
                        cows++;
                    }
                }
                
                System.out.println("Bulls: " +bulls+ " Cows: " +cows);
                
                if (bulls == 4) {
                    System.out.println("\n===== PLAYER 2 WINS!!! =====");
                    break;
                }
                
                attempts++;
            }
            
            if (attempts >= 10) {
                System.out.println("\n===== GAME OVER! =====");
                System.out.println("The correct number was " +number+ "!");
                System.exit(0);
            }
            
        } else {
            System.out.println("\n===== PLAYER 2 WINS! =====");
            System.out.println("PLEASE ENTER A 4-DIGIT NUMBER: ");
            number = scn.nextLine();
            
            while (attempts < 10){
                System.out.println("\n===== PLAYER 1 =====");
                System.out.println("PLEASE ENTER YOUR GUESS: ");
                String guess = scn.nextLine();
                
                int bulls = 0;
                int cows = 0;
                for (int i = 0; i < number.length(); i++) {
                    if (guess.charAt(i) == number.charAt(i)) {
                        bulls++;
                    } else if (number.contains(String.valueOf(guess.charAt(i)))) {
                        cows++;
                    }
                }
                
                System.out.println("Bulls: " +bulls+ " Cows: " +cows);
                
                if (bulls == 4) {
                    System.out.println("\n===== PLAYER 1 WINS!!! =====");
                    break;
                }
                
                attempts++;
            }
            
            if (attempts >= 10) {
                System.out.println("\n===== GAME OVER! =====");
                System.out.println("The correct number was " +number+ "!");
            }
        }
        
        
    }
    
    public static String WinningPlayer(String Player1, String Player2) {
        if(Player1.equals("1") && Player2.equals("3")) //rock beats scissors
        {
            return "Player 1";
        } else if(Player1.equals("2") && Player2.equals("1")) //paper beats rock
        {
            return "Player 1";
        } else if(Player1.equals("3") && Player2.equals("2")) //scissors beats paper
        {
            return "Player 1";
        } else
        {
            return "Player 2"; //all other choices that are vice versa will result to player 2 winning
        }
    }
}