package wyp.StructuralPatterns.DecoratorPattern;

import wyp.StructuralPatterns.DecoratorPattern.Component.Shape;
import wyp.StructuralPatterns.DecoratorPattern.ConcreteComponent.Circle;
import wyp.StructuralPatterns.DecoratorPattern.ConcreteComponent.Rectangle;
import wyp.StructuralPatterns.DecoratorPattern.ConcreteDecorator.RedShapeDecorator;
import wyp.StructuralPatterns.DecoratorPattern.Decorator.ShapeDecorator;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        System.out.println("Current state of shape: ");
        circle.draw();
        rectangle.draw();

        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        System.out.println("\nCurrent state of shape: ");
        redCircle.draw();
        redRectangle.draw();
    }
}
