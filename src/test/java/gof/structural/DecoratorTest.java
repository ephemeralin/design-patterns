package gof.structural;

import gof.structural.decorator.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DecoratorTest {

    @Test
    public void roseBouquetWithNoDecorationsTest() {
        FlowerBouquet roseBouquet = new RoseBouquet();
        assertThat(roseBouquet.getDescription(), is("Rose bouquet"));
        assertThat(roseBouquet.cost(), is(18.0));
    }

    @Test
    public void roseBouquetWithPaperWrapperAndRibbonBowAndGlitterTest() {
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);

        assertThat(decoratedRoseBouquet.getDescription(), is("Rose bouquet, paper, ribbon bow, glitter"));
        assertThat(decoratedRoseBouquet.cost(), is(30.5));
    }

    @Test
    public void orchidBouquetWithDoublePaperWrapperAndRibbonBowTest() {
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);

        assertThat(decoratedOrchidBouquet.getDescription(), is("Orchid bouquet, paper, paper, ribbon bow"));
        assertThat(decoratedOrchidBouquet.cost(), is(41.5));
    }
}
