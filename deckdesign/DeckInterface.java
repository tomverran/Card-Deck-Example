package deckdesign;
import java.util.List;
/**
 * So since we're extending list we're forcing subclasses
 * to implement a whole bunch of List methods that we might like, but then
 * also adding our more card game specific stuff on top.
 * 
 * @author Tom
 */
public interface DeckInterface<E> extends List<E>
{    
    public DeckInterface getFromTop(int numberToGet);
    public DeckInterface getFromBottom(int numberToGet);   
}
