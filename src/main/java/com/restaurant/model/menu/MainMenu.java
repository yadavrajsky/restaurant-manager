package com.restaurant.model.menu;

import java.util.List;

import com.restaurant.model.Restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class MainMenu {
    
    @EmbeddedId
    private MainMenuId id;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", insertable = false, updatable = false)
    private Restaurant restaurant;

    @OneToMany(mappedBy = "mainMenu", fetch = FetchType.LAZY)
    private List<MenuItem> menuItems;


    // Constructors, Getters, and Setters
    // Constructor
    public MainMenu() {
        this.id = new MainMenuId();
    }

    // Getters and Setters
    public MainMenuId getId() {
        return id;
    }

    public void setId(MainMenuId id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public String getName() {
        return id.getName();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
