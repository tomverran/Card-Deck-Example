package deckdesign;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Tom
 */
public class LinkedDeck<E> extends LinkedList<E> implements DeckInterface<E> {
    
    public LinkedDeck(List stuff)
    {
        super(stuff);
    }
    
    @Override
    public DeckInterface getFromBottom(int numberToGet)
    {
        int s = this.size();
        return new ArrayDeck(this.subList(s-numberToGet, s-1));
    }
    
    @Override
    public DeckInterface getFromTop(int numberToGet)
    {
        return new ArrayDeck(this.subList(0, numberToGet));
    }
     
    
}
