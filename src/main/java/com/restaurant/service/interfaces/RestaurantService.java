package com.restaurant.service.interfaces;

import java.util.List;
import java.util.UUID;

import com.restaurant.model.Restaurant;

public interface RestaurantService {
    void registerRestaurant(Restaurant restaurant);
    Restaurant findRestaurantById(UUID id);
    List<Restaurant> findAllRestaurants();
    void deleteRestaurant(Restaurant restaurant);
    void updateRestaurant(Restaurant restaurant);
}
