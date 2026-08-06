package assignment2;

import java.util.Collections;
import java.util.List;

public class Category {
    private String name;
    private List<Category> subCategories;

    public Category(String name, List<Category> subCategories) {
        this.name = name;
        this.subCategories = subCategories != null ? subCategories : Collections.emptyList();
    }

    public String getName() { return name; }
    public List<Category> getSubCategories() { return subCategories; }
}
