package Class25;

import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return  interestRate+" "+cardType;
    }
}
class Main{
    public static void main(String[] args) {
        LinkedList<Card> linkedList=new LinkedList<>();
        Card card1=new Card(2.5,"Visa");
        Card card2=new Card(3.5,"Master Cared");
        Card card3=new Card(2.5,"Discover");
        linkedList.add(card1);
        linkedList.add(card2);
        linkedList.add(card3);
        for(Card link:linkedList){
            System.out.println(link);
        }
    }
}