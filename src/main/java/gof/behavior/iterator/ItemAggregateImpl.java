package gof.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ItemAggregateImpl implements ItemAggregate {

    List itemList;

    public ItemAggregateImpl() {
        this.itemList = new ArrayList();
    }

    @Override
    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public void removeItem(Item item) {
        itemList.remove(item);
    }

    @Override
    public ItemIterator getItemIterator() {
        return new ItemIteratorImpl(itemList);
    }
}
