package gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog extends CatalogComponent {

    private List<CatalogComponent> items;
    private String name;

    public ProductCatalog(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        for (CatalogComponent item : items) {
            item.print();
        }
    }
}
