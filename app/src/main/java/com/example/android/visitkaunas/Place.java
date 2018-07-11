package com.example.android.visitkaunas;

public class Place {

    //Create private variables

    //Constants of missing variables inputs
    static private final int NO_IMAGE = -1;
    static final private String NO_DESCRIPTION = "";
    static private final String NO_PRICE = "";
    private String name;
    private int placeImageResourceId;
    private String description;
    private String price;
    private String address;


    public Place(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Place(String name, int placeImageResourceId, String address, String price, String description) {
        this.name = name;
        this.placeImageResourceId = placeImageResourceId;
        this.address = address;
        this.price = price;
        this.description = description;
    }

    public String getPlaceName() {
        return name;
    }

    public int getPlaceImageResourceId() {
        return placeImageResourceId;
    }

    public String getPlaceDescription() {
        return description;
    }

    public String getPlacePrice() {
        return price;
    }

    public String getPlaceAddress() {
        return address;
    }

    public boolean hasImage() {
        return placeImageResourceId != NO_IMAGE;
    }

    public boolean hasDescription() {
        return description != NO_DESCRIPTION;
    }

    public boolean hasPlacePrice() {
        return price != NO_PRICE;
    }
}
