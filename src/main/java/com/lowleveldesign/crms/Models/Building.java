package com.lowleveldesign.crms.Models;

import java.util.List;
import java.util.UUID;

public class Building {
    private UUID buildingId;
    private List<Floor> floorsInBuilding; //One to Many
    private String buildingName;


    public UUID getBuildingId(){
        return buildingId;
    }
    public String getBuildingName(){
        return buildingName;
    }
    public List<Floor> getFloorsInBuilding(){
        return floorsInBuilding;
    }
    public void setBuildingId(UUID id){
        buildingId = id;
    }
    public void setBuildingName(String name){
        buildingName = name;
    }
    public void setFloorsInBuilding(List<Floor> floorList){
        floorsInBuilding = floorList;
    }
}
