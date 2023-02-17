package designMode.template;

public class TemplateMode {

    /**
     * 模板设计模式主要通过抽象类实现方法的定义与处理过程，将处理细节抽象为抽象方法由子类去实现
     * 优点：1.公共逻辑抽取，增大代码使用率 2.父类控制行为，子类实现方法细节 3. 易扩展
     * 缺点：每新增一个子类就需要对应完成子方法的编写，项目体积会越来越大
     * */
    public static void main(String[] args) {
        AbstractFiredChicken mcDonald = new McDonald();
        AbstractFiredChicken kfc = new KFC();
        mcDonald.makeFirdChicken();
        kfc.makeFirdChicken();
    }
}
