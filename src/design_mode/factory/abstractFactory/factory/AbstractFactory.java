package design_mode.factory.abstractFactory.factory;

import design_mode.factory.abstractFactory.color.Color;
import design_mode.factory.abstractFactory.shape.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
