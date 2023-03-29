package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/31 15:06
 */
class Card {
    private String suit;
    private  int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "[" + suit + ',' + rank + ']';
    }
}
public class TestCard {

    public static  final String[] suits = {"♥","♦","♠","♣"};
    
    public static List<Card> buyCard() {
        List<Card> desk = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                String suit = suits[i];
                Card card = new Card(suit,j);
                desk.add(card);
            }
        }
        return desk;
    }

    public static void main(String[] args) {
        List<Card> cardList = buyCard();
        System.out.println(cardList);
    }
}
