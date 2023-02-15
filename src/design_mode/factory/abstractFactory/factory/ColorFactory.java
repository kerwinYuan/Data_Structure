package design_mode.factory.abstractFactory.factory;

import design_mode.factory.abstractFactory.color.Blue;
import design_mode.factory.abstractFactory.color.Color;
import design_mode.factory.abstractFactory.color.Red;
import design_mode.factory.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }else if(color.equals("Red")){
            return new Red();
        }else if(color.equals("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
