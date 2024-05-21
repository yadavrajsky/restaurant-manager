package com.restaurant;

import com.restaurant.model.Restaurant;
import com.restaurant.model.menu.MainMenu;
import com.restaurant.model.menu.MainMenuId;
import com.restaurant.model.menu.MenuItem;
import com.restaurant.model.menu.MenuItemId;
import com.restaurant.service.implementations.MainMenuServiceImpl;
import com.restaurant.service.implementations.MenuItemServiceImpl;
import com.restaurant.service.implementations.RestaurantServiceImpl;
import com.restaurant.service.interfaces.MainMenuService;
import com.restaurant.service.interfaces.MenuItemService;
import com.restaurant.service.interfaces.RestaurantService;

public class MainApp {

    public static void main(String[] args) {
        // Initialize services
        RestaurantService restaurantService = new RestaurantServiceImpl();
        MainMenuService mainMenuService = new MainMenuServiceImpl();
        MenuItemService menuItemService = new MenuItemServiceImpl();

        // Create a new restaurant
        Restaurant restaurant = new Restaurant("Delicious Flavour", "123 Main St", true);
        restaurantService.registerRestaurant(restaurant);

        // Create a main menu for the restaurant
        MainMenu mainMenu = new MainMenu();
        mainMenu.setDescription("Our main menu offerings");

        // Create a main menu id
        MainMenuId mainMenuId = new MainMenuId(restaurant.getId(), "Beverages");
        // Assign main menu id to the main menu
        mainMenu.setId(mainMenuId);
        // Save the main menu
        mainMenuService.registerMainMenu(mainMenu);

        // Create MenuItem Id
        MenuItemId menuItemId = new MenuItemId(mainMenuId.getRestaurantId(), mainMenuId.getName(), "Coffee");
        // Assign to menu item
        MenuItem menuItem = new MenuItem(menuItemId, 50, mainMenu);
        // Save the menu item
        menuItemService.registerMenuItem(menuItem);


    }
}
