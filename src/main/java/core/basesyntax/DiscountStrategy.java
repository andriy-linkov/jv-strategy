package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public static DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        //"Birthday", "Black Friday", "New Year"
        switch (specialEvent) {
            case "Birthday" :
                return new BirthdayDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscountService();
            case "New Year" :
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}