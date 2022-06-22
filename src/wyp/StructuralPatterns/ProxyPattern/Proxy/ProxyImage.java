package wyp.StructuralPatterns.ProxyPattern.Proxy;

import wyp.StructuralPatterns.ProxyPattern.RealSubject.RealImage;
import wyp.StructuralPatterns.ProxyPattern.Subject.Image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
