package discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{
    public AmountBasedDiscount(UUID id, String name, Double thresholdAmount) {
        super(id, name, thresholdAmount);
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }
}
