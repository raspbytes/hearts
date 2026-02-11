import java.util.ArrayList;

public class Deck{
  private ArrayList<Card>deck;

  public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
  public static final String[] SUITS = {"clubs","spades","hearts","diamonds"};
  public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,1};
  
  public  Deck(){
    initializeDeck();
  }

  public void initializeDeck(){
    deck = new ArrayList<Card>(52);
    for (int s=0;s<SUITS.length;s++){
      for (int r=0; r<RANKS.length;r++){
          Card c = new Card(NAMES[r],SUITS[s],RANKS[r]);
          deck.add(c);
          }
      }
    }

  public void setDeck(ArrayList<Card> c){
    deck.clear();
    for (Card card: c){
      deck.add(card);
    }
  }

  public ArrayList<Card> getDeck() {
    return deck;
  }

  
  public Card getCard(int i){
    return deck.get(i);
  }

  public Card dealTopCard(){
    Card top = deck.get(0);
    deck.remove(0);
    return top;
  }

  public void shuffle(){
    int numCards = (int)(Math.random() * 9 + 2);
    for (int i=0; i<numCards; i++){
      Card c = this.dealTopCard();
      int loc = (int)(Math.random() * (deck.size() - 1)) + 1;
      deck.add(loc, c);
    }
  }

  public String toString(){
    String result = "";
    if (deck.size()==0){
      result = "No cards in the deck!";
    }
    
    else{
     for (Card c : deck){
      result += c.toString();
      }
    }
    result += "\n";
    return result;
  }
  

  
}
