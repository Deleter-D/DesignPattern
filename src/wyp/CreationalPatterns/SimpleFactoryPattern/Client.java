package wyp.CreationalPatterns.SimpleFactoryPattern;

import wyp.CreationalPatterns.SimpleFactoryPattern.Factory.PhoneFactory;
import wyp.CreationalPatterns.SimpleFactoryPattern.Product.Phone;

public class Client {
    public static void main(String[] args) {
        try {
            Phone phone = PhoneFactory.producePhone("boluo");
            phone.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
