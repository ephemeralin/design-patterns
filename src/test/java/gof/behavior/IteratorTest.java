package gof.behavior;

import gof.behavior.iterator.Item;
import gof.behavior.iterator.ItemAggregate;
import gof.behavior.iterator.ItemAggregateImpl;
import gof.behavior.iterator.ItemIterator;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class IteratorTest {

    @Test
    public void ItemAggregateTest() {
        Item item1 = new Item("bread", "food");
        Item item2 = new Item("egg", "food");
        Item item3 = new Item("milk", "food");

        ItemAggregate itemAggregate = new ItemAggregateImpl();
        itemAggregate.addItem(item1);
        itemAggregate.addItem(item2);
        itemAggregate.addItem(item3);

        ItemIterator itemIterator = itemAggregate.getItemIterator();

        assertFalse(itemIterator.isLastItem());
        assertThat(itemIterator.nextItem().getItemName(), is("bread"));
        assertThat(itemIterator.nextItem().getItemName(), is("egg"));
        assertThat(itemIterator.nextItem().getItemName(), is("milk"));
        assertTrue(itemIterator.isLastItem());

        while (!itemIterator.isLastItem()) {
            Item item = itemIterator.nextItem();
            System.out.println(item.getItemType() + " : " + item.getItemName());
        }
    }
}
