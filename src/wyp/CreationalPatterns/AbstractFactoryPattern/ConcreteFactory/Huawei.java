package wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteFactory;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.DeviceFactory;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Pad;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Phone;
import wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct.HuaweiPad;
import wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteProduct.HuaweiPhone;

public class Huawei implements DeviceFactory {
    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Pad producePad() {
        return new HuaweiPad();
    }
}
