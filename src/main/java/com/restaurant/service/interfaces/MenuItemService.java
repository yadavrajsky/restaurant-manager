package com.restaurant.service.interfaces;

import java.util.List;

import com.restaurant.model.menu.MenuItem;

public interface MenuItemService {
    void registerMenuItem(MenuItem menuItem);
    MenuItem findMenuItemById(String mainMenuName, String menuItemName);
    List<MenuItem> findAllMenuItems();
    void deleteMenuItem(MenuItem menuItem);
    void updateMenuItem(MenuItem menuItem);
}
