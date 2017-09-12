import java.util.Random;
import ch06.lists.*;

public class Player {

    private String name;
    private List2<Card> hand = new List2<Card>();
    private Random rand = new Random();

    public Player(String aName){

    }
    public String toString(){
	// display player name and the content of their hand 
	{
		String s = name + "\n";
		return s + hand.toString();
	}

   public String getName(){
	  
	   return name;

    }
    
    public boolean equals(Object p)
    // Players are equal if they have the same name
    { 
      if( p instanceof Player)
      {
		  Player Tw = (Player)p;
		  if(this.name == TW.name)
			{
				return true;
			   }
				else
				  {
					 return false; // 2nd if statement
				    }
				}else
				{ return false; // if not an instance of player
			}
		}
	}
					
	
   
    public int getHandSize() {
//report how many cards the player has in their hand
	return this.hand.size(); 
	
	
    }

    public void addCard(Card c){
//insert card c into the player's hand
	  this.hand.add(c);
	  return;
    }
    
    public Card getCard(int i){
		//return the card in the ith position in the hand
    	return this.hand.getAtIndex(i);
    }
    
    public void DiscardDup()
    {
    // delete all the pairs in the player's hand -- there could be two pairs of a kind
	    List2<Card> temphand = hand;
		 temphand.reset();
		  for(int k = 0; k < temphand.size(); k++)
			{
				Card temp = temphand.getNext();
				  if(temphand.count(temp)==2||temphand.count(temp)==3) // 2 or 3 of the same
				   { 
					 hand.removePairs(temp);
				      }
					   else if(temphand.count(temp)==4) // if there is four of the same kind
					     {
						  hand.removePairs(temp);
						   hand.removePairs(temp);
					   }
				   }
			   }
		   
			 
		 
		
		 
      //this.hand.clear(); intital thought
}
    
    
    public void playOneTurn(Player p){
    	// the current player finds out how many cards the opponent has and selects a random location
    	// and asks for that card from the other player
    	// that card is added to the player's hand and then the player checks if that made a pair
    	// the pair is removed if necessary
    	Card newcard = p.getCard(rand.nextInt(p.getHandSize()));
		 hand.add(newcard);
		  System.out.print(newcard);
		    DiscardDup();
	}

	
    
    
    public boolean hasCardLeft(){
	// returns true or false depending on whether the player still has some cards left in the hand 
	if(this.hand == null)
	{
		return true;
	   }
		else
		   { 
			 return false;
		     }
       }



    public static void main(String[] arg){
	Player p1 = new Player("Bobby");
	p1.addCard(new Card(6,1));
	p1.addCard(new Card(6,2));
	p1.addCard(new Card(7,2));
	p1.addCard(new Card(8,3));
	p1.addCard(new Card(11,1));
	p1.addCard(new Card(1,2));
	p1.addCard(new Card(8,1));
	p1.addCard(new Card(8,2));
	System.out.println(p1);
	p1.DiscardDup();
	System.out.println(p1);
	Player p2 = new Player("Susie");
	p2.addCard(new Card(13,4));
	p2.addCard(new Card(12,2));
	p2.addCard(new Card(7,4));
	p2.addCard(new Card(11,4));
	p2.addCard(new Card(8,4));
	p2.addCard(new Card(10,4));
	System.out.println(p2);
	p1.playOneTurn(p2);
	System.out.println(p1);
	System.out.println(p2);
	p2.playOneTurn(p1);
	System.out.println(p1);
	System.out.println(p2);
	
    }
}
