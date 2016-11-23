package com.cefalo.builderpattern.builders;


/**
 * Created by Raquibul on 11/23/2016.
 */
public class ThreeStoryBuilder extends BuildingBuilder
{


    @Override
    public void buildFloors()
    {
        building.setFloors("Three floors");
        System.out.println("Building floor by " + ThreeStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildWalls(String material)
    {
        building.setWalls("Walls built with material " + material);
        System.out.println("Building walls by " + ThreeStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildDoors()
    {
        building.setDoors("Doors added");
        System.out.println("Building doors by " + ThreeStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildWindows(String material)
    {
        building.setWindows("Windows added of material: " + material);
        System.out.println("Building windows by " + ThreeStoryBuilder.class.getSimpleName());
    }


    @Override
    public void buildRooms(int numberOfRooms)
    {
        building.setRooms(numberOfRooms + " Rooms added ");
        System.out.println("Building rooms by " + ThreeStoryBuilder.class.getSimpleName());
    }


    @Override
    public void paintWalls(String paintColor)
    {
        building.setPainted("Walls painted in " + paintColor);
        System.out.println("Painting walls by " + ThreeStoryBuilder.class.getSimpleName());
    }


    @Override
    public void nameTheBuilding(String name)
    {
        building.setName(name);
    }


}
