package wyp.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;

import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Pad;
import wyp.CreationalPatterns.AbstractFactoryPattern.AbstractProduct.Phone;

public interface DeviceFactory {
    public Phone producePhone();

    public Pad producePad();
}
