package design_mode.factory.abstractFactory;

import design_mode.factory.abstractFactory.color.Color;
import design_mode.factory.abstractFactory.factory.AbstractFactory;
import design_mode.factory.abstractFactory.factory.FactoryProducer;
import design_mode.factory.abstractFactory.shape.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Shape shape1 = shapeFactory.getShape("square");
        Color color1 = colorFactory.getColor("Red");
        shape1.draw();
        color1.fill();
    }
}
