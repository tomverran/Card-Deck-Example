/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deckdesign;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tom
 */
public class ArrayDeck<E> extends ArrayList<E> implements DeckInterface<E> {
    
    public ArrayDeck(List stuff)
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
