package com.restaurant.service.interfaces;

import java.util.List;
import java.util.UUID;

import com.restaurant.model.menu.MainMenu;

public interface MainMenuService {
    void registerMainMenu(MainMenu mainMenu);
    MainMenu findMainMenuById(UUID restaurantId, String name);
    List<MainMenu> findAllMainMenus();
    void deleteMainMenu(MainMenu mainMenu);
    void updateMainMenu(MainMenu mainMenu);
}
