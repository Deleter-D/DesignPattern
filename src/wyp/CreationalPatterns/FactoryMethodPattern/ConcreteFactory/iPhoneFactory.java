package wyp.CreationalPatterns.FactoryMethodPattern.ConcreteFactory;

import wyp.CreationalPatterns.FactoryMethodPattern.ConcreteProduct.iPhone;
import wyp.CreationalPatterns.FactoryMethodPattern.Factory.PhoneFactory;
import wyp.CreationalPatterns.FactoryMethodPattern.Product.Phone;

public class iPhoneFactory implements PhoneFactory {
    @Override
    public Phone producePhone() {
        System.out.println("An iPhone have been produced.");
        return new iPhone();
    }
}
