package com.restaurant.model.openingclosing.timing;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID; // Import UUID

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OpeningClosingTimingId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "restaurant_id")
    private UUID restaurantId; // Change type to UUID

    private DayOfWeek day; // Use enum for day

    // Constructors
    public OpeningClosingTimingId() {
    }

    public OpeningClosingTimingId(UUID restaurantId, DayOfWeek day) { // Change constructor parameter to UUID
        this.restaurantId = restaurantId;
        this.day = day;
    }

    // Getters and Setters
    public UUID getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(UUID restaurantId) {
        this.restaurantId = restaurantId;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof OpeningClosingTimingId))
            return false;
        OpeningClosingTimingId that = (OpeningClosingTimingId) o;
        return Objects.equals(getRestaurantId(), that.getRestaurantId()) &&
                Objects.equals(getDay(), that.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRestaurantId(), getDay());
    }

    // Enum for days of the week
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
