package gof.structural;

import gof.structural.composite.Product;
import gof.structural.composite.ProductCatalog;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void CatalogTest() {
        Product product1 = new Product("Soccer Jersey", 60.5);
        Product product2 = new Product("Slacks", 83.0);
        ProductCatalog menCatalog = new ProductCatalog("Men's clothes");
        menCatalog.add(product1);
        menCatalog.add(product2);

        Product product3 = new Product("Patterned Shirt", 110.0);
        Product product4 = new Product("White Blouse", 52.5);
        ProductCatalog womenCatalog = new ProductCatalog("Women's clothes");
        womenCatalog.add(product3);
        womenCatalog.add(product4);

        Product product5 = new Product("Bag", 0.5);

        ProductCatalog shopCatalog = new ProductCatalog("Shop Catalog");
        shopCatalog.add(menCatalog);
        shopCatalog.add(womenCatalog);
        shopCatalog.add(product5);

        shopCatalog.print();
    }
}