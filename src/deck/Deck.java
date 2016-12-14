/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author polina.garmas
 */


public class Deck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Card crd = new Card(Suit.Clubs, Values.Ace);
//        System.out.println(crd.name());
//        
         ArrayList<Card> deck = new ArrayList();
         
         deck.add(new Card(Suit.Clubs, Values.Ace));
         deck.add(new Card(Suit.Clubs, Values.Two));
         deck.add(new Card(Suit.Clubs, Values.Three));
         deck.add(new Card(Suit.Clubs, Values.Four));
         deck.add(new Card(Suit.Clubs, Values.Five));
         deck.add(new Card(Suit.Clubs, Values.Six));
         deck.add(new Card(Suit.Clubs, Values.Seven));
         deck.add(new Card(Suit.Clubs, Values.Eight));
         deck.add(new Card(Suit.Clubs, Values.Nine));
         deck.add(new Card(Suit.Clubs, Values.Ten));
         deck.add(new Card(Suit.Clubs, Values.Jack));
         deck.add(new Card(Suit.Clubs, Values.Queen));
         deck.add(new Card(Suit.Clubs, Values.King));
         
         deck.add(new Card(Suit.Spades, Values.Ace));
         deck.add(new Card(Suit.Spades, Values.Two));
         deck.add(new Card(Suit.Spades, Values.Three));
         deck.add(new Card(Suit.Spades, Values.Four));
         deck.add(new Card(Suit.Spades, Values.Five));
         deck.add(new Card(Suit.Spades, Values.Six));
         deck.add(new Card(Suit.Spades, Values.Seven));
         deck.add(new Card(Suit.Spades, Values.Eight));
         deck.add(new Card(Suit.Spades, Values.Nine));
         deck.add(new Card(Suit.Spades, Values.Ten));
         deck.add(new Card(Suit.Spades, Values.Jack));
         deck.add(new Card(Suit.Spades, Values.Queen));
         deck.add(new Card(Suit.Spades, Values.King));
         
         deck.add(new Card(Suit.Hearts, Values.Ace));
         deck.add(new Card(Suit.Hearts, Values.Two));
         deck.add(new Card(Suit.Hearts, Values.Three));
         deck.add(new Card(Suit.Hearts, Values.Four));
         deck.add(new Card(Suit.Hearts, Values.Five));
         deck.add(new Card(Suit.Hearts, Values.Six));
         deck.add(new Card(Suit.Hearts, Values.Seven));
         deck.add(new Card(Suit.Hearts, Values.Eight));
         deck.add(new Card(Suit.Hearts, Values.Nine));
         deck.add(new Card(Suit.Hearts, Values.Ten));
         deck.add(new Card(Suit.Hearts, Values.Jack));
         deck.add(new Card(Suit.Hearts, Values.Queen));
         deck.add(new Card(Suit.Hearts, Values.King));
         
         deck.add(new Card(Suit.Diamonds, Values.Ace));
         deck.add(new Card(Suit.Diamonds, Values.Two));
         deck.add(new Card(Suit.Diamonds, Values.Three));
         deck.add(new Card(Suit.Diamonds, Values.Four));
         deck.add(new Card(Suit.Diamonds, Values.Five));
         deck.add(new Card(Suit.Diamonds, Values.Six));
         deck.add(new Card(Suit.Diamonds, Values.Seven));
         deck.add(new Card(Suit.Diamonds, Values.Eight));
         deck.add(new Card(Suit.Diamonds, Values.Nine));
         deck.add(new Card(Suit.Diamonds, Values.Ten));
         deck.add(new Card(Suit.Diamonds, Values.Jack));
         deck.add(new Card(Suit.Diamonds, Values.Queen));
         deck.add(new Card(Suit.Diamonds, Values.King));
         
         for (Card deck1 : deck) {
             System.out.println(deck1.name());
        }
         
        ArrayList<Card> playerhand = new ArrayList();
        System.out.println("~~~~~~~~");
        Random random = new Random();
        System.out.println(deck.size());
        for (int i = 0; i < 10; i++) {
            Card crd = deck.get(random.nextInt(deck.size()-1));
            System.out.println(crd.name());
            playerhand.add(crd);
        }


            
        
    }
    
}
