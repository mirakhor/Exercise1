package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Elnaz Mirakhorli Apr 26, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
	   
        
        Card[] hand = new Card[7];
        
        

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card(); 
            Random random = new Random();
            hand[i].setValue((random.nextInt(13))+1);                               
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]); 
            
            //test of debugging
            //System.out.println("the card[" + (i+1) + "] value: " + hand[i].getValue() + " and the cardSuit: " + hand[i].getSuit());
           
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Card Value between 1 to 13");
        int userValue = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the suit as: clubs, hearts, spades, diamonds");
        String userSuit = input.nextLine();
        
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        for (int i = 0; i < hand.length; i++){            
            if((userValue == hand[i].getValue()) && (userSuit.equalsIgnoreCase(hand[i].getSuit()))){
                printInfo();
            }
                        
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Elnaz, but you can call me Eli");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Swimming");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Hanging out with firends");

        System.out.println();
        
    
    }

}
