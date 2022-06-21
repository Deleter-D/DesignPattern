package wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Phone;

public class HuaweiPhone implements Phone {
    @Override
    public void powerOn() {
        System.out.println("The Huawei phone is powered on.");
    }
}
