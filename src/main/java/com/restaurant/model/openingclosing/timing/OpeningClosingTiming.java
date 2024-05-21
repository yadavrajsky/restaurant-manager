package com.restaurant.model.openingclosing.timing;

import java.time.LocalTime;

import com.restaurant.model.Restaurant;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OpeningClosingTiming {

    @EmbeddedId
    private OpeningClosingTimingId id;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", insertable = false, updatable = false)
    private Restaurant restaurant;

    private LocalTime time;

    // Getters and Setters

    public OpeningClosingTimingId getId() {
        return id;
    }

    public void setId(OpeningClosingTimingId id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.id.setRestaurantId(restaurant.getId());
    }

    public OpeningClosingTimingId.DayOfWeek getDay() {
        return id.getDay();
    }

    public void setDay(OpeningClosingTimingId.DayOfWeek day) {
        this.id.setDay(day);
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
