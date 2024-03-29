import category.Category;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class Product {
    UUID id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer remainingStock;

    private UUID categoryId;

    public Product(UUID id, String name, Double price, Integer stock, Integer remainingStock, UUID categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remainingStock = remainingStock;
        this.categoryId = categoryId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingStock() {
        return remainingStock;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST) {
            if (getCategoryId().toString().equals(category.getId().toString())) {
                return category.getName();
            }
        }
        throw new Exception("Category not found, " + getName());
    }

    public LocalDateTime getDeliveryDueDate() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST) {
            if (getCategoryId().toString().equals(category.getId().toString()))
                return category.findDeliveryTime();
        }
        throw new Exception("Category couldnot find");
    }
}
