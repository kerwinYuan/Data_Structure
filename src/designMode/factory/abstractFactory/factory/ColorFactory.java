package designMode.factory.abstractFactory.factory;

import designMode.factory.abstractFactory.color.Blue;
import designMode.factory.abstractFactory.color.Color;
import designMode.factory.abstractFactory.color.Red;
import designMode.factory.abstractFactory.shape.Shape;

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
