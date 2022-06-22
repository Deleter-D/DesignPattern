package wyp.StructuralPatterns.DecoratorPattern.ConcreteComponent;

import wyp.StructuralPatterns.DecoratorPattern.Component.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
