package designMode.factory.abstractFactory.factory;

import designMode.factory.abstractFactory.shape.Shape;
import designMode.factory.abstractFactory.color.Color;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
