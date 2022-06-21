package wyp.CreationalPatterns.AbstractFactoryPattern;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.DeviceFactory;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Pad;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Phone;
import wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteFactory.Apple;
import wyp.CreationalPatterns.AbstractFactoryPattern.ConcreteFactory.Huawei;

public class Client {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new Apple();
        Phone phone = deviceFactory.producePhone();
        phone.powerOn();
        Pad pad = deviceFactory.producePad();
        pad.powerOn();

        deviceFactory = new Huawei();
        Phone phone1 = deviceFactory.producePhone();
        phone1.powerOn();
        Pad pad1 = deviceFactory.producePad();
        pad1.powerOn();
    }
}
