package wyp.StructuralPatterns.DecoratorPattern.Decorator;

import wyp.StructuralPatterns.DecoratorPattern.Component.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
