package com.restaurant.model.menu;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

@Entity
public class MenuItem {

    @EmbeddedId
    private MenuItemId id;

    @Column(nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "main_menu_restaurant_id", referencedColumnName = "restaurant_id", insertable = false, updatable = false),
        @JoinColumn(name = "main_menu_name", referencedColumnName = "name", insertable = false, updatable = false)
    })
    private MainMenu mainMenu;

    // Constructors, Getters, and Setters
    public MenuItem() {
        this.id = new MenuItemId();
    }

    public MenuItem(MenuItemId id, double price, MainMenu mainMenu) {
        this.id = id;
        this.price = price;
        this.mainMenu = mainMenu;
    }

    public MenuItemId getId() {
        return id;
    }

    public void setId(MenuItemId id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
}
