import java.util.Random;

public class Deck {
    private Card[] deck = new Card[51]; // number of cards in deck
    private int index = 0;  //next card to be deal
    private Random rand = new Random();

    public Deck() {
	// construct a deck containing all the cards except the Queen of Clubs
     for(int i = 0; i< 50; i++)
     {
		deck[i] = new Card(i%13+1 , i/13+1);
        }
        deck[50] = new Card(13 , 4);
           }
    

    public void shuffle(){
	//shuffle all the cards and set the index to 0
    int randLoc; // random location in card deck
    int temp; // for swap of cards
    for(int i = (51 - 1); i > 0; i--)
	 { 
		randLoc = rand.nextInt(i); // random int b/w 0 and i
		temp = deck[randLoc];
		deck[randLoc] = deck[i];
		deck[i] = temp;
	     }
	      index = 0; 
             }
    

    public Card deal()
    {// if there are any more cards left in the deck, return the next one and increment index
    //return null when all the cards have been dealt
    while(hasMoreCards())
	{
		index++;
		return deck(location);
	}
	
	return null;
    }
   


    public boolean hasMoreCards(){
	//return true if there are more cards left in the deck, else false
	return (index != 51);
    }

    public static void main(String[] args){
	Deck myDeck = new Deck();
	    myDeck.shuffle();
	    while (myDeck.hasMoreCards())
			System.out.println(myDeck.deal());
    }
   }
