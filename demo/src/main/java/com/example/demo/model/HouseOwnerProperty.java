package com.example.demo.model;


public class HouseOwnerProperty{
    private String propertyOwnerName;
    private String location;
    private int id;

    public String getPropertyOwnerName() {
        return propertyOwnerName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfrooms(int numberOfrooms) {
        this.numberOfrooms = numberOfrooms;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public void setPropertyOwnerName(String propertyOwnerName) {
        this.propertyOwnerName = propertyOwnerName;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfrooms() {
        return numberOfrooms;
    }

    public String getDescription() {
        return description;
    }

    public Feature getFeature() {
        return feature;
    }

    private int numberOfrooms;
    private String description;

    @oneToOne(casade = CasadeType.ALL)
    @JoinColumn(name= "feature_id")
    private Feature feature;


   @OneToMany(
           fetch= FetchType.Lazy,
           casade= CasadeType.ALL
   )


}