package com.cefalo.builderpattern.directors;

import com.cefalo.builderpattern.builders.BuildingBuilder;


/**
 * Created by Raquibul on 11/23/2016.
 */
public class MultiGlassBuildingDirector extends BuildingDirector
{


    @Override
    public void construct(BuildingBuilder builder)
    {
        builder.nameTheBuilding("Multi Story Scaryness");
        builder.buildFloors();
        builder.buildRooms(8);
        builder.buildDoors();
        builder.buildWalls("Glass");
        builder.buildWindows("Glass");
        //builder.paintWalls("No ");

    }
}
