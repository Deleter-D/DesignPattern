package wyp.CreationalPatterns.FactoryMethodPattern.ConcreteFactory;

import wyp.CreationalPatterns.FactoryMethodPattern.ConcreteProduct.Huawei;
import wyp.CreationalPatterns.FactoryMethodPattern.Factory.PhoneFactory;
import wyp.CreationalPatterns.FactoryMethodPattern.Product.Phone;

public class HuaweiFactory implements PhoneFactory {
    @Override
    public Phone producePhone() {
        System.out.println("A Huawei phone have been produced.");
        return new Huawei();
    }
}
