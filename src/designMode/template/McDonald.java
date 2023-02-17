package designMode.template;

public class McDonald extends AbstractFiredChicken {
    @Override
    public void bread() {
        System.out.println("McDonald bread");
    }

    @Override
    public void slaughter() {
        System.out.println("McDonald slaughter");
    }

    @Override
    public void fired() {
        System.out.println("McDonald fired");
    }
}
