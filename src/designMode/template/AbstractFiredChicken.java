package designMode.template;

public abstract class AbstractFiredChicken {
    public void makeFirdChicken(){
        bread();
        slaughter();
        fired();
    }

    public abstract void bread();

    public abstract void slaughter();

    public abstract void fired();
}
