package wyp.StructuralPatterns.DecoratorPattern.ConcreteDecorator;

import wyp.StructuralPatterns.DecoratorPattern.Component.Shape;
import wyp.StructuralPatterns.DecoratorPattern.Decorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
