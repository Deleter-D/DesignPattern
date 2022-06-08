package wyp.CreationalPatterns.FactoryMethodPattern.ConcreteProduct;

import wyp.CreationalPatterns.FactoryMethodPattern.Product.Phone;

public class iPhone implements Phone {
    @Override
    public void get() {
        System.out.println("Get the iPhone.");
    }
}
