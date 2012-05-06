Card-Deck-Example
=================

For Dropkick. Idea is that since the Deck is just a data structure we just extend one of Java's list classes, but since one day you might want to use a list other than ArrayList all Decks implement an Interface which consists of the standard List interface + whatever else, and then subclasses implement the list part of that by extending ArrayList or LinkedList and do the deck bit themselves.

Yes, I overcomplicate things. :(
