package wyp.CreationalPatterns.SimpleFactoryPattern.ConcreteProduct;

import wyp.CreationalPatterns.SimpleFactoryPattern.Product.Phone;

public class Huawei implements Phone {

    @Override
    public void get() {
        System.out.println("Get the Huawei phone.");
    }
}
