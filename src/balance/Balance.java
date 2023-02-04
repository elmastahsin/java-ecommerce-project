package balance;

import java.util.UUID;

public abstract class Balance {
    UUID customerId;
    private Double balance;

    public Balance(UUID customerId, Double balance) {
        this.customerId = customerId;
        this.balance = balance;
    }
public abstract Double addBalance(Double additionalBalance);



    public void setBalance(Double balanace) {
        this.balance = balanace;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public Double getBalance() {
        return balance;
    }
}
