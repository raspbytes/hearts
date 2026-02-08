//Name: Sarah Shafi
public class Card{
  private String name;
  private String suit;
  private int rank;

  public Card(String n, String s, int r){
    name = n;
    suit = s;
    rank = r;
  }

  public Card(){
    name = "default";
    suit = "default";
    rank = 0;
  }

  public String getName(){
    return name;
  }

  public String getSuit(){
    return suit;
  }

  public int getRank(){
    return rank;
  }

  public void setName(String n){
    name = n;
  }

  public void setSuit(String s){
    suit = s;
  }

  public void setRank(int r){
    rank = r;
  }

  public boolean equals(Object obj){
    Card c = (Card) obj;
    return (suit.equals(c.getSuit()) && rank==c.getRank());
    
  }

  public int compareTo(Object obj){
    if (!(obj instanceof Card)){return 2718;} //this also shouldn't happen...
    Card compare = (Card) obj;

    int cVal = compare.sortRank();
    int bVal = this.sortRank();

    if (this.equals(compare)){
      return 0;
    }
    else if (cVal < bVal){
      return 1;
    }
    else if (bVal < cVal){
      return -1;
    }
    else{
      return 2718; //this won't happen 
    }

    
  }

  public int sortRank(){
    String s = suit;
    int cardVal = 0;

    if (s.equals("clubs")){
      cardVal = 3;
    }
    else if (s.equals("spades")){
      cardVal = 2;
    }
    else if (s.equals("hearts")){
      cardVal = 1;
    }
    else if (s.equals("diamonds")){
      cardVal = 0;
    }

    return cardVal * 13 + rank;
  }
  public String toString(){
    String f = suit.substring(0,1);
    return f + name + "(" + rank + ")";
  }
}
