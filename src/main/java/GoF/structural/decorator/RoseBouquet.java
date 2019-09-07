package GoF.structural.decorator;

/**
 * Concrete Component.
 */
public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose bouquet";
    }

    @Override
    public double cost() {
        return 18.0;
    }
}
