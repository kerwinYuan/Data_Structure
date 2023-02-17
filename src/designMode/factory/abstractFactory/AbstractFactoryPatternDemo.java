package designMode.factory.abstractFactory;

import designMode.factory.abstractFactory.color.Color;
import designMode.factory.abstractFactory.factory.AbstractFactory;
import designMode.factory.abstractFactory.factory.FactoryProducer;
import designMode.factory.abstractFactory.shape.Shape;

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
