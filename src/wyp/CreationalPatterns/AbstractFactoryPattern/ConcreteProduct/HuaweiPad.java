package wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Pad;

public class HuaweiPad implements Pad {
    @Override
    public void powerOn() {
        System.out.println("The Huawei pad is powered on.");
    }
}
