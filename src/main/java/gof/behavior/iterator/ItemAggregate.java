package gof.behavior.iterator;

public interface ItemAggregate {

    void addItem(Item item);
    void removeItem(Item item);
    ItemIterator getItemIterator();
}
