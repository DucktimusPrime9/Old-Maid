import ch06.lists.*;

public class List2<T> extends ArrayUnsortedList<T> {
  
    public List2(){
	super();}
 
    public List2(int origCap){
	super(origCap);
    }

    public int count(T element){
	// returns the number of items in the list which equal element
    }
	int count = 0;
	for(int k = 0; k< numElements; k++)
	{
          if(list[k].equals(element))
	   {
             count++;
              }
              return count;
            }
    
    
    public void removePairs(T element){
// remove any pairs that equal element
    if(count(element) >= 2)
    { 
      remove(element);
      remove(element);
     }
	
    }
    
    public T getAtIndex(int index)
    	//if index does not correspond to item in the list throws IndexOutOfBoundsException
    	// else remove and return the item at location index
    	// since unordered, just replace the item with the last one and decrement the number of elements
    { 
	if(numElements <= index)||(index >= numElements))
	  { 
          throws new IndexOutBoundsException("index does not correspond to item");
              { 
		        T temp = list[index];
		        list[index] = list[numElements-1]; // this will go back to the previous index
		        numElements--;
		        return temp; // returns result 
  }
}
}
      
         

    public static void main(String[] arg){
	List2<Card> myList = new List2<Card>();
	myList.add(new Card(6,2));
	myList.add(new Card(6,4));
	myList.add(new Card(6,1));
	myList.add(new Card(7,2));
	myList.add(new Card(10,2));
	System.out.println(myList);
	System.out.println(myList.count(new Card(6,3)));
	myList.removePairs(new Card(6,3));
//add some testing with the queens so that the queen of spades is not removed
	System.out.println(myList);
    }
}
