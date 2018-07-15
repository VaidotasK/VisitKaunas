package com.example.android.visitkaunas;

/**
 * @link Place represents place which user is intrested in and can visit in Kaunas,
 * It contains information of place name, address, ImageResourceId, Price, Description
 * (bacikly woking hours)
 */
public class Place {

    //Create private variables

    /**
     * Constant value if no image is provided (pubs fragment)
     */
    private static final int NO_IMAGE = -1;
    /** Constant value if no description is provided */
    private static final String NO_DESCRIPTION = "";
    /** Constant value if no price is provided ex. for museums */
    private static final String NO_PRICE = "";
    /** Name of the place*/
    private String name;
    /** ImageResourceId of the place*/
    private int placeImageResourceId;

    //Constants of missing variables inputs
    /** Description of the place*/
    private String description;
    /** Price of the place*/
    private String price;
    /** Address of the place*/
    private String address;

    //    For pub Fragment

    /**
     * Creates new Place object which doesn't have Image provided
     *
     * @param name Name of the place
     * @param address Address of the place
     * @param price Price of the place
     * @param description Description of the place, like working hours
     */
    public Place(String name, String address, String price, String description) {
        this.name = name;
        this.placeImageResourceId = NO_IMAGE;
        this.address = address;
        this.price = price;
        this.description = description;
    }

    /**
     * Cretes new Place object
     *
     * @param name Name of the place
     * @param placeImageResourceId ImageResource id of provided image of the place
     * @param address Address of the place
     * @param price Price of the place
     * @param description Description of the place, like working hours
     */
    public Place(String name, int placeImageResourceId, String address, String price, String description) {
        this.name = name;
        this.placeImageResourceId = placeImageResourceId;
        this.address = address;
        this.price = price;
        this.description = description;
    }

    /**
     * @return the name of the place
     */
    public String getPlaceName() {
        return name;
    }

    /**
     * @return Image resource id of provided image of the place
     */
    public int getPlaceImageResourceId() {
        return placeImageResourceId;
    }

    /**
     * @return description of the place
     */
    public String getPlaceDescription() {
        return description;
    }

    /**
     * @return price of the place
     */
    public String getPlacePrice() {
        return price;
    }

    /**
     * @return address of the place
     */
    public String getPlaceAddress() {
        return address;
    }

    /**
     * Return whether or not image is provided
     */
    public boolean hasImage() {
        return placeImageResourceId != NO_IMAGE;
    }

    /**
     * Return whether or not description is provided
     */
    public boolean hasDescription() {
        return description != NO_DESCRIPTION;
    }

    /**
     * Return whether or not price is provided
     */
    public boolean hasPlacePrice() {
        return price != NO_PRICE;
    }
}
