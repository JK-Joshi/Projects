import java.lang.*;
import java.util.*;

public class rndm {
    public static void main(String[] args) {


        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Pl. enter 0 for Rock, 1 for Paper, and 2 for Scissor");
        String user_input = null;
        String comp_input = null;
        int user_win = 0;
        int comp_win = 0;
        int tie = 0;

        for(int i =1; i<=5;i++) {

            System.out.print("Enter your Input: ");
            int user = sc.nextInt();
            int comp = rnd.nextInt(3);
            System.out.println("Computer input: " + comp);

            if(user == 0){
                user_input = "Rock";
            }else if( user == 1){
                user_input = "Paper";
            }else if (user == 2){
                user_input = "Scissor";
            }

            if(comp == 0){
                comp_input = "Rock";
            }else if( comp == 1){
                comp_input = "Paper";
            }else if (comp == 2){
                comp_input = "Scissor";
            }


            if (user == comp) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("Tie");
                tie++;
            } else if (user == 0 && comp == 1) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("Computer win!");
                comp_win++;
            } else if (user == 0 && comp == 2) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("You win!");
                user_win++;
            } else if (user == 1 && comp == 0) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("You Win!");
                user_win++;
            } else if (user == 1 && comp == 2) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("Computer win!");
                comp_win++;
            } else if (user == 2 && comp == 1) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("You win!");
                user_win++;
            } else if (user == 2 && comp == 0) {
                System.out.println(user_input + " Vs " + comp_input);
                System.out.println("Computer win!");
                comp_win++;
            }
        }
        System.out.println("Total Winnings");
        System.out.println("you win = " + user_win);
        System.out.println("Computer win = " + comp_win);
        System.out.println("Tie = " + tie );

        if(user_win > comp_win){
            System.out.println("You won the compition!!");
        }else{
            System.out.println("You loss the compition!, Try again..");
        }
    }
}
