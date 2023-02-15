package design_mode.factory.abstractFactory.factory;

import design_mode.factory.abstractFactory.color.Color;
import design_mode.factory.abstractFactory.color.Red;
import design_mode.factory.abstractFactory.shape.Rectangle;
import design_mode.factory.abstractFactory.shape.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }else if(shape.equals("Rectangle")){
            return new Rectangle();
        }else if(shape.equals("square")){
            return new Rectangle();
        }
        return null;
    }
}
