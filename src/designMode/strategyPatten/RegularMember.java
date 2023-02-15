package designMode.strategyPatten;

import java.math.BigDecimal;

public class RegularMember implements IBill {
    @Override
    public BigDecimal calculator(BigDecimal money) {
        return money;
    }
}
