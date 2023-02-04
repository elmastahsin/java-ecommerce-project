package discount;

import java.util.UUID;

public class RateBasedDiscount extends Discount{
    public RateBasedDiscount(UUID id, String name, Double thresholdAmount) {
        super(id, name, thresholdAmount);
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }
}
