package wyp.StructuralPatterns.ProxyPattern;

import wyp.StructuralPatterns.ProxyPattern.Proxy.ProxyImage;

public class Client {
    public static void main(String[] args) {
        // 此时还没有从硬盘读取真正的图片
        ProxyImage proxyImage = new ProxyImage("test_image.jpg");
        // 只有调用真实图片对象的方法时，才由代理图片创建真实图片对象，并调用该方法
        proxyImage.display();
        System.out.println("Display it again.");
        // 再次调用时无需从硬盘中重复读取
        proxyImage.display();
    }
}
