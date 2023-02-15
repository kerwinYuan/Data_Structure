package designMode.strategyPatten;

import java.math.BigDecimal;

public class GoldMember implements IBill {
    @Override
    public BigDecimal calculator(BigDecimal money) {
        return money.multiply(new BigDecimal(0.9)).setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
