package wyp.StructuralPatterns.DecoratorPattern.ConcreteComponent;

import wyp.StructuralPatterns.DecoratorPattern.Component.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
