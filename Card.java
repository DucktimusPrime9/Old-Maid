// Guadalupe Delgado
// This program is the java version of Old maid
// I spent alot of time on this project. I have some errors I couldn't figure out. The only person I asked for help this time was Han
// There were a few methods I was underthinking, or being to literal about so she gave me a few pointers on how I should think about
//writing the code. I did this mostly all by my self.

public class Card {
    private int rank;
    private int suit;

    public Card (int r, int s){  // 1 to 13 for rank ; 1 to 4 for Hearts Spades Diamonds and Clubs
	rank = r;
	suit = s;
    }
    public String toString() {
	// returns a string like "Ace of Hearts"
	String s  = " ";
        switch(rank)
	{
        case 1:
	    s = s + " Ace";
	    break;
	case 2:
	    s = s + "2";
	    break;
	case 3:
	    s = s + "3";
            break;
        case 4:
	    s = s + "4";
            break;
        case 5: 
	    s = s + "5";
	      break;
        case 6: 
	    s = s + "6";
	     break;
        case 7:
	    s = s + "7";
            break;
        case 8: 
            s = s + "8";
            break;
        case 9:
            s = s + "9";
            break;
        case 10:
            s = s + "10";
	    break;
        case 11:
            s = s + "11";
	    break;
        case 12:
	    s = s + "12";
	    break;
        case 13:
	    s = s + "13";
	  break;
	  switch(suit)
	  {
        case 1: 
            s = s + "Hearts";
	    break;
        case 2:
	    s = s + "Spades";
            break;
        case 3:
	    s = s + "Diamons";
	    break;
	case 4:
	    s = s + "Clubs";
            break; 
		}
	}
}

 
		
		

    public boolean equals(Object c) 
    	//this will be used for finding pairs to discard
		//the Queen of spades should not equal any other card, others are equal if they have the same rank
	   {
		if(c instanceof Card)
		{
		   Card card = (Card) c;
			{
			 if(this.rank == 12 && this.suit == 2 || card.rank == 12 && card.suit == 2)
			   return false;
			   else
				return(c.rank == this.rank );
				
			}
		}
	}
}
	

  



		 
		
			
   

    public static void main(String[] arg) {
    	//you may hae to adjust if your repreentation is different
	Card c1 = new Card(6,1);
	Card c2 = new Card(6,3);
	Card c3 = new Card(12,3);
	Card c4 = new Card(12,2);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c3.equals(c4));
	System.out.println(c4.equals(c3));
	System.out.println(c1.equals(c2));
	
    }
  }
 }
}
}




