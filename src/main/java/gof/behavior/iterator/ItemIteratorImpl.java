package gof.behavior.iterator;

import java.util.List;

public class ItemIteratorImpl implements ItemIterator {

    public List itemList;
    int position;
    Item item;

    public ItemIteratorImpl(List itemList) {
        this.itemList = itemList;
    }

    @Override
    public Item nextItem() {
        System.out.println("Returning item at Position: "+position);
        item = (Item) itemList.get(position);
        position++;
        return item;
    }

    @Override
    public boolean isLastItem() {
        if (position < itemList.size()) {
            return false;
        }
        return true;
    }
}
