package sic.com.nyumbaapp;

public class Item {
    int image;
    int cost;
    String name,location,description, services;

    public Item(int image, int cost, String name, String location, String description, String services) {
        this.image = image;
        this.cost = cost;
        this.name = name;
        this.location = location;
        this.description = description;
        this.services = services;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
}
