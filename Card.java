
package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;
  private int rank,suit;
  private boolean faceUp;
  

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
    this.rank=rank;
    this.suit=suit;
    this.faceUp=faceUp;
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
      return faceUp==true;
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    this.faceUp=faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
   if(rank>=2 &&rank<=10){
   }
   if(rank==11||rank==12||rank==13){
       rank=10;
       if(rank==14){
           rank=1;
       }
   }
  return rank;
  }

  /**
   * @return the suit
   */
  public int getSuit() {
      switch (suit) {
          case 0:
              suit=CLUB;
              break;
          case 1:
              suit=DIAMOND;
              break;
          case 2:
              suit=HEART;
              break;
          case 3:
              suit=SPADE;
              break;
          default:
              break;
      }
   return suit;
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
      return rank==c.rank && suit==c.suit;
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
      int x;
      if(rank>c.rank){
        x=+1;
    }else if(rank<c.rank){
        x=-1;
        }else{
             if(suit>c.suit){
                 x=+1;
             }else if(suit<c.suit){
                x=-1;
             }else{
                      x=0;
                         }
                           }
  return x;
  }
  


  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
    String waleed=null;
      switch(rank){
            case 2:
                waleed="2";
                break;
            case 3:
                waleed="3";
                break;
            case 4:
                waleed="4";
                break;
            case 5:
                waleed="5";
                break;
            case 6:
                waleed="6";
                break;
            case 7:
                waleed="7";
                break;
            case 8:
                waleed="8";
                break;
            case 9:
                waleed="9";
                break;
            case 10:
                waleed="10";
                break;
            case 11:
                waleed="Jack";
                break;
            case 12:
                waleed="Queen";
                break;
            case 13:
                waleed="King";
                break;
            case 14:
                waleed="Ace";
                break;
            default:    
                break;
            
            
    }
    return waleed;
  
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
    String waleed=null;
      switch(rank){
            case 0:
                waleed="Clubs";
                break;
            case 1:
                waleed="Diamonds";
                break;
            case 2:
                waleed="Hearts";
                break;
            case 3:
                waleed="Spades";
                break; //FIX THIS
  }
  return waleed;
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
      if(isFaceUp()==false){
          return "?";
      }else{
      return "The rank of the card is: "+rank+" and the suit is: "+suit;
      }

  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
