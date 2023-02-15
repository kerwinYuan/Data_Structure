package designMode.strategyPatten;

import java.math.BigDecimal;

/**
 * 策略模式 主要实现是通过接口定义多个类共同需要实现的方法 各个子类自己维护对应的细节逻辑
 * 优点是可以减少代码中的if else判断语句
 * 缺点是 一方面需要知道所有实现类实现的功能 另一方面如果实现方式太多也会增加维护成本
 * 在JDK中线程池的拒绝策略就是使用了策略模式，compareTo方法中的排序算法也是策略模式
 * */
public class StrategyPatten {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal(100);
        RegularMember regularMember = new RegularMember();
        GoldMember goldMember = new GoldMember();
        PlatinumMember platinumMember = new PlatinumMember();
        System.out.println(regularMember.calculator(money));
        System.out.println(goldMember.calculator(money));
        System.out.println(platinumMember.calculator(money));
    }
}
