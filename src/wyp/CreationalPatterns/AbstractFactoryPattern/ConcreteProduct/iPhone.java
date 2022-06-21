package wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Phone;

public class iPhone implements Phone {
    @Override
    public void powerOn() {
        System.out.println("The iPhone is powered on.");
    }
}
