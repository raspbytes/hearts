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

  public String getRank(){
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
    return ((name.equals(c.getName()) && (suit.equals(c.getSuit())) && rank.equals(c.getRank()));
    
  }

  public int compareTo(Object obj){
    Card c = (Card) obj;
    //String compareS = c.getSuit();
    //String baseS = suit;

    int compareR = c.getRank();
    int baseR = rank;

    Card greatest;
    int compareV = c.findVal();
    int baseV = cardVal; //implement aughgahgahuguyhghu
    

    if (equals(obj)){
      return 0;
    }
    else if (compare.equals(base)){
      if (compareR<baseR){
        return 1;
      }
      else if (baseR<compareR){
        return -1;
      }
    }
    else{
      if(compareV<baseV){
        return 1;
      }
      else if(baseV<compareV){
        return -1;
      }
    }
  }

  public int findVal(){
    String s = suit;
    int cardVal = 0;

    if (s.equals("clubs")){
      cardVal = 4;
    }
    else if (s.equals("spades")){
      cardVal = 3;
    }
    else if (s.equals("hearts")){
      cardVal = 2;
    }
    else if (s.equals("diamonds")){
      cardVal = 1;
    }

    return cardVal;
  }
}/**
 * TODO: Implement the `Card` class which represents a playing card.
 * The card has a name (e.g., Ace, King), a suit (e.g., hearts, spades), 
 * and a value (e.g., 0-12 for ranks). 
 * It also provides methods to compare cards, calculate their rank in a deck, and more.
 * 
 * TODO: Add meaningful test cases for each method in this class.
 */

/**
 * TODO: Create a default constructor that initializes the card 
 * to default values for name, suit, and value.
 */

/**
 * TODO: Create a parameterized constructor that initializes the card 
 * with the given name, suit, and value.
 * 
 * @param name The name of the card (e.g., "Ace", "King").
 * @param suit The suit of the card (e.g., "hearts", "clubs").
 * @param value The value of the card (e.g., 0-12 for ranks).
 */

/**
 * TODO: Write a getter method to retrieve the name of the card.
 * 
 * @return The name of the card.
 */

/**
 * TODO: Write a getter method to retrieve the suit of the card.
 * 
 * @return The suit of the card.
 */

/**
 * TODO: Write a getter method to retrieve the value of the card.
 * 
 * @return The value of the card.
 */

/**
 * TODO: Write a setter method to update the name of the card.
 * 
 * @param name The new name for the card.
 */

/**
 * TODO: Write a setter method to update the suit of the card.
 * 
 * @param suit The new suit for the card.
 */

/**
 * TODO: Write a setter method to update the value of the card.
 * 
 * @param value The new value for the card.
 */

/**
 * TODO: Implement the `sortRank` method to calculate a unique rank for each card
 * in a deck based on its suit and value. 
 * (E.g., clubs are ranked highest, followed by spades, hearts, and diamonds).
 * 
 * @return An integer representing the card's rank in a sorted deck.
 */

/**
 * TODO: Override the `compareTo` method to allow comparing two cards 
 * based on their sortRank values.
 * 
 * @param obj The object to compare this card against.
 * @return -1 if this card is ranked lower, 1 if ranked higher, and 0 if equal.
 */

/**
 * TODO: Override the `equals` method to compare two cards 
 * for equality based on their suit and value.
 * 
 * @param obj The object to compare this card against.
 * @return True if the cards have the same suit and value, otherwise false.
 */

/**
 * TODO: Override the `toString` method to return a string representation of the card.
 * Format the string as the first letter of the suit followed by the name and value 
 * (e.g., "H2(1)" for the 2 of hearts with a value of 1).
 * 
 * @return A string representation of the card.
 */
