package com.example.mohamed.tourguideapp;

public class ItemTour {
    String itemName;
    String itemAbout;
    int imageId;

    public ItemTour(String itemName, String itemAbout, int imageId) {
        this.itemName = itemName;
        this.itemAbout = itemAbout;
        this.imageId = imageId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemAbout() {
        return itemAbout;
    }

    public void setItemAbout(String itemAbout) {
        this.itemAbout = itemAbout;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}