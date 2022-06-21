package wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Pad;

public class iPad implements Pad {
    @Override
    public void powerOn() {
        System.out.println("The iPad is powered on.");
    }
}
