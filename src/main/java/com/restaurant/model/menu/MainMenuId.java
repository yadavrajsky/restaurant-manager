package com.restaurant.model.menu;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MainMenuId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "restaurant_id")
    private UUID restaurantId;

    @Column(nullable = false)
    private String name;

    // Constructors, Getters, and Setters
    // Constructors
    public MainMenuId() {
    }

    public MainMenuId(UUID restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
    }

    // Getters and Setters
    public UUID getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(UUID restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
