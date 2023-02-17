package designMode.factory.abstractFactory.factory;

import designMode.factory.abstractFactory.color.Color;
import designMode.factory.abstractFactory.shape.Rectangle;
import designMode.factory.abstractFactory.shape.Shape;

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
