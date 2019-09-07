package GoF.structural.decorator;

/**
 * Concrete Component.
 */
public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid bouquet";
    }

    @Override
    public double cost() {
        return 31.0;
    }
}
