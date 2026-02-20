//Name: Sarah Shafi
import java.util.*; 

public class CardPlayer extends Player{
  private ArrayList<Card> hand;
  private ArrayList<Card> takenCards;

  public CardPlayer(String n, int score, ArrayList<Card> hand){
    super(n,score);
    this.hand = hand;
    this.takenCards = new ArrayList<Card>();
  }

  public void setHand(ArrayList<Card> c){
    this.hand = c;
  }

  public ArrayList<Card> getHand(){
    return hand;
  }

  public void setTakenCards(ArrayList<Card> t){
    this.takenCards = t;
  }

  public ArrayList<Card> getTakenCards(){
    return takenCards;
  }

  public void addCard(Card card){
    hand.add(card);
  }

  public Card playCard(int index){
    Card played = hand.get(index);
    hand.remove(index);
    return played;
  }

  public Card chooseCard(ArrayList<Card> curr, ArrayList<Card> prev){
    Card target = new Card("2","clubs",2);
    if (hand.indexOf(target)!=-1){
      return playCard(hand.indexOf(target));
    }

    //first player in any round but r1
    if (curr.size()==0 && prev.size()>0){
      int rand = (int)(Math.random() * hand.size());
      return playCard(rand);
    }

    //not first player
    if (curr.size()>0){
      String suitLed = curr.get(0).getSuit();
      ArrayList<Integer> matchingS = new ArrayList<Integer>();
      ArrayList<Integer> hearts = new ArrayList<Integer>();

      for (int i = 0; i<hand.size(); i++){
        if (hand.get(i).getSuit().equals(suitLed)){
          matchingS.add(i);
        }
        if (hand.get(i).getSuit().equals("hearts")){
          hearts.add(i);
        }
      }

      //if matching suit
      if(!matchingS.isEmpty()){
        int randInd = matchingS.get((int)(Math.random() * matchingS.size()));
        return playCard(randInd);
      }

      
      //if heart
      if(!hearts.isEmpty()){
        int randInd2 = hearts.get((int)(Math.random() * hearts.size()));
        return playCard(randInd2);
      }

      //random card
      int randInd3 = (int)(Math.random() * hand.size());
      return playCard(randInd3);
    }

    return playCard(0); //wont happen
  }

  public String toString(){
    Collections.sort(hand);
    return getName() + "(" + getScore() + ") " + hand;
  }

}
