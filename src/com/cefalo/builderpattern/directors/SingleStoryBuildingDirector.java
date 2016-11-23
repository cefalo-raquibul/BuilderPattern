package com.cefalo.builderpattern.directors;

import com.cefalo.builderpattern.builders.BuildingBuilder;


/**
 * Created by Raquibul on 11/23/2016.
 */
public class SingleStoryBuildingDirector extends BuildingDirector
{


    @Override
    public void construct(BuildingBuilder builder)
    {
        builder.nameTheBuilding("Single Story Happyyness");
        builder.buildFloors();
        builder.buildRooms(2);
        builder.buildDoors();
        builder.buildWalls("Brick");
        builder.buildWindows("Wood");
        builder.paintWalls("White");

    }
}
