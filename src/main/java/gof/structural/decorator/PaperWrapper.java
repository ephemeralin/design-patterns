package gof.structural.decorator;

/**
 * Concrete Decorator.
 */
public class PaperWrapper extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper";
    }

    @Override
    public double cost() {
        return 2 + flowerBouquet.cost();
    }
}
