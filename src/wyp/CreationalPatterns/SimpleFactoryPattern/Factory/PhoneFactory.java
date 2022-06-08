package wyp.CreationalPatterns.SimpleFactoryPattern.Factory;

import wyp.CreationalPatterns.SimpleFactoryPattern.ConcreteProduct.Huawei;
import wyp.CreationalPatterns.SimpleFactoryPattern.Product.Phone;
import wyp.CreationalPatterns.SimpleFactoryPattern.ConcreteProduct.iPhone;

public class PhoneFactory {
    public static Phone producePhone(String brand) throws Exception {
        if (brand.equalsIgnoreCase("Huawei")) {
            System.out.println("A Huawei phone have been produced.");
            return new Huawei();
        } else if (brand.equalsIgnoreCase("iPhone")) {
            System.out.println("An iPhone have been produced.");
            return new iPhone();
        } else {
            throw new Exception("Sorry,the product of this brand can not be produced.");
        }
    }
}
