package com.restaurant.model;

import java.util.List;
import java.util.UUID;

import com.restaurant.model.menu.MainMenu;
import com.restaurant.model.openingclosing.timing.OpeningClosingTiming;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String name;
    private String location;
    private boolean isDeactivated;
    private boolean valetParking;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OpeningClosingTiming> openingClosingTimings;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MainMenu> mainMenus;

    // Constructors
    public Restaurant() {
    }

    public Restaurant(String name, String location, boolean valetParking) {
        this.name = name;
        this.location = location;
        this.valetParking = valetParking;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isDeactivated() {
        return isDeactivated;
    }

    public void setDeactivated(boolean deactivated) {
        isDeactivated = deactivated;
    }

    public boolean isValetParking() {
        return valetParking;
    }

    public void setValetParking(boolean valetParking) {
        this.valetParking = valetParking;
    }

    public List<OpeningClosingTiming> getOpeningClosingTimings() {
        return openingClosingTimings;
    }

    public void setOpeningClosingTimings(List<OpeningClosingTiming> openingClosingTimings) {
        this.openingClosingTimings = openingClosingTimings;
    }

    public List<MainMenu> getMainMenus() {
        return mainMenus;
    }

    public void setMainMenus(List<MainMenu> mainMenus) {
        this.mainMenus = mainMenus;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", isDeactivated=" + isDeactivated +
                ", valetParking=" + valetParking +
                ", openingClosingTimings=" + openingClosingTimings +
                ", mainMenus=" + mainMenus +
                '}';
    }
}
