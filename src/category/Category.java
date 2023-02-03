package category;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Category {
    UUID id;
    private String Name;

    public Category(UUID id, String name) {
        this.id = id;
        Name = name;
    }
    public abstract LocalDate calculateDeliveryTime();

}
