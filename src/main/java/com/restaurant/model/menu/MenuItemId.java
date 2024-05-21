package com.restaurant.model.menu;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MenuItemId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "main_menu_restaurant_id")
    private UUID mainMenuRestaurantId;

    @Column(name = "main_menu_name")
    private String mainMenuName;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    // Constructors, Getters, and Setters
    public MenuItemId() {
    }

    public MenuItemId(UUID mainMenuRestaurantId, String mainMenuName, String itemName) {
        this.mainMenuRestaurantId = mainMenuRestaurantId;
        this.mainMenuName = mainMenuName;
        this.itemName = itemName;
    }

    public UUID getMainMenuRestaurantId() {
        return mainMenuRestaurantId;
    }

    public void setMainMenuRestaurantId(UUID mainMenuRestaurantId) {
        this.mainMenuRestaurantId = mainMenuRestaurantId;
    }

    public String getMainMenuName() {
        return mainMenuName;
    }

    public void setMainMenuName(String mainMenuName) {
        this.mainMenuName = mainMenuName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItemId that = (MenuItemId) o;

        if (!mainMenuRestaurantId.equals(that.mainMenuRestaurantId)) return false;
        if (!mainMenuName.equals(that.mainMenuName)) return false;
        return itemName.equals(that.itemName);
    }

    @Override
    public int hashCode() {
        int result = mainMenuRestaurantId.hashCode();
        result = 31 * result + mainMenuName.hashCode();
        result = 31 * result + itemName.hashCode();
        return result;
    }
}
