package wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteFactory;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.DeviceFactory;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Pad;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Phone;
import wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct.iPad;
import wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct.iPhone;

public class Apple implements DeviceFactory {
    @Override
    public Phone producePhone() {
        return new iPhone();
    }

    @Override
    public Pad producePad() {
        return new iPad();
    }
}
