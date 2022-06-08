package wyp.CreationalPatterns.SimpleFactoryPattern.ConcreteProduct;

import wyp.CreationalPatterns.SimpleFactoryPattern.Product.Phone;

public class iPhone implements Phone {
    public void get() {
        System.out.println("Get the iPhone.");
    }
}
