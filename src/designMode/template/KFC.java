package designMode.template;

public class KFC extends AbstractFiredChicken {
    @Override
    public void bread() {
        System.out.println("KFC bread");
    }

    @Override
    public void slaughter() {
        System.out.println("KFC slaughter");
    }

    @Override
    public void fired() {
        System.out.println("KFC fired");
    }
}
