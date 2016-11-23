package com.cefalo.builderpattern.builders;

import com.cefalo.builderpattern.model.Building;


/**
 * Created by Raquibul on 11/23/2016.
 */
public abstract class BuildingBuilder
{
    Building building = new Building();
    abstract public void buildFloors();
    abstract public void buildWalls(String material);
    abstract public void buildDoors();
    abstract public void buildWindows(String material);
    abstract public void buildRooms(int numberOfRooms);
    abstract public void paintWalls(String paintColor);
    abstract public void nameTheBuilding(String name);
    public Building getBuilding(){
        return building;
    }
}
