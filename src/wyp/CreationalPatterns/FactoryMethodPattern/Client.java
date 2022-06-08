package wyp.CreationalPatterns.FactoryMethodPattern;

import wyp.CreationalPatterns.FactoryMethodPattern.ConcreteFactory.HuaweiFactory;
import wyp.CreationalPatterns.FactoryMethodPattern.ConcreteFactory.iPhoneFactory;
import wyp.CreationalPatterns.FactoryMethodPattern.Product.Phone;

public class Client {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Phone phone1 = huaweiFactory.producePhone();
        phone1.get();

        iPhoneFactory iPhoneFactory = new iPhoneFactory();
        Phone phone2 = iPhoneFactory.producePhone();
        phone2.get();
    }
}
