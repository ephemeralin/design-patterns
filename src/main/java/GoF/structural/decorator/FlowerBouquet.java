package GoF.structural.decorator;

/**
 * Component.
 */
public abstract class FlowerBouquet {

    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
