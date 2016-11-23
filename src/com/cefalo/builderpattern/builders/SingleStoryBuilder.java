package com.cefalo.builderpattern.builders;


/**
 * Created by Raquibul on 11/23/2016.
 */
public class SingleStoryBuilder extends BuildingBuilder
{


    @Override
    public void buildFloors()
    {
        building.setFloors("Single floors");
        System.out.println("Building floor by " + SingleStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildWalls(String material)
    {
        building.setWalls("Walls built with material " + material);
        System.out.println("Building walls by " + SingleStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildDoors()
    {
        building.setDoors("Doors added");
        System.out.println("Building doors by " + SingleStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildWindows(String material)
    {
        building.setWindows("Windows added of material: " + material);
        System.out.println("Building windows by " + SingleStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildRooms(int numberOfRooms)
    {
        building.setRooms(numberOfRooms + " Rooms added ");
        System.out.println("Building rooms by " + SingleStoryBuilder.class.getSimpleName());
    }


    @Override
    public void paintWalls(String paintColor)
    {
        building.setPainted("Walls painted in " + paintColor);
        System.out.println("Painting walls by " + SingleStoryBuilder.class.getSimpleName());
    }


    @Override
    public void nameTheBuilding(String name)
    {
        building.setName(name);
    }


}
